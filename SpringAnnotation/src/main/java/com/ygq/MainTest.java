package com.ygq;

import com.ygq.bean.Person;
import com.ygq.config.MainConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * MainTest
 *
 * @author Yin Guiqing
 */
public class MainTest {
    public static void main(String[] args) {
        // XML 配置方式
        // ApplicationContext applicationContext =
        //         new ClassPathXmlApplicationContext("applicationContext.xml");
        // Object person = applicationContext.getBean("person");
        // System.out.println(person);

        // 注解方式
        ApplicationContext applicationContext1 =
                new AnnotationConfigApplicationContext(MainConfig.class);
        Person bean = applicationContext1.getBean(Person.class);
        System.out.println(bean);
        String[] beanNamesForType =
                applicationContext1.getBeanNamesForType(Person.class);
        for (String name : beanNamesForType) {
            System.out.println(name);
        }
    }
}
