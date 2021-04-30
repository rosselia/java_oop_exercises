

public class Main {

    public static void main(String[] args) {
        User user1 = new User(1, "Gamze", "Çelik", 21);
        User user2 = new User(2, "Batuhan", "Gülcü", 32);
        User user3 = new User(3, "Melike", "Öztekin", 18);

        Student student1 = new Student(11, "Semih", "Kökçü", 84, 20);
        Student student2 = new Student(13, "Ozan", "Çeliktemel", 95, 19);
        Student student3 = new Student(12, "Esra", "Keleş", 100, 22);

        Instructor instructor1 = new Instructor(5, "Asım", "Kılıç", 35, "physics", 9000, "ODTÜ");
        Instructor instructor2 = new Instructor(6, "Engin", "Demiroğ", 32, "java", 8400, "İTÜ");
        Instructor instructor3 = new Instructor(7, "Öznur", "Gür", 41, "math", 6200, "ESTÜ");

        System.out.println("This is one of are our users:"+  "\nNAME:  "  + user1.getName() + "  \nSURNAME: " + user2.getSurname() + "  \nID:  " + user3.getId());
        System.out.println("\nThese are our instructors:  " + instructor1.getName() + "  " + instructor2.getName() + "  " + instructor3.getName());
        System.out.println("\nThese are our students:  " + student1.getName() + "  " + student2.getName() + "  " + student3.getName());


    }

}
