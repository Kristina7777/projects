import java.sql.*;

public class JavaDemoJDBS {


        private static Connection connection=null;
        private static String URL = "jdbc:sqlserver://192.168.1.42:53537;instanceName=SQLEXPRESS;database=Test";
        private static String USERNAME = "Kristina";
        private static String PASSWORD = "160587";

    public static void main (String [] args) throws SQLException {

        Statement stmt = null;
        ResultSet result = null;

        String value = " ";
        String SQL = "";

        try {
            System.out.println("Устанавливаем соединение с базой");
            connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);

            //start
            SQL = "SELECT * FROM dbo.Users WHERE ID = 6582";
            stmt = connection.createStatement();
            result = stmt.executeQuery(SQL);


            while (result.next()) {
                value = result.getString("UserName");
            }
            System.out.println(value);

            //end

    } catch (SQLException e) {
        e.printStackTrace();
    }
        finally {
            connection.close();
            System.out.println("Закрыли соединение с базой");

        }

    }
}

