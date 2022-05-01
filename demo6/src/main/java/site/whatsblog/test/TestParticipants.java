package site.whatsblog.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import site.whatsblog.participants.Chinese;
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
public class TestParticipants {
    public static void main(String[] args) {
        // 创建Spring容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext-2.xml");
        // 获取Chinese对象
        Chinese chinese = applicationContext.getBean("chinese", Chinese.class);
        chinese.speak();
    }
}
