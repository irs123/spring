package com.irs;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {	
    	ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
    	vehicle obj = (vehicle) context.getBean("car");
     	vehicle obj1 = (vehicle) context.getBean("bike");
     	
    	obj.derive();
    	obj1.derive();
    }
}
