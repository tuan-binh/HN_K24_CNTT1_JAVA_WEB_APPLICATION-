package org.example.dependency_injection;

import org.example.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TinderApp {
    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(
                        AppConfig.class
                );

        GirlFriend girlFriend = context.getBean("girlFriend", GirlFriend.class);
        girlFriend.seen();
        girlFriend.block();
    }
}
