package org.shangyang.dubbo.consumer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.shangyang.dubbo.provider.api.intf.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"/spring-context.xml"})
public class ConsumerTest{
	
	@Autowired
	DemoService service;
	
	@Test
	public void testConsume0(){
		
		String hello = service.sayHello( "world" ); // do invoke!
		 
        System.out.println( hello ); // cool, how are you~		
		
	}
	
	/**
	 * consume in clusters environments.
	 * 
	 * 启动 provider 的 StartApplication1 和 StartApplication2 两个服务；客户端循环调用接口，查看调用情况。返回的调用应该显示 from Application 1 或者 Application 2
	 * 
	 * Hello Dubbo, Hello world; this is called from APPLICATION 1
	   Hello Dubbo, Hello world; this is called from APPLICATION 2
	   Hello Dubbo, Hello world; this is called from APPLICATION 1
	   Hello Dubbo, Hello world; this is called from APPLICATION 1
	   Hello Dubbo, Hello world; this is called from APPLICATION 2
	   Hello Dubbo, Hello world; this is called from APPLICATION 1
	   Hello Dubbo, Hello world; this is called from APPLICATION 1
	   Hello Dubbo, Hello world; this is called from APPLICATION 1
	   Hello Dubbo, Hello world; this is called from APPLICATION 2
	   Hello Dubbo, Hello world; this is called from APPLICATION 1
	 * 
	 */
	@Test
	public void testConsume1(){
		
		for( int i=0; i<10; i++){
			
			String hello = service.sayHello( "world" ); // do invoke!
			 
	        System.out.println( hello ); // cool, how are you~		
			
		}
		
	}
	
}
