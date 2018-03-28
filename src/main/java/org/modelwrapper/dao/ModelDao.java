package org.modelwrapper.dao;

import java.util.LinkedList;
import java.util.concurrent.ArrayBlockingQueue;

import org.modelwrapper.beans.model.response.ResponseBean;
import org.modelwrapper.util.CommonUtils;
import org.modelwrapper.util.LRUCache;
import org.modelwrapper.util.WebSocketClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;

public class ModelDao {
	static Logger log = LoggerFactory.getLogger(ModelDao.class);
	private static Object lock = new Object(); 

	private static boolean  initialized = false;
	private static String clientId;
	private static String clientVersion;
	private static WebSocketClient client;
	private static ArrayBlockingQueue<String> shineyResponse = new ArrayBlockingQueue<String>(200);
	private static LRUCache<String, Double> cache = new LRUCache<String, Double>(2000);

	public static void init(){
		try{
//			if(client!=null)
//				client.closeSession();
			client = new WebSocketClient();
			client.sendMessage("{\"method\":\"init\",\"data\":{\"caption\":\"\",\".clientdata_output_value_hidden\":false,\".clientdata_pixelratio\":2,\".clientdata_url_protocol\":\"http:\",\".clientdata_url_hostname\":\"localhost\",\".clientdata_url_port\":\"9999\",\".clientdata_url_pathname\":\"/\",\".clientdata_url_search\":\"\",\".clientdata_url_hash_initial\":\"\",\".clientdata_singletons\":\"\",\".clientdata_allowDataUriScheme\":true}}");
			cleanShineyResponseQueue();
			initialized = true;
		}catch(Exception e){
			log.error("model dao init failed "+e.getMessage());
		}
	}

	public static boolean isInitialized() {
		return initialized;
	}

	public static Double execute(String query){
		
		String response = null;
		boolean resReceived=false;
		//log.info("calling shiney "+query);
		if(cache.containsKey(query))
			return cache.get(query);
		
		synchronized (lock) {
			
			client.sendMessage("{\"method\":\"update\",\"data\":{\"caption\":\"cpquery(bayesNetModel, event = ("+query+"), evidence = TRUE)\"}}");
			//log.info(" calling model "+"cpquery(bayesNetModel, event = ("+query+"), evidence = TRUE)");
			while(!resReceived){
				try{
					String temp = shineyResponse.take();
					response = CommonUtils.getMapper().readValue(temp, ResponseBean.class).getValues().getValue();
					if(!StringUtils.isEmpty(response)){
						resReceived = true;
					}

				}catch(Exception e){
					//try{Thread.sleep(1);}catch(Exception e1){log.error(" call to shiney thread interrupted ");}
					//log.error(" unparseable response from shiney "+shineyResponse+" error"+e.getMessage());
				}

			}
			//cleanShineyResponseQueue();
		}
		
		cache.put(query, Double.valueOf(response));
		log.info("val "+response);
		return Double.valueOf(response);
	}

	private static void cleanShineyResponseQueue() {

		try {
			client.sendMessage("{\"method\":\"update\",\"data\":{\"caption\":\"cpquery(bayesNetModel, event = (country=='lask' & state=='NY'), evidence = TRUE)\"}}");
			boolean resReceived=false;
			//log.info("calling shiney "+q
			String response = null;
			while(!resReceived){
				try{
					String temp = shineyResponse.take();
					response = CommonUtils.getMapper().readValue(temp, ResponseBean.class).getValues().getValue();
					if(!StringUtils.isEmpty(response)){
						resReceived = true;
					}

				}catch(Exception e){
					//try{Thread.sleep(1);}catch(Exception e1){log.error(" call to shiney thread interrupted ");}
					//log.error(" unparseable response from shiney "+shineyResponse);
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static ArrayBlockingQueue<String> getShineyResponse() {
		return shineyResponse;
	}

}
