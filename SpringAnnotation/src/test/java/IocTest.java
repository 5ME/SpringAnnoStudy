import com.ygq.bean.Person;
import com.ygq.config.MainConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;

import java.util.Map;

/**
 * IocTest
 *
 * @author Yin Guiqing
 */
public class IocTest {

    @Test
    public void test01() {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(MainConfig.class);
        String[] beanDefinitionNames =
                applicationContext.getBeanDefinitionNames();
        for (String name : beanDefinitionNames) {
            System.out.println(name);
        }
    }

    @Test
    public void test02() {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(MainConfig.class);

        // 获取操作系统名称
        Environment environment = applicationContext.getEnvironment();
        String osName = environment.getProperty("os.name");
        System.out.println(osName);

        String[] beanNamesForType =
                applicationContext.getBeanNamesForType(Person.class);
        for (String name : beanNamesForType) {
            System.out.println(name);
        }
        Map<String, Person> beansOfType =
                applicationContext.getBeansOfType(Person.class);
        System.out.println(beansOfType);
    }
}
