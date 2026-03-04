package lab3.Q1;

public class UserRepository {

    private String dbUrl;
    private User user;
    public UserRepository(User user, String dbUrl){
        this.user = user;
        this.dbUrl = dbUrl;
    }


    public void databaseConn(){
        System.out.println("Connecting to Database at " + dbUrl);
        Connection conn = new Connection(user);
        String query = "INSERT INTO users(name, email) VALUES ('" + user.getName();
        conn.EXECUTE(query);
        conn.CLOSE();
    }
}
