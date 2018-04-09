package practice06;

public class Teacher extends Person{
    private Integer klass = null;

    public Teacher(String name, int age) {
        super(name, age);
        this.klass = klass;
    }

    public Teacher(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    public Integer getKlass() {
        return klass;
    }

    public void setKlass(Integer klass) {
        this.klass = klass;
    }

    public String introduce() {
        StringBuilder res = new StringBuilder(super.introduce());
        res.append(" I am a Teacher.");
        if (klass != null) {
            res.append(" I teach Class "+ this.klass + ".");
        } else {
            res.append(" I teach No Class.");
        }

        return res.toString();
    }
}
