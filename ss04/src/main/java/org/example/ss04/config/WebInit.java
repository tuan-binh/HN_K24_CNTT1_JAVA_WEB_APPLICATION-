package org.example.ss04.config;

import org.jspecify.annotations.Nullable;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebInit extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?> @Nullable [] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    // Đọc những lớp cấu hình của hệ thống
    // Bean view + Bean Thymeleaf + Bean Hibernate
    protected Class<?> @Nullable [] getServletConfigClasses() {
        return new Class[]{AppConfig.class};
    }

    @Override
    // Cấu hình URL
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
