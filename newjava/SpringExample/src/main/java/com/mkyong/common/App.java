package com.mkyong.common;

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
    	ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");
    	 
        HelloWorld obj = (HelloWorld) context.getBean("helloBean");
        hi obj1 = (hi) context.getBean("hiBean");
        adi obj2 = (adi) context.getBean("adibean");
        obj.printHello();
        obj1.printHello();
        obj2.printHello();
    

        
    }
}
