package site.whatsblog.pojo;

/**
 * <strong>
 * description :
 * </strong>
 * <br/>
 * <p>date : 2022/5/1 15:34</p>
 * <p>site : <a href="https://www.whatsblog.site/">What's Blog.</a></p>
 *
 * @author Suk-Lee
 */
public class Course {
    private int id;
    private String courseName;

    public static Course createCourse(){
        System.out.println("invoke createCourse()");
        return new Course();
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", courseName='" + courseName + '\'' +
                '}';
    }

    public Course(int id, String courseName) {
        this.id = id;
        this.courseName = courseName;
    }

    public Course() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}
