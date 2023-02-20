import java.sql.*;

public class MyConnection_02_insert_delete_update {
    public static void main(String[] args) throws SQLException {

        String url = "jdbc:mysql://localhost:3306/FSAE01";
        String user = "root";
        String password = "Fz.ebr.4";
        Connection con = DriverManager.getConnection(url, user, password);
        //if (con != null) System.out.println("Connection OK");

        java.sql.Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

        //int result = stmt.executeUpdate("delete from ogrenciler where id=120");
        //bir datayı silmek için int data type oluşturup bunu statement'dan executeUpdate komutuyla yapıyoruz

        //int result = stmt.executeUpdate("delete from ogrenciler where id in (122,123)");

        /*
        String isim = "'Yavuz Bal'";
        String sqlstatement = "delete from ogrenciler where isim ="+ isim;
        int result = stmt.executeUpdate(sqlstatement);
        */

        //int result = stmt.executeUpdate("update ogrenciler set isim = 'Faruk Uraz' where id=121");
        //int result = stmt.executeUpdate("update ogrenciler set adres = 'Bursa' where id=121");

        int result = stmt.executeUpdate("insert into ogrenciler values(221, 'Ali Veli2','Ankara',95)");

        System.out.println(result + " records affected");




        con.close();

    }
}
