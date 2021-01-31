package com.ygq.config;

import com.ygq.bean.Person;
import com.ygq.condition.LinuxCondition;
import com.ygq.condition.WindowsCondition;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;

/**
 * MainConfig
 * 配置类 == 配置文件
 * <p>
 * 注解 @Configuration 告诉 Spring 这是一个配置类
 * <p>
 * 注解 @ComponentScan 指定组件扫描规则
 * value 指定要扫描的包，excludeFilters 指定排除规则
 *
 * @author Yin Guiqing
 */
@Configuration
@ComponentScan(value = "com.ygq",
        excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION,
                classes = {Controller.class})
        })
public class MainConfig {
    /**
     * 注解 @Bean 在容器中注册一个 bean
     * bean 的类型为返回值类型，id 默认为方法名，可指定 id
     */
    @Bean("YongEn")
    public Person person() {
        return new Person("永恩", 23);
    }

    /*
      @Conditional
      按照一定的条件进行判断，满足条件给容器中注册 bean
     */
    @Bean("Bill")
    @Conditional({WindowsCondition.class})
    public Person person01() {
        return new Person("Bill Gates", 65);
    }

    @Bean("Linus")
    @Conditional({LinuxCondition.class})
    public Person person02() {
        return new Person("Linus Torvalds", 51);
    }
}
