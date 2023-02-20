import java.sql.*;

public class MyConnection_02_createTable {
    public static void main(String[] args) throws SQLException {

        String url = "jdbc:mysql://localhost:3306/FSAE01";
        String user = "root";
        String password = "Fz.ebr.4";
        Connection con = DriverManager.getConnection(url, user, password);
        //if (con != null) System.out.println("Connection OK");

        Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
       //int result = stmt.executeUpdate("CREATE TABLE elemanlar (id int, isim varchar(50), adres varchar(100))");

       // int result2 = stmt.executeUpdate("drop TABLE elemanlar");
        int result1 = stmt.executeUpdate("insert into elemanlar values(221, 'Ayşe','İzmir')");
        int result2 = stmt.executeUpdate("insert into elemanlar values(221, 'Fatma','Ankara')");

        System.out.println(result2+" = tablo oluşturuldu");




        con.close();

    }
}
