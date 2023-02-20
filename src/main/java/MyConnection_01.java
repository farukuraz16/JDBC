import java.sql.*;

public class MyConnection_01 {
    public static void main(String[] args) throws SQLException {

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/FSAE01","root","Fz.ebr.4");

        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select * from ogrenciler");
       // ResultSet rs = stmt.executeQuery("select id from ogrenciler"); şeklinde de select yapabiliriz..

        rs.next(); // next dersek ilk kayıt gösterilir.

        //index için column numaralarını yazarız. getInt(index olarak 1 yazıyoruz)
        //burada column adını da yazabiliriz.

       // System.out.println(rs.getString("isim"));
       // System.out.println(rs.getString("id"));
       // System.out.println(rs.getString(2));
       // System.out.println(rs.getInt(2)); hata verir

        /*
        System.out.println(rs.getInt(1)+ " " +
                rs.getString(2)+" " +
                rs.getString(3)+" " +
                rs.getString(4));
        */


        /*
        System.out.println(rs.getInt(1)+ " " + rs.getString(2)+" " + rs.getString(3)+" " + rs.getString(4));
        rs.next();

        System.out.println(rs.getInt(1)+ " " + rs.getString(2)+" " + rs.getString(3)+" " + rs.getString(4));
        rs.next();
        System.out.println(rs.getInt(1)+ " " + rs.getString(2)+" " + rs.getString(3)+" " + rs.getString(4));
        rs.next();
        System.out.println(rs.getInt(1)+ " " + rs.getString(2)+" " + rs.getString(3)+" " + rs.getString(4));
*/


        while (rs.next()){
            System.out.println(rs.getInt(1)+ " " + rs.getString(2)+" " + rs.getString(3)+" " + rs.getString(4));
        }

        con.close();


        /*
        try {

            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/fsae01","root","sifreniz");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from ogrenciler");

            while(rs.next()) {  //while !rs.isLast() yazıp rs.next() aşagı yazıncada çalışir

                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4));
                //System.out.println(rs.getInt("id")+" "+rs.getString("isim")+" "+rs.getString("adres")+" "+rs.getInt("sinav_notu"));

            }
            conn.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
         */
    }
}