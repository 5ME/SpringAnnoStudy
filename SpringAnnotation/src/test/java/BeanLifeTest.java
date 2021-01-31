import com.ygq.config.BeanLifeConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * BeanLifeTest
 *
 * @author Yin Guiqing
 */
public class BeanLifeTest {
    @Test
    public void test01() {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(BeanLifeConfig.class);
        System.out.println("容器创建完成...");
        context.close();
    }
}
