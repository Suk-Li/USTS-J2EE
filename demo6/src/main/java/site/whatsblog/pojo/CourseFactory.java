package site.whatsblog.pojo;

/**
 * <strong>
 * description :
 * </strong>
 * <br/>
 * <p>date : 2022/5/1 15:55</p>
 * <p>site : <a href="https://www.whatsblog.site/">What's Blog.</a></p>
 *
 * @author Suk-Lee
 */
public class CourseFactory {
    public Course createCourse() {
        System.out.println("invoke CourseFactory createCourse()");
        return new Course(203, "Java Programming");//对象已经初始化
    }

}
