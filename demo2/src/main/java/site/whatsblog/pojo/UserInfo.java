package site.whatsblog.pojo;

import java.util.Arrays;

/**
 * <strong>
 * description :
 * </strong>
 * <br/>
 * <p>date : 2022/5/1 10:27</p>
 * <p>site : <a href="https://www.whatsblog.site/">What's Blog.</a></p>
 *
 * @author Suk-Lee
 */
public class UserInfo {
    private String name;
    private String password;
    private boolean gender;
    private int age;
    private String province;
    private String[] course;
    private String introduction;

    public UserInfo() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String isGender() {
        return gender ?"男":"女";
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String[] getCourse() {
        return course;
    }

    public void setCourse(String[] course) {
        this.course = course;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public UserInfo(String name, String password, boolean gender, int age, String province, String[] course, String introduction) {
        this.name = name;
        this.password = password;
        this.gender = gender;
        this.age = age;
        this.province = province;
        this.course = course;
        this.introduction = introduction;
    }

    @Override
    public String toString() {
        return "site.whatsblog.pojo.UserInfo{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", province='" + province + '\'' +
                ", course='" + Arrays.toString(course) + '\'' +
                ", introduction='" + introduction + '\'' +
                '}';
    }
}
