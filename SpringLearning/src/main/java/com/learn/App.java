package com.learn;

import com.learn.utils.ActionType;
import com.learn.config.AppConfiguration;
import com.learn.run.Executor;
import com.learn.utils.AppUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {
        String userInp = printMenuAndGetUserInp();
        ActionType actionType = ActionType.valueOf(userInp);

        Executor.run(actionType, args);
    }

    private static String printMenuAndGetUserInp() throws IOException {
        Scanner userInp = new Scanner(System.in);

        System.out.println(AppUtils.readMessageFile());

        return  userInp.nextLine();
    }
}