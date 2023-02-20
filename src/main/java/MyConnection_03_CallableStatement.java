import java.sql.*;

public class MyConnection_03_CallableStatement {
    public static void main(String[] args) throws SQLException {

        String url = "jdbc:mysql://localhost:3306/FSAE01";
        String user = "root";
        String password = "Fz.ebr.4";
        Connection con = DriverManager.getConnection(url, user, password);

        CallableStatement stmt = con.prepareCall("{call sp_ogrenci_bilgi(?,?,?)}");

        stmt.setInt(1,120);
        //in parametresi giriş yapılır ve bu parametreye göre datalar çağırılır.
        //öğrenci id'si girilir ve isim - sınav notu out olarak alınır.
        //bunu için vorkbench'de storeprosdür oluşturulur. bu store prosedüredeki in-out parametrelerine göre
        //data çağrılır.

        stmt.registerOutParameter(2, Types.VARCHAR);
        stmt.registerOutParameter(2, Types.INTEGER);

        stmt.execute();

        System.out.println(stmt.getString(2));
        System.out.println(stmt.getInt(3));
        con.close();

    }
}
