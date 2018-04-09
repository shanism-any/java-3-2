package practice07;

public class Student extends Person{

    private Klass klass;

    public Student(String name, int age, int number) {
        super(name, age);
        this.klass.setNumber(number);
    }
    public Student(String name, int age, Klass klass) {
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
        String res = super.introduce() + " I am a Student. I am at Class " + klass.toString() + ".";
        return res;
    }
}
