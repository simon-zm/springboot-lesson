package com.simon.springboot.springbootfirst.fouthDemo;

import com.gupaoedu.core.GupaoCore;
import com.simon.springboot.springbootfirst.thirdDemo.EnableDemoMain;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class FouthMain {

    public static void main(String[] args) {
        ConfigurableApplicationContext ca= SpringApplication.run(EnableDemoMain.class,args);

        System.out.println(ca.getBean(GupaoCore.class).study());
    }
}
