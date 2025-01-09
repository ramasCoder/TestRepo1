package com.learn.utils;

public enum ActionType {
    SPRING_ANNOTATION_BASED_VEHICLE_NUMBER_GENERATOR,
    SPRING_XML_BASED_VEHICLE_NUMBER_GENERATOR;
    private String action;

    public String getAction() {
        return action;
    }
}