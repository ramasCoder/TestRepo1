package com.learn.domain;

import java.time.LocalDate;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

public class VehicleRegistrationNumberGenerator{
    private int registrationNumber;
    private String twoAlphabetSuffix;

    public String getVehicleRegistrationNumber(){
        return String.format("%s %s %s %s", this.getyearOfRegistration(), "BH", getRegistrationNumber(), getTwoAlphabetSuffix());
    }

    private Integer getyearOfRegistration(){
        return LocalDate.now().getYear()%100;
    }

    private String getRegistrationNumber(){
        registrationNumber = (registrationNumber%9999) + 1;
        String regNum = "000" + registrationNumber;

        return regNum.substring(regNum.length()-4);
    }

    private String getTwoAlphabetSuffix(){
        int firstChar = 65, secondChar = 65;

        if(Objects.isNull(this.twoAlphabetSuffix)){
            this.twoAlphabetSuffix = "AA";
        }
        else{
            firstChar = twoAlphabetSuffix.charAt(0);
            secondChar = twoAlphabetSuffix.charAt(1);

            secondChar++;

            if(secondChar>97){
                secondChar = 65;
                firstChar++;

                if(firstChar>97)
                    firstChar = 0;
            }
        }

        return "" + (char)firstChar + (char)secondChar;
    }

    public void setTwoAlphabetSuffix(String twoAlphabetSuffix) {
        this.twoAlphabetSuffix = twoAlphabetSuffix;
    }
}