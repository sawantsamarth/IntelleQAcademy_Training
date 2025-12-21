package com.example.ioc.constinj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationCon.xml");
        Stud1 st1 = (Stud1) context.getBean("s1");
        System.out.println(st1);
        ((ClassPathXmlApplicationContext) context).close(); 
    }
}
