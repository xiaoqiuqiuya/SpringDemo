import com.nice.controller.StuController;
import com.nice.daoImpl.UserDaoImpl;
import com.nice.po.User;
import com.nice.serviceImpl.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test1 {

    @Test
    public void test1() {
        UserDaoImpl UserDaoImpl = new UserDaoImpl();
        UserDaoImpl.save();

//        ApplicationContext app = new FileSystemXmlApplicationContext("E:\\javaDemo\\ToGithub\\SpringDemo2\\SpringDemo2\\src\\main\\resources\\applicationContext.xml");
//        User user = (User)app.getBean("user");
//        user.play();
    }

    @Test
    public void test2() {
        ApplicationContext app = new FileSystemXmlApplicationContext("E:\\javaDemo\\ToGithub\\SpringDemo2\\SpringDemo2\\src\\main\\resources\\applicationContext.xml");
        User user = (User) app.getBean("user");
        user.play();
    }

    @Test//构造方法注入
    public void test3(){
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserServiceImpl userServiceImpl = (UserServiceImpl) app.getBean("myService");
        userServiceImpl.save();
    }


    @Test//使用setter方法注入
    public void test4(){
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserServiceImpl userServiceImpl = (UserServiceImpl) app.getBean("myService");
        userServiceImpl.save();
    }

    @Test//bean的注解方式
    public void test5(){
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        StuController stuController = (StuController)app.getBean("stuController");
        stuController.save();
    }


}
