import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhoushen
 * @since 2022/3/25
 */
public class Run {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application_context2.xml");
        User bean = context.getBean(User.class);
        bean.setAge(1);
        bean.setUsername("zhoushen");

        System.out.println(bean);

    }
}
