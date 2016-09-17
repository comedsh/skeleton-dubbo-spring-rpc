package org.shangyang.dubbo.provider;
import org.shangyang.dubbo.provider.service.DemoServiceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * Start the RPC Exporter by Spring Container.
 * 
 * for simulate the cluster environments
 * 
 * @author 商洋
 *
 */
public class StartApplication2 {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception{
		
		DemoServiceImpl.setClassifier("APPLICATION 2");
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-context-2.xml");
		
		context.start();
		
		System.in.read(); // 按任意键退出
	    
	}
	
}
