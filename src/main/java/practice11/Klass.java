package practice11;

import java.util.ArrayList;
import java.util.List;

public class Klass {

    private Integer number;
    private Student leader;
    private List<Student> students = new ArrayList<Student>();
    // observers(teachers) of this class
    private List<Teacher> teacherObs = new ArrayList<>();


    public boolean isIn(Student s) {
        if(s == null || s.getKlass() == null) {
            return false;
        }

        if(s.getKlass().getNumber() == this.number) {
            return true;
        }

        return false;
    }
    public void assignLeader(Student s) {
        if(!students.contains(s)) {
            System.out.print("It is not one of us.\n");
            return;
        }
        this.leader = s;

        notifyBeLeader(s);
    }

    public void appendMember(Student s) {
        students.add(s);
        // notify the teachers of this klass
        this.notifyJoin(s);
    }

    public void notifyJoin(Student s) {
        for(Teacher t : teacherObs){
            t.update(s, this, Instance.JOIN_MSG);
        }
    }

    public void notifyBeLeader(Student s) {
        for(Teacher t : teacherObs){
            t.update(s, this, Instance.BE_LEADER_MSG);
        }
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

    public void addTeacherObs(Teacher t) {
        this.teacherObs.add(t);
    }

    @Override
    public String toString() {
        return this.number.toString();
    }
}
