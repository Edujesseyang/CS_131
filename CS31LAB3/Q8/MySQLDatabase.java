package CS31LAB3.Q8;

public class MySQLDatabase implements DataRepository{
    public MySQLDatabase(){

    }

    @Override
    public String executeQuery(String sql) {
        System.out.println("Connecting to MySQL and running : " + sql);
        return "Data from MySQL";
    }
}
