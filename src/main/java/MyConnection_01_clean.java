import java.sql.*;

public class MyConnection_01_clean {
    public static void main(String[] args) throws SQLException {

        String url = "jdbc:mysql://localhost:3306/FSAE01";
        String user = "root";
        String password = "Fz.ebr.4";
        Connection con = DriverManager.getConnection(url, user, password);

        if (con != null) System.out.println("Connection OK");
        //System.out.println(DriverManager.getDriver(url));
        //System.out.println(DriverManager.getLoginTimeout());

        Statement stmt = con.createStatement();

        ResultSet rs = stmt.executeQuery("select * from ogrenciler");

        while (rs.next())
            System.out.println(rs.getInt(1)
                    + " - "
                    + rs.getString(2)
                    + " - "
                    + rs.getString(3)
                    + " - "
                    + rs.getString(4));
        con.close();

    }
}
