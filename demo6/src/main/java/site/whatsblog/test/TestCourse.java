package site.whatsblog.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import site.whatsblog.pojo.Course;

/**
 * <strong>
 * description :
 * </strong>
 * <br/>
 * <p>date : 2022/5/1 15:42</p>
 * <p>site : <a href="https://www.whatsblog.site/">What's Blog.</a></p>
 *
 * @author Suk-Lee
 */
public class TestCourse {
    public static void main(String[] args) {
        // 创建Spring容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 从Spring容器中获取空参构造的Course对象
        Course noArgsCourse = applicationContext.getBean("course", Course.class);
        // 从Spring容器中获取set注入的Course对象
        Course setInjectCourse = applicationContext.getBean("course1", Course.class);
        // 从Spring容器中获取静态工厂方法生产的Course对象
        Course factoryGeneratedCourse = applicationContext.getBean("course2", Course.class);
        // 从Spring容器中获取工厂生产的Course对象
        Course factoryCourse = applicationContext.getBean("course3", Course.class);
        // 输出
        System.out.println(noArgsCourse);
        System.out.println(setInjectCourse);
        System.out.println(factoryGeneratedCourse);
        System.out.println(factoryCourse);
    }
}
