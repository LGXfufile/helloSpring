import com.xin.config.myConfig;
import com.xin.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class myTest {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(myConfig.class);
        User getUser = context.getBean("getUser", User.class);
        System.out.println(getUser.getName());

    }

}
