package org.shangyang.dubbo.provider;
import org.shangyang.dubbo.provider.service.DemoServiceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * Start the RPC Exporter by Spring Container.
 * 
 * @author 商洋
 *
 */
public class StartApplciation {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception{
		
		DemoServiceImpl.setClassifier("APPLICATION 1");
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
		
		context.start();
		
		System.in.read(); // 按任意键退出
	    
	}
	
}
