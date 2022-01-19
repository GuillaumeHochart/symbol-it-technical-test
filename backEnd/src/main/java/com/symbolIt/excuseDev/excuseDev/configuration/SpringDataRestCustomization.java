package com.symbolIt.excuseDev.excuseDev.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class SpringDataRestCustomization implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("*")
                .allowedMethods("POST", "PUT", "GET", "DELETE", "OPTIONS")
                .allowedHeaders("Content-Type", "Origin")
                .exposedHeaders("X-Total-Count", "Location", "Access-Control-Allow-Origin")
                .allowCredentials(false)
                .maxAge(6000);
    }
}
