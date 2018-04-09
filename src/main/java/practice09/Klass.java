package practice09;

import java.util.ArrayList;
import java.util.List;

public class Klass {

    private Integer number;
    private Student leader;
    private List<Student> students = new ArrayList<Student>();

    public void assignLeader(Student s) {
        if(!students.contains(s)) {
            System.out.print("It is not one of us.\n");
            return;
        }
        this.leader = s;
    }

    public void appendMember(Student s) {
        students.add(s);
    }

    public Klass(Integer number) {
        this.number = number;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getDisplayName() {
        return "Class " + this.number;
    }

    public Student getLeader() {
        return leader;
    }

    public void setLeader(Student leader) {
        this.leader = leader;
    }

    @Override
    public String toString() {
        return this.number.toString();
    }
}
