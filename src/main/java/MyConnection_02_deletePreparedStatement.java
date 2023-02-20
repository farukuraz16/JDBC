import java.sql.*;

public class MyConnection_02_deletePreparedStatement {
    public static void main(String[] args) throws SQLException {

        String url = "jdbc:mysql://localhost:3306/FSAE01";
        String user = "root";
        String password = "Fz.ebr.4";
        Connection con = DriverManager.getConnection(url, user, password);
        //if (con != null) System.out.println("Connection OK");

        PreparedStatement stmt = con.prepareStatement("delete from ogrenciler where id = ?");

        stmt.setInt(1,122);

        int i = stmt.executeUpdate();
        System.out.println(i+" records deleted");

        con.close();

    }
}
