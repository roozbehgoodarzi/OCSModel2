package com.ocs.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Goodarzi on 02/02/2015.
 */
public class ContextLoader {
    public static ApplicationContext loadContext(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("testContext.xml");
        return ctx;
    }
    public static Object getBean(Class type){
        return ContextLoader.loadContext().getBean(type);

    }
}
