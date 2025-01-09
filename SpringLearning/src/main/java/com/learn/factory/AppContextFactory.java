package com.learn.factory;

import com.learn.config.AppConfiguration;
import com.learn.utils.AppContextType;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppContextFactory {
    private static ApplicationContext appContext = null;

    public static ApplicationContext getAppContext(AppContextType type){

        switch(type){
            case ANNOTATION_BASED ->  appContext = new AnnotationConfigApplicationContext(AppConfiguration.class);
            case CLASSPATH_BASED -> appContext = new ClassPathXmlApplicationContext("configs/spring.xml");
        }
       
        return appContext;
    }
}