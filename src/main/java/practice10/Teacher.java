package practice10;


import java.util.HashSet;
import java.util.List;

public class Teacher extends Person {


    private HashSet<Klass> classes = null;

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public Teacher(int id, String name, int age, HashSet<Klass> classes) {
        super(id , name, age);
        this.classes = classes;
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
            for (Klass c : classes) {
                res.append(c.getNumber() + ", ");
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

}
