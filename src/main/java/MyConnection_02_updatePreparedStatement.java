import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MyConnection_02_updatePreparedStatement {
    public static void main(String[] args) throws SQLException {

        String url = "jdbc:mysql://localhost:3306/FSAE01";
        String user = "root";
        String password = "Fz.ebr.4";
        Connection con = DriverManager.getConnection(url, user, password);
        //if (con != null) System.out.println("Connection OK");

        PreparedStatement stmt = con.prepareStatement("update ogrenciler set isim = ? where id = ?");


        stmt.setString(1,"Gökhan Can");
        stmt.setInt(2,120);

        int i = stmt.executeUpdate();
        System.out.println(i+" records updated");

        con.close();

    }
}
