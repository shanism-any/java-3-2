package practice11;

public class Student extends Person{


    private Klass klass;

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    public String introduce() {
        if(this.klass != null && this.klass.getLeader()!= null && this.klass.getLeader().getId() == this.getId()) {
            String res = super.introduce()+" I am a Student. I am Leader of Class "+ this.klass.getNumber() + ".";
            return res;
        }

        String res = super.introduce() + " I am a Student. I am at Class " + klass.toString() + ".";

        return res;
    }
}
