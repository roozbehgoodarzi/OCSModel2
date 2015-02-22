package com.ocs.util;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.WebApplicationContext;

/**
 * Created by Goodarzi on 02/02/2015.
 */
public class SpringFacade {
    private static ClassPathXmlApplicationContext applicationContext;
    private static WebApplicationContext webApplicationContext;
    private static Log log = LogFactory.getLog(SpringFacade.class);

    public SpringFacade() {
    }
    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    public static WebApplicationContext getWebApplicationContext() {
        return webApplicationContext;
    }

    public static void setWebApplicationContext(WebApplicationContext var0) {
        webApplicationContext = var0;
    }


    public static void initApplicationContext() {
        try {
            applicationContext = new ClassPathXmlApplicationContext("spring.xml");
            log.warn("All Server Startted Successfully...");
        } catch (BeansException var1) {
            log.error(var1);
            var1.printStackTrace();
            throw var1;
        }
    }

    public static void initApplicationContext(String var0) {
        try {
            applicationContext = new ClassPathXmlApplicationContext(var0);
        } catch (BeansException var2) {
            log.error(var2);
            var2.printStackTrace();
            throw var2;
        }
    }
    public static void initApplicationContext(ClassPathXmlApplicationContext var0, String var1) {
        try {
            applicationContext = new ClassPathXmlApplicationContext(new String[]{var1}, var0);
        } catch (BeansException var3) {
            log.error(var3);
            var3.printStackTrace();
            throw var3;
        }
    }
    public static ApplicationContext getParent() {
        return applicationContext.getParent();
    }

    public static Object getBean(String var0) {
        return applicationContext != null?applicationContext.getBean(var0):(webApplicationContext != null?webApplicationContext.getBean(var0):null);
    }
}
