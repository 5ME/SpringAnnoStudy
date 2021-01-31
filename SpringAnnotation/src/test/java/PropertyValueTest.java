import com.ygq.bean.Person;
import com.ygq.config.PropertyValueConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * PropertyValueTest
 *
 * @author Yin Guiqing
 */
public class PropertyValueTest {
    AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext(PropertyValueConfig.class);

    @Test
    public void test1() {
        // String[] names = context.getBeanDefinitionNames();
        // for (String name : names) {
        //     System.out.println(name);
        // }

        Person jw4 = context.getBean("jw4", Person.class);
        System.out.println(jw4);
    }
}
