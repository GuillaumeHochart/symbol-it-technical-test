package com.symbolIt.excuseDev.excuseDev.configuration;

import com.symbolIt.excuseDev.excuseDev.model.MessagesResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfiguration {

    @Bean
    public MessagesResolver globalData(){
        return new MessagesResolver();
    }
}
