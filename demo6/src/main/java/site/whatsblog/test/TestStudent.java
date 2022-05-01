package site.whatsblog.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import site.whatsblog.pojo.Student;

/**
 * <strong>
 * description :
 * </strong>
 * <br/>
 * <p>date : 2022/5/1 16:24</p>
 * <p>site : <a href="https://www.whatsblog.site/">What's Blog.</a></p>
 *
 * @author Suk-Lee
 */
public class TestStudent {
    public static void main(String[] args) {
        // 创建Spring容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext-3.xml");
        // 从Spring容器中获取Student对象
        Student student = applicationContext.getBean("student", Student.class);
        System.out.println(student);
    }
}
