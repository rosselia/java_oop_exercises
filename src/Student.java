public class Student extends User{
    private int grade;


    public Student(int id, String name, String surname, int age) {
        super(id, name,surname,age);

    }

    public Student(int id, String name, String surname,int grade,int age) {
        super(id, name, surname,age);
        this.grade=grade;

    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
