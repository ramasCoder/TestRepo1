package com.learn.action;

import com.learn.domain.VehicleRegistrationNumberGenerator;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class VehicleRegistrationNumberGeneratorAction {

    private VehicleRegistrationNumberGenerator sequenceGen;
    public void execute(ApplicationContext appContext){
        sequenceGen = appContext.getBean("vehicleNumberGenerator", VehicleRegistrationNumberGenerator.class);

        for (int i = 1; i <= 10; i++) {
            System.out.println(sequenceGen.getVehicleRegistrationNumber());
        }
    }
}
