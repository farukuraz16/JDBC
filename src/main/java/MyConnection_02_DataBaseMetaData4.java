import java.sql.*;

public class MyConnection_02_DataBaseMetaData4 {
    public static void main(String[] args) throws SQLException {

        String url = "jdbc:mysql://localhost:3306/FSAE01";
        String user = "root";
        String password = "Fz.ebr.4";
        Connection con = DriverManager.getConnection(url, user, password);
        //if (con != null) System.out.println("Connection OK");

        //DatabaseMetaData dbmd = con.getMetaData();

        Statement stmt = con.createStatement();

        ResultSet rs = stmt.executeQuery("select * from ogrenciler");

        ResultSetMetaData rsmd = rs.getMetaData();
        System.out.println("Toplam kolon sayisi: "+ rsmd.getColumnCount());
        System.out.println("İlk kolonun adi: "+ rsmd.getColumnName(1));
        System.out.println("İlk kolonun veri tipi: "+ rsmd.getColumnTypeName(1));

        /*
        while (rs.next())
            System.out.println(rs.getInt(1)
                    + " - "
                    + rs.getString(2)
                    + " - "
                    + rs.getString(3)
                    + " - "
                    + rs.getString(4));
        */
        con.close();


    }
}
