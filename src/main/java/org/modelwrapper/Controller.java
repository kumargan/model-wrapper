package org.modelwrapper;


import org.modelwrapper.beans.controller.request.DistributionRequestBean;
import org.modelwrapper.beans.controller.request.GenderDistributionRequestBean;
import org.modelwrapper.beans.controller.response.DistributionResponseBean;
import org.modelwrapper.beans.controller.response.GenderDistributionResponseBean;
import org.modelwrapper.util.CommonUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bnmodel")
public class Controller {
	Logger log = LoggerFactory.getLogger(Controller.class);
	
	  @RequestMapping("/_healthcheck")
	    public String index() {
	        return "ok";
	    }
	  	
	  @RequestMapping(value = "/getDistribution", method = RequestMethod.POST)
	    public DistributionResponseBean getDistribution(@RequestBody DistributionRequestBean request) {
	     return ModelHelper.getModelHelper().execute(request);
	    }
	  
	  @RequestMapping(value = "/genderDistribution", method = RequestMethod.POST)
	    public GenderDistributionResponseBean getDistribution(@RequestBody GenderDistributionRequestBean request) {
	     return ModelHelper.getModelHelper().executeGenderDistribution(request);
	    }
}
