package com.simon.springboot.springbootfirst.secondDemo.current;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SecondMain {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext=new
                AnnotationConfigApplicationContext(SpringConfig.class);

        String[] defNames=applicationContext.getBeanDefinitionNames();
        for(int i=0;i<defNames.length;i++){
            System.out.println(defNames[i]);
        }
    }
}
