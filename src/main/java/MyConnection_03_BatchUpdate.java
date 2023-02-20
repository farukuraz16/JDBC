import java.sql.*;

public class MyConnection_03_BatchUpdate {
    public static void main(String[] args) throws SQLException {

        String url = "jdbc:mysql://localhost:3306/FSAE01";
        String user = "root";
        String password = "Fz.ebr.4";
        Connection con = DriverManager.getConnection(url, user, password);

        con.setAutoCommit(false);

        Statement stmt = con.createStatement();

        stmt.addBatch("insert into ogrenciler values(420,'Rümeysa Uraz','Bursa',100)");
        stmt.addBatch("insert into ogrenciler values(421,'Elif Yavuz','Balıkesir',100)");
        stmt.addBatch("insert into ogrenciler values(422,'İnci Yavuz','Balıkesir',100)");

        int [] i = stmt.executeBatch();//birden fazla işlemin sonucu array olarak atama yapıyoruz.


        System.out.println(i[0] + " records inserted");
        System.out.println(i[1] + " records inserted");


        con.commit();
        con.close();

    }
}
