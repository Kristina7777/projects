import java.sql.*;

public class MainClass {
    private static Connection connection=null;
    private static Statement stmt;
    private static String URL = "jdbc:sqlserver://localhost:1433;instanceName=SQLEXPRESS;database=Test";
    private static String USERNAME = "KRISTINA";
   // private static String PASSWORD = "12345";


    public static void main (String [] args) {
        connect();

        try {
            stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM dbo.Users WHERE ID = 6582");
            while (rs.next()) {
                System.out.println(rs.getString(1) + " " + rs.getInt(2));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        diconnect();
    }

    public static void connect() {
            try {
                System.out.println("Устанавливаем соединение с базой");
                Class.forName("com.microsoft.jdbc.sqlserver.SQLServerDriver");
                connection = DriverManager.getConnection(URL,USERNAME);
                

            } catch (ClassNotFoundException e) {
                e.printStackTrace();

        }


    }
    public static void diconnect() {
            try {
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

    }

