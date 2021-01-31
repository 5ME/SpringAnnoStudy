package com.ygq.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * Cat
 *
 * @author Yin Guiqing
 */
public class Cat implements InitializingBean, DisposableBean {
    public Cat() {
        System.out.println("Cat constructor...");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Cat destroy...");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Cat afterPropertiesSet...");
    }
}
