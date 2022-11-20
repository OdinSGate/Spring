import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        Object bean1 = applicationContext.getBean("helloworld");
        Object bean2 = applicationContext.getBean("helloworld");
        Object cat1 = applicationContext.getBean("cat");
        Object cat2 = applicationContext.getBean("cat");
        System.out.println(bean1 == bean2);
        System.out.println(cat1 == cat2);
    }
}