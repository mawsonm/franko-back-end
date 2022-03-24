package com.franko.diamond.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyAppConfig implements WebMvcConfigurer {

    private String[] theAllowedOrigins;

    @Value("${spring.data.rest.base-path}")
    private String basePath;

    @Override
    public void addCorsMappings(CorsRegistry cors) {
        cors.addMapping(basePath + "/**");
    }
}