package practice09;

public class Person {
    private int id;
    private String name;
    private int age;


    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String introduce() {
        String res = "My name is "+ this.name +". I am "+ this.age +" years old.";
        return res;
    }

    @Override
    public boolean equals(Object p) {
        if(!(p instanceof Person)) {
            return false;
        }

        return ((Person)p).getId() == this.id;
    }
}
