package com.learn.utils;

import org.springframework.stereotype.Component;

import java.io.*;

@Component
public class AppUtils {

    public static final String path = "appMenu.txt";

    public static String readMessageFile() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(AppUtils.class.getResourceAsStream(String.format("/%s", path))));
        StringBuffer message = new StringBuffer();
        String line = null;

        while((line = br.readLine())!=null){
            message.append(String.format("%s %n", line));
        }

        return message.toString();
    }
}
