package com.learn.utils;

public enum AppContextType {
    ANNOTATION_BASED("ANNOTATION"),
    CLASSPATH_BASED("CLASSPATH");

    private String type;

    AppContextType(String type) {
        this.type = type;
    }
}
