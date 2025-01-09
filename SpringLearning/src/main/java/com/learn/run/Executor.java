package com.learn.run;

import com.learn.action.VehicleRegistrationNumberGeneratorAction;
import com.learn.factory.AppContextFactory;
import com.learn.utils.ActionType;
import com.learn.utils.AppContextType;
import org.springframework.context.ApplicationContext;

public class Executor {
    public static void run(ActionType actionType, String... userInp){
        switch(actionType){
            case SPRING_ANNOTATION_BASED_VEHICLE_NUMBER_GENERATOR -> {
                new VehicleRegistrationNumberGeneratorAction().execute(AppContextFactory.getAppContext(AppContextType.ANNOTATION_BASED));
            }
            case SPRING_XML_BASED_VEHICLE_NUMBER_GENERATOR -> {
                new VehicleRegistrationNumberGeneratorAction().execute(AppContextFactory.getAppContext(AppContextType.CLASSPATH_BASED));
            }
            default -> System.out.println("No Action");
        }
    }
}
