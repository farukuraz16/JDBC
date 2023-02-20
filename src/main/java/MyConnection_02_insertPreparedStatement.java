import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MyConnection_02_insertPreparedStatement {
    public static void main(String[] args) throws SQLException {

        String url = "jdbc:mysql://localhost:3306/FSAE01";
        String user = "root";
        String password = "Fz.ebr.4";
        Connection con = DriverManager.getConnection(url, user, password);
        //if (con != null) System.out.println("Connection OK");

        PreparedStatement stmt = con.prepareStatement("insert into ogrenciler values(?, ?,?,?)");

        stmt.setInt(1,122);
        stmt.setString(2,"Enes Bera");
        stmt.setString(3,"New Jersey");
        stmt.setInt(4, 100);

        int i = stmt.executeUpdate();
        System.out.println(i+" records inserted");

        con.close();

    }
}
