import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;

@SpringBootTest
public class myTest {
    @Autowired
    DataSource dataSource;

   public void contextLoads(){
       System.out.println(dataSource.getClass());
   }
}
