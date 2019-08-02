package org.modelwrapper.util;

import java.io.IOException;
import java.net.URI;
import javax.websocket.ClientEndpoint;
import javax.websocket.ContainerProvider;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.WebSocketContainer;

import org.modelwrapper.dao.ModelDao;
import org.springframework.util.StringUtils;

@ClientEndpoint
public class WebSocketClientWithAuth {
	private final String uri="ws://someserver:8861/";
	private Session session;


	public WebSocketClientWithAuth(){
		try{
		  System.out.println(" opening web socket to rupee seed ");
			WebSocketContainer container=ContainerProvider.
					getWebSocketContainer();
			container.connectToServer(this, new URI(uri));
			System.out.println(" opening web socket to rupee seed ");

		}catch(Exception ex){
			System.out.println(" error while opening web socket ::::::: "+ex.getMessage()+" :::::::::: "+CommonUtils.getString(ex.getStackTrace()));
		}
	}

	@OnOpen
	public void onOpen(Session session){
		this.session=session;
	}

	@OnMessage
	public void onMessage(String message, Session session){
		System.out.println(message);
		//ModelDao.getShineyResponse().offer(message);
	}

	public void sendMessage(String message){
		try {
			session.getBasicRemote().sendText(message);
		} catch (IOException ex) {

		}
	}

	public void closeSession(){
		try {session.close();}catch(Exception e){}
	}

}