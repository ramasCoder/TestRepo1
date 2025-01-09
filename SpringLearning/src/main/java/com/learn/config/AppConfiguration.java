package com.learn.config;

import com.learn.domain.VehicleRegistrationNumberGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {

    @Bean
    public VehicleRegistrationNumberGenerator vehicleNumberGenerator(){
        VehicleRegistrationNumberGenerator vehicleNumGen = new VehicleRegistrationNumberGenerator();
        vehicleNumGen.setTwoAlphabetSuffix("AA");

        return vehicleNumGen;
    }
}
