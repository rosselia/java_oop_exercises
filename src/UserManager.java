import java.util.ArrayList;

public class UserManager extends User{
    private User user;

    public User getUser() {
        return user;
    }
    public ArrayList<User> add(User user) {
        System.out.println("user has been added");
        list_of_users.add(user);
        return list_of_users;
    }
}
