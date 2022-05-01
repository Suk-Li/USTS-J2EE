package site.whatsblog.participants;

import site.whatsblog.interfaces.Human;
import site.whatsblog.interfaces.Language;

public class Chinese implements Human {
    private int age;
    private Language lan;
    public Chinese() {
    }
    // 构造注入所需要的带参数的构造函数
    public Chinese(Language lan, int age) {
        this.lan = lan;
        this.age = age;
    }
    public void speak() {
        System.out.println(lan.kind() + "age:" + age);
    }
}
