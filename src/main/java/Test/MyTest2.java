package Test;

import com.weplay.Pojo.User;
import com.weplay.dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;

/**
 * Created by Wenbo on 16/10/21.
 */
public class MyTest2 {
    @Test
    public  void test1()
    {
        //System.out.print(user.getUsername());
        ApplicationContext ctx=null;
        ctx=new ClassPathXmlApplicationContext("classpath:conf/spring-mybatis.xml");

        UserDao userDao=(UserDao) ctx.getBean("userDao");

        User user=null;
        //添加两条数据
        //user.setUserId("d4c774319ad04f38a124c0993fbc1234");
        //userDao.insert(user);
        user = userDao.selectByPrimaryKey("d4c774319ad04f38a124c0993fbc19a9");
        System.out.print(user.getUsername());
    }
}
