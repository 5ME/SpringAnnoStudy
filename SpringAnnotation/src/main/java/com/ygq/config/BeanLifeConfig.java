package com.ygq.config;

import com.ygq.bean.Car;
import com.ygq.bean.Cat;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * BeanLifeConfig
 *
 * @author Yin Guiqing
 */
@ComponentScan(basePackages = "com.ygq")
@Configuration
public class BeanLifeConfig {
    @Bean(initMethod = "init", destroyMethod = "destroy")
    public Car car() {
        return new Car();
    }

    @Bean
    public Cat cat() {
        return new Cat();
    }
}
