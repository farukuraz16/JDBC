import java.sql.*;

public class MyConnection_02_DataBaseMetaData {
    public static void main(String[] args) throws SQLException {

        String url = "jdbc:mysql://localhost:3306/FSAE01";
        String user = "root";
        String password = "Fz.ebr.4";
        Connection con = DriverManager.getConnection(url, user, password);
        //if (con != null) System.out.println("Connection OK");

        DatabaseMetaData dbmd = con.getMetaData();

        System.out.println("Driver Name   : "+ dbmd.getDriverName());
        System.out.println("Driver Version: "+ dbmd.getDriverVersion());
        System.out.println("Username      : "+ dbmd.getUserName());
        System.out.println("Database Production Name: "+ dbmd.getDatabaseProductName());
        System.out.println("Database Product Version: "+ dbmd.getDatabaseProductVersion());

        con.close();

    }
}
