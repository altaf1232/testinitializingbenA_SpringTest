package com.springcore;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main( String[] args )
    {
        System.out.println( "Hello World!" ); 
        AbstractApplicationContext context=new ClassPathXmlApplicationContext("postconstruct.xml");
        context.registerShutdownHook();

     		 //here is start your first Bean class then name TestSamosa TestSamosa
				
				 TestSamosa testsamosa=(TestSamosa)context.getBean("sAbstract");
				 System.out.println(testsamosa);
				 
		 //here is start your second Bean class then name TestPespsi TestPespsi
			
			  TestPespsi testPespsi= (TestPespsi) context.getBean("pAbstract");
			  System.out.println(testPespsi);
			 
		                       
		 //here is start your third Bean class then  name  TestExample
			
			 TestExample testExample=(TestExample)context.getBean("eAbstract");
			 System.out.println(testExample);
			 
    }
}
