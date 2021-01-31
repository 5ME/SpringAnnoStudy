package com.ygq.config;

import com.ygq.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * PropertyValueConfig
 *
 * @author Yin Guiqing
 */
@Configuration
public class PropertyValueConfig {
    @Bean("jw4")
    public Person person() {
        return new Person("嘉文四世", 25);
    }
}
