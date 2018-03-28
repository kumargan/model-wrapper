package org.modelwrapper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;

import org.modelwrapper.beans.controller.request.Brand;
import org.modelwrapper.beans.controller.request.DistributionRequestBean;
import org.modelwrapper.beans.controller.request.GenderDistributionRequestBean;
import org.modelwrapper.beans.controller.request.Options;
import org.modelwrapper.beans.controller.response.Age;
import org.modelwrapper.beans.controller.response.BrandId;
import org.modelwrapper.beans.controller.response.Country;
import org.modelwrapper.beans.controller.response.DistributionResponseBean;
import org.modelwrapper.beans.controller.response.Gender;
import org.modelwrapper.beans.controller.response.GenderDistributionResponseBean;
import org.modelwrapper.beans.controller.response.MetroCode;
import org.modelwrapper.beans.controller.response.Os;
import org.modelwrapper.beans.controller.response.State;
import org.modelwrapper.beans.controller.response.T1;
import org.modelwrapper.beans.controller.response.Version;
import org.modelwrapper.dao.ModelDao;
import org.modelwrapper.util.CommonUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ModelHelper {
	static Logger log = LoggerFactory.getLogger(ModelHelper.class);
	private static ModelHelper modelHelper= new ModelHelper();

	private ArrayList<String> taxonomies = new ArrayList<String>();
	private ArrayList<String> brands = new ArrayList<String>();
	private ArrayList<String> countries = new ArrayList<String>();
	private ArrayList<String> metroCodes = new ArrayList<String>();
	private ArrayList<String> operatingSystems = new ArrayList<String>();
	private ArrayList<String> states = new ArrayList<String>();
	private ArrayList<String> versions = new ArrayList<String>();
	private ArrayList<String> ages = new ArrayList<String>();
	private ArrayList<String> genders = new ArrayList<String>();


	public boolean init(){
		boolean response = true;
		InputStream in = getClass().getResourceAsStream("/Feature_LabelValue_mapping.csv");
		BufferedReader reader = new BufferedReader(new InputStreamReader( in ));

		String line;
		try {
			line = reader.readLine();
			while (line != null) {
				String[] attributes = line.split(","); 
				switch(attributes[0].replace("\"", "")){
				case "os" : operatingSystems.add(attributes[1].replace("\"", ""));
				break;
				case "version" : versions.add(attributes[1].replace("\"", ""));
				break;
				case "country" : countries.add(attributes[1].replace("\"", ""));
				break;
				case "state" : states.add(attributes[1].replace("\"", ""));
				break;
				case "metro_code" : metroCodes.add(attributes[1].replace("\"", ""));
				break;
				case "brand_id" : brands.add(attributes[1].replace("\"", ""));
				break;
				case "T1" : taxonomies.add(attributes[1].replace("\"", ""));
				break;
				case "age" : ages.add(attributes[1].replace("\"", ""));
				break;
				case "gender" : genders.add(attributes[1].replace("\"", ""));
				break;
				default :
				}
				line = reader.readLine();
			}
			response = false;
		} catch (IOException e) {
			log.error(" error while loading Feature_LabelValue_mapping.csv "+e.getMessage());
		} 

		return response;
	}

	private String createFilters(Options options){
		log.info(CommonUtils.getString(options));
		String filter = "";//country=='US' & state=='NY'

		if(options.getOs() != null && options.getOs().size() >0){
			String osFilter = "& ( ";
			for(String os: options.getOs())
				osFilter+=" os=='"+os+"' |";
			osFilter = osFilter.substring(0,osFilter.length()-1);
			osFilter+=") ";
			filter+=osFilter;
		}

		if(options.getVersion() != null && options.getVersion().size() > 0){
			String versionFilter = "& (";
			for(String version: options.getVersion())
				versionFilter+=" version=='"+version+"' |";
			versionFilter = versionFilter.substring(0,versionFilter.length()-1);
			versionFilter+=") ";
			filter+=versionFilter;
		}

		if(options.getCountry() != null && options.getCountry().size() > 0){
			String countryFilter = "& (";
			for(String country: options.getCountry())
				countryFilter+=" country=='"+country+"' |";
			countryFilter = countryFilter.substring(0,countryFilter.length()-1);
			countryFilter+=") ";
			filter+=countryFilter;
		}

		if(options.getState() != null && options.getState().size() > 0){
			String stateFilter = "& (";
			for(String state: options.getState())
				stateFilter+=" state=='"+state+"' |";
			stateFilter = stateFilter.substring(0,stateFilter.length()-1);
			stateFilter+=") ";
			filter+=stateFilter;
		}

		if(options.getMetroCode() != null && options.getMetroCode().size() > 0){
			String metroFilter = "& (";
			for(String metro: options.getMetroCode())
				metroFilter+=" metro=='"+metro+"' |";
			metroFilter = metroFilter.substring(0,metroFilter.length()-1);
			metroFilter+=") ";
			filter+=metroFilter;
		}

		if(options.getBrandId() != null && options.getBrandId().size() > 0){
			String brandFilter = "& (";
			for(String brand: options.getBrandId())
				brandFilter+=" brand=='"+brand+"' |";
			brandFilter = brandFilter.substring(0,brandFilter.length()-1);
			brandFilter+=") ";
			filter+=brandFilter;
		}

		if(options.getT1() != null && options.getT1().size() > 0){
			String taxonomyFilter = "& (";
			for(String taxonomy: options.getT1())
				taxonomyFilter+=" taxonomy=='"+taxonomy+"' |";
			taxonomyFilter = taxonomyFilter.substring(0,taxonomyFilter.length()-1);
			taxonomyFilter+=") ";
			filter+=taxonomyFilter;
		}

		if(options.getGender() != null && options.getGender().size() > 0){
			String osFilter = "& (";
			for(String gender: options.getGender())
				osFilter+=" gender=='"+gender+"' |";
			osFilter = osFilter.substring(0,osFilter.length()-1);
			osFilter+=") ";
			filter+=osFilter;
		}

		if(options.getAge() != null && options.getAge().size() > 0){
			String ageFilter = "& (";
			for(String age: options.getAge())
				ageFilter+=" age=='"+age+"' |";
			ageFilter = ageFilter.substring(0,ageFilter.length()-1);
			ageFilter+=") ";
			filter+=ageFilter;
		}

		return filter;
	}

	public DistributionResponseBean execute(DistributionRequestBean request){
		DistributionResponseBean response = new DistributionResponseBean();
		response.setStatus("OK");

		try{
			//create filter for model query
			String filter = createFilters(request.getOptions());

			//get distributions for the following ( "os";"version";"country";"state";"metro_code";"brand_id";"T1";"gender";"age" )
			int uidCount = Integer.valueOf(request.getPageviews());
			for(String type : request.getTypes()){
				switch(type){
				case "os" : response.setOs(getOsDistribution(filter,uidCount));
				break;
				case "version" : response.setVersion(getVersionDistribution(filter,uidCount));
				break;
				case "country" : response.setCountry(getCountryDistribution(filter,uidCount));
				break;
				case "state" : response.setState(getStateDistribution(filter,uidCount));
				break;
				case "metro_code" : response.setMetroCode(getMetroCodeDistribution(filter,uidCount));
				break;
				case "brand_id" : response.setBrandId(getBrandIdDistribution(filter,uidCount));
				break;
				case "T1" : response.setT1(getTaxonomyDistribution(filter,uidCount));
				break;
				case "gender" : response.setGender(getGenderDistribution(filter,uidCount));
				break;
				case "age" : response.setAge(getAgeDistribution(filter,uidCount));
				break;
				default :
				}
			}


		}catch(Exception e){
			log.error(" exception while populating distributions "+e.getMessage());
		}
		return response;
	}

	private Age getAgeDistribution(String filter, int uidCount) {
		Age age = new Age();
		String annotationValue = null;
		String[] antemp = null;
		String name = null;

		for(Method method : age.getClass().getDeclaredMethods()){
			name = method.getName();
			Annotation[] annotations = method.getDeclaredAnnotations();
			if(name.startsWith("set")){
				antemp = annotations[0].toString().split("value=");
				if(antemp.length > 1){
					annotationValue = antemp[1].split(",")[0];
					if( ages.contains(annotationValue))

						try {
							int value = (int)(uidCount*ModelDao.execute("age=='"+annotationValue+"' "+filter));
							//log.info(" "+annotationValue+" "+value);
							method.invoke(age, value);
						} catch (Exception e) {
							log.error(" error while invoking method on version obj "+e.getMessage());
						} 
				}
			}
		}
		return age;
	}

	private Gender getGenderDistribution(String filter, int uidCount) {
		Gender gender = new Gender();
		String annotationValue = null;
		String[] antemp = null;
		String name = null;

		for(Method method : gender.getClass().getDeclaredMethods()){
			name = method.getName();
			Annotation[] annotations = method.getDeclaredAnnotations();
			if(name.startsWith("set")){
				antemp = annotations[0].toString().split("value=");
				if(antemp.length > 1){
					annotationValue = antemp[1].split(",")[0];
					if( genders.contains(annotationValue))

						try {
							int value = (int)(uidCount*ModelDao.execute("gender=='"+annotationValue+"' "+filter));
							//log.info(" "+annotationValue+" "+value);
							method.invoke(gender,value);
						} catch (Exception e) {
							log.error(" error while invoking method on version obj "+e.getMessage());
						} 
				}
			}
		}
		return gender;
	}

	private T1 getTaxonomyDistribution(String filter, int uidCount) {
		T1 taxonomy = new T1();
		String annotationValue = null;
		String[] antemp = null;
		String name = null;

		for(Method method : taxonomy.getClass().getDeclaredMethods()){
			name = method.getName();
			Annotation[] annotations = method.getDeclaredAnnotations();
			if(name.startsWith("set")){
				antemp = annotations[0].toString().split("value=");
				if(antemp.length > 1){
					annotationValue = antemp[1].split(",")[0];
					if( taxonomies.contains(annotationValue))

						try {
							int value = (int)(uidCount*ModelDao.execute("T1=='"+annotationValue+"' "+filter));
							//log.info(" "+annotationValue+" "+value);
							method.invoke(taxonomy, value);
						} catch (Exception e) {
							log.error(" error while invoking method on version obj "+e.getMessage());
						} 
				}
			}
		}

		return taxonomy;
	}

	private BrandId getBrandIdDistribution(String filter, int uidCount) {
		BrandId brandid = new BrandId();
		String annotationValue = null;
		String[] antemp = null;
		String name = null;

		for(Method method : brandid.getClass().getDeclaredMethods()){
			name = method.getName();
			Annotation[] annotations = method.getDeclaredAnnotations();
			if(name.startsWith("set")){
				antemp = annotations[0].toString().split("value=");
				if(antemp.length > 1){
					annotationValue = antemp[1].split(",")[0];
					if( brands.contains(annotationValue))

						try {
							int value = (int)(uidCount*ModelDao.execute("brand_id=='"+annotationValue+"' "+filter));
							method.invoke(brandid, value);
							//log.info(" value for annotationValue "+annotationValue+" model val "+value);
						} catch (Exception e) {
							log.error(" error while invoking method on brandid obj "+e.getMessage());
						} 
				}
			}
		}
		return brandid;
	}

	private MetroCode getMetroCodeDistribution(String filter, int uidCount) {
		MetroCode metroCode = new MetroCode();
		String annotationValue = null;
		String[] antemp = null;
		String name = null;

		for(Method method : metroCode.getClass().getDeclaredMethods()){
			name = method.getName();
			Annotation[] annotations = method.getDeclaredAnnotations();
			if(name.startsWith("set")){
				antemp = annotations[0].toString().split("value=");
				if(antemp.length > 1){
					annotationValue = antemp[1].split(",")[0];
					if( metroCodes.contains(annotationValue))

						try {
							int value = (int)(uidCount*ModelDao.execute("metro_code=='"+annotationValue+"' "+filter));
							//log.info(" "+annotationValue+" "+value);
							method.invoke(metroCode, value);

						} catch (Exception e) {
							log.error(" error while invoking method on metrocode obj "+e.getMessage());
						} 
				}
			}
		}
		return metroCode;
	}

	private State getStateDistribution(String filter, int uidCount) {
		State state = new State();
		String annotationValue = null;
		String[] antemp = null;
		String name = null;

		for(Method method : state.getClass().getDeclaredMethods()){
			name = method.getName();
			Annotation[] annotations = method.getDeclaredAnnotations();
			if(name.startsWith("set")){
				antemp = annotations[0].toString().split("value=");
				if(antemp.length > 1){
					annotationValue = antemp[1].split(",")[0];
					if( states.contains(annotationValue))

						try {
							int value = (int)(uidCount*ModelDao.execute("state=='"+annotationValue+"' "+filter));
							//log.info(" "+annotationValue+" "+value);
							method.invoke(state, value);
						} catch (Exception e) {
							log.error(" error while invoking method on state obj "+e.getMessage());
						} 
				}
			}
		}
		return state;
	}

	private Country getCountryDistribution(String filter, int uidCount) {
		Country country = new Country();
		String annotationValue = null;
		String[] antemp = null;
		String name = null;

		for(Method method : country.getClass().getDeclaredMethods()){
			name = method.getName();
			Annotation[] annotations = method.getDeclaredAnnotations();
			if(name.startsWith("set")){
				antemp = annotations[0].toString().split("value=");
				if(antemp.length > 1){
					annotationValue = antemp[1].split(",")[0];
					if( countries.contains(annotationValue))

						try {
							int value = (int)(uidCount*ModelDao.execute("country=='"+annotationValue+"' "+filter));
							//log.info(" "+annotationValue+" "+value);
							method.invoke(country, value);
						} catch (Exception e) {
							log.error(" error while invoking method on country obj "+e.getMessage());
						} 
				}
			}
		}
		return country;
	}

	private Version getVersionDistribution(String filter, int uidCount) {
		Version version = new Version();
		String annotationValue = null;
		String[] antemp = null;
		String name = null;

		for(Method method : version.getClass().getDeclaredMethods()){
			name = method.getName();
			Annotation[] annotations = method.getDeclaredAnnotations();
			if(name.startsWith("set")){
				antemp = annotations[0].toString().split("value=");
				if(antemp.length > 1){
					annotationValue = antemp[1].split(",")[0];
					if( versions.contains(annotationValue))

						try {
							int value = (int)(uidCount*ModelDao.execute("version=='"+annotationValue+"' "+filter));
							//log.info(" "+annotationValue+" "+value);
							method.invoke(version, value);
						} catch (Exception e) {
							log.error(" error while invoking method on version obj "+e.getMessage());
						} 
				}
			}
		}
		return version;
	}

	private Os getOsDistribution(String filter, int uidCount) {
		Os os = new Os();
		String annotationValue = null;
		String[] antemp = null;
		String name = null;

		for(Method method : os.getClass().getDeclaredMethods()){
			name = method.getName();
			Annotation[] annotations = method.getDeclaredAnnotations();
			if(name.startsWith("set")){
				antemp = annotations[0].toString().split("value=");
				if(antemp.length > 1){
					annotationValue = antemp[1].split(",")[0];
					if( operatingSystems.contains(annotationValue))

						try {
							int value = (int)(uidCount*ModelDao.execute("os=='"+annotationValue+"' "+filter));
							//log.info(" "+annotationValue+" "+value);
							method.invoke(os, value);
						} catch (Exception e) {
							log.error(" error while invoking method on version obj "+e.getMessage());
						} 
				}
			}
		}
		return os;
	}

	public static ModelHelper getModelHelper() {
		return modelHelper;
	}

	public static void setModelHelper(ModelHelper modelHelper) {
		ModelHelper.modelHelper = modelHelper;
	}

	public GenderDistributionResponseBean executeGenderDistribution(GenderDistributionRequestBean request) {
		log.info("request "+CommonUtils.getString(request));
		GenderDistributionResponseBean response = new GenderDistributionResponseBean();
		Gender gender =  new Gender();
		response.setStatus("OK");

		try{
			//create filter for model query
			String filter = createFilters(request.getOptions());

			//get distributions for the following ( "gender" )
			double[] p = new double[request.getBrands().size()*3+1];
			char[] genders = {'1','2','U'};
			System.out.println("filter substring "+filter.substring(2));
			p[0] = ModelDao.execute(filter.substring(1));

			int i=1;
			//calculate P(brand|male),P(brand|female),P(brand|unknown)
			for(Brand brand:request.getBrands()){
				for(int j=0;j<3;j++)
					if(j!=2)
						p[i++] = ModelDao.execute("(gender=='"+genders[j]+"') &"+" (brand_id=='"+brand.getLabel()+"') "+filter);
					else
						p[i++] = ModelDao.execute("(gender=='NULL' | "+" gender=='"+genders[j]+"') &"+" (brand_id=='"+brand.getLabel()+"') "+filter);
			}
			i=1;
			double totalMaleProbability = 0;
			double totalFemaleProbability = 0;
			double totalUnknownProbability = 0;
			//p(brand|Male) for all brands in request
			for(Brand brand:request.getBrands()){
				double base = 0;
				for(int j=0;j<3;j++){
					base += p[i++];
				}
				totalMaleProbability += (p[i-3]/base)* brand.getValue();//male
				totalFemaleProbability += (p[i-2]/base)* brand.getValue();//female
				totalUnknownProbability += (p[i-1]/base)*	brand.getValue();//unknown
			}
			
			gender.set1( new Double((totalMaleProbability)*p[0]).intValue() );
			gender.set2( new Double((totalFemaleProbability)*p[0]).intValue() );
			gender.setO( new Double((totalUnknownProbability)*p[0]).intValue() );
			
			response.setGender(gender);
			
		}catch(Exception e){
			e.printStackTrace();
			log.error(" exception while populating distributions "+e.getMessage());
		}
		return response;
	}

}
