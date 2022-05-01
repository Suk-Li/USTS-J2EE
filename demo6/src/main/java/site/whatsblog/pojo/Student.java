package site.whatsblog.pojo;

import java.util.List;
import java.util.Map;

public class Student {
    private int id;
    private String name;
    private Map<Integer, Course> courses1;
    private List<Course> courses2;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", \n\t\tname='" + name + '\'' +
                ", \n\t\tcourses1=" + courses1 +
                ", \n\t\tcourses2=" + courses2 +
                "\n}";
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCourses1(Map<Integer, Course> courses1) {
        this.courses1 = courses1;
    }

    public void setCourses2(List<Course> courses2) {
        this.courses2 = courses2;
    }

    public String toString2() {
        return "[" + id + ", " + name + "," + courses2 + "]";
    }
}
