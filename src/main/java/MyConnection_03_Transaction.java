import java.sql.*;

public class MyConnection_03_Transaction {
    public static void main(String[] args) throws SQLException {

        String url = "jdbc:mysql://localhost:3306/FSAE01";
        String user = "root";
        String password = "Fz.ebr.4";
        Connection con = DriverManager.getConnection(url, user, password);

        con.setAutoCommit(false);

        PreparedStatement stmt = con.prepareStatement("insert into ogrenciler values (?,?,?,?)");

        int id;
        String isim;
        String adres;
        int sinav_notu;

        int i;

        id = 320;
        isim = "Ali Can";
        adres = "Ankara";
        sinav_notu = 75;

        stmt.setInt(1, id);
        stmt.setString(2, isim);
        stmt.setString(3, adres);
        stmt.setInt(4, sinav_notu);

        i = stmt.executeUpdate();

        System.out.println(i + " records affected");

        id = 321;
        isim = "Veli Mert";
        adres = "Trabzon";
        sinav_notu = 85;

        stmt.setInt(1, id);
        stmt.setString(2, isim);
        stmt.setString(3, adres);
        stmt.setInt(4, sinav_notu);

        i = stmt.executeUpdate();

        System.out.println(i + " records affected");

        con.commit();//yapılan işlemleri tabloya aktarır, kaydeder.

        //con.rollback();//yapılan işlemleri geri alır.. tabloya aktarmaz..
        /*
                i = stmt.executeUpdate();
burada i=-1 olursa con.rollback komutu çalıştırırlır.
if komutuyla eğer i=-1 olursa con.rollback yaparak yapılanları geri al.
         */
        con.close();

    }
}
