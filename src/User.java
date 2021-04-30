import java.util.ArrayList;

public class User {
    private String name;
    private String surname;
    private int age;
    private int id;
    ArrayList<User> list_of_users=new ArrayList<User>();
    public User(){}

    public User(int id, String name, String surname,int age) {
        this.id=id;
        this.age=age;
        this.surname=surname;
        this.name=name;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
