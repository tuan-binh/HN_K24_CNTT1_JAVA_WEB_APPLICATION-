package org.example;

import org.example.dependency_injection.BoyFriend;
import org.example.dependency_injection.GirlFriend;
import org.example.dependency_injection.impl.BoyFriendImpl;
import org.example.dependency_injection.impl.GirlFriendImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.example")
public class AppConfig {

//    @Bean
//    // nếu không ghi tên thì lấy tên phước thức làm tên luôn
//    public Person videCoding() {
//        Person nguyenNhatMinh = new Person();
//        nguyenNhatMinh.setName("Nguyễn Nhật Minh");
//        nguyenNhatMinh.setAge(20);
//        nguyenNhatMinh.setGender(false);
//        return nguyenNhatMinh;
//    }
//
    @Bean
    public BoyFriend boyFriend() {
        return new BoyFriendImpl();
    }

    @Bean
    public GirlFriend girlFriend() {
        return new GirlFriendImpl();
    }

}
