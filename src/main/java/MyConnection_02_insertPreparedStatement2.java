import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MyConnection_02_insertPreparedStatement2 {
    public static void main(String[] args) throws SQLException {

        String url = "jdbc:mysql://localhost:3306/FSAE01";
        String user = "root";
        String password = "Fz.ebr.4";
        Connection con = DriverManager.getConnection(url, user, password);
        //if (con != null) System.out.println("Connection OK");

        int id = 221;
        String isim = "Rümeysa Uraz";
        String adres = "İstanbul";
        int sinav_not = 100;



        PreparedStatement stmt = con.prepareStatement("insert into ogrenciler values(?, ?,?,?)");

        stmt.setInt(1,id);
        stmt.setString(2,isim);
        stmt.setString(3,adres);
        stmt.setInt(4, sinav_not);

        int i = stmt.executeUpdate();
        System.out.println(i+" records inserted");

        con.close();

    }
}
