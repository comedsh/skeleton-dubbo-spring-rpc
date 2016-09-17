package org.shangyang.dubbo.provider.service;

import org.shangyang.dubbo.provider.api.intf.DemoService;

public class DemoServiceImpl implements DemoService{

	public static String CLASSIFIER = "APPLICATION 1";
	
	@Override
	public String sayHello(String name) {

		return "Hello Dubbo, Hello " + name + "; this is called from " + CLASSIFIER;  
	
	}	
	
	public static void setClassifier(String value){
		
		CLASSIFIER = value;
		
	}
	
}
