package CS31LAB3.Q1;

public class User {
    private String username;
    private String email;

    public User(String name, String email) {
        this.username = name;
        this.email = email;
    }

    public String getName(){
        return username;
    }

    public String getEmail(){
        return email;
    }
}
