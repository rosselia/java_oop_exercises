public class Instructor extends User {
    private String profession;
    private int salary;
    private String graduation;

    public Instructor(){}
    public Instructor(int id,String name,String surname,int age,String profession,int salary,String graduation){
        super(id, name, surname,age);
        this.profession=profession;
        this.salary=salary;
        this.graduation=graduation;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getGraduation() {
        return graduation;
    }

    public void setGraduation(String graduation) {
        this.graduation = graduation;
    }
}
