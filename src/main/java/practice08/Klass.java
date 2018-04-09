package practice08;

public class Klass {

    private Integer number;
    private Student leader;

    public void assignLeader(Student s) {
        this.leader = s;
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
