package org.example.ss04.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

// Đánh dấu lớp cấu hình
@Configuration
// Đánh dâu mở web mvc
@EnableWebMvc
// Scan
@ComponentScan(basePackages = "org.example.ss04")
public class AppConfig {
    // lớp cấu hình rất nhiều
    // view
    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver view = new InternalResourceViewResolver();
        // set tiền tố
        view.setPrefix("/views/");
        // set hậu tố
        view.setSuffix(".jsp");
        return view;
    }
    // upload ảnh
}
