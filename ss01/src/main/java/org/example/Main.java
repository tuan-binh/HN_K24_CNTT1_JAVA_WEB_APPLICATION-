package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Bean -> IoC Container
        // Lấy bean ra khỏi IoC Container ?
        ApplicationContext context = new AnnotationConfigApplicationContext(
                // Truyền vào class cấu hình bean
                AppConfig.class
        );

        // Lấy bean thông qua tên bean
        Person minh = context.getBean("videCoding",Person.class);
        System.out.println(minh);
    }
}