package practice11;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;

public class Teacher extends Person {


    private HashSet<Klass> classes = null;

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public Teacher(int id, String name, int age, HashSet<Klass> classes) {
        super(id , name, age);
        this.classes = classes;

        // register to be observer of Klass
        for (Klass c: classes) {
            c.addTeacherObs(this);
        }
    }

    public HashSet<Klass> getClasses() {
        return classes;
    }

    public void setClasses(HashSet<Klass> classes) {
        this.classes = classes;
    }

    public String introduce() {
        StringBuilder res = new StringBuilder(super.introduce());
        res.append(" I am a Teacher. I teach ");
        if (classes != null && classes.size() > 0) {
            res.append("Class ");
            Klass[] arr = classes.toArray(new Klass[classes.size()]);

            // 按 班级号 重新排序
            Arrays.sort(arr, (o1, o2) -> o1.getNumber() - o2.getNumber());

            for (int i = 0; i < arr.length;  i++) {
                res.append(arr[i] + ", ");
            }

            res.replace(res.length()-2, res.length(), ".");
        } else {
            res.append("No Class.");
        }

        return res.toString();
    }

    public boolean isTeaching(Student s) {
        for (Klass c : classes) {
            if(c.isIn(s)) {
                return true;
            }
        }
        return false;
    }

    public String introduceWith(Student s) {
        StringBuilder res = new StringBuilder(super.introduce());
        res.append(" I am a Teacher.");
        if(isTeaching(s)) {
            res.append(" I teach "+ s.getName() +".");
        } else {
            res.append(" I don't teach "+ s.getName() +".");
        }

        return res.toString();
    }

    // notified method
    public void update(Student s, Klass c, int type) {
        if (type == Instance.JOIN_MSG) {
            System.out.print("I am " + this.getName() + ". I know " + s.getName() + " has joined Class " + c.getNumber() + ".\n");
        }

        if(type == Instance.BE_LEADER_MSG) {
            System.out.print("I am "+ this.getName() +". I know " + s.getName() + " become Leader of Class "  + c.getNumber() + ".\n");
        }

    }
}
