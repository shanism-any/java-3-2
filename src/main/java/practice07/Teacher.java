package practice07;

public class Teacher extends Person{

    private Klass klass = null;

    public Teacher(String name, int age) {
        super(name, age);
    }

    public Teacher(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    public String introduce() {
        StringBuilder res = new StringBuilder(super.introduce());
        res.append(" I am a Teacher.");
        if (klass != null) {
            res.append(" I teach Class "+ this.klass.getNumber() + ".");
        } else {
            res.append(" I teach No Class.");
        }

        return res.toString();
    }

    public String introduceWith(Student s) {
        StringBuilder res = new StringBuilder(super.introduce());
        res.append(" I am a Teacher.");
        if(s.getKlass().getNumber() == this.klass.getNumber()) {
            res.append(" I teach "+ s.getName() +".");
        } else {
            res.append(" I don't teach "+ s.getName() +".");
        }

        return res.toString();
    }
}
