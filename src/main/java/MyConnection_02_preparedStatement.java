import java.sql.*;

public class MyConnection_02_preparedStatement {
    public static void main(String[] args) throws SQLException {

        String url = "jdbc:mysql://localhost:3306/FSAE01";
        String user = "root";
        String password = "Fz.ebr.4";
        Connection con = DriverManager.getConnection(url, user, password);
        //if (con != null) System.out.println("Connection OK");

        PreparedStatement stmt = con.prepareStatement("select * from ogrenciler where id = ? and isim = ? and sinav_notu = ?");

        stmt.setInt(1,121);
        stmt.setString(2,"Veli Mert");
        stmt.setInt(3,85);

        ResultSet rs = stmt.executeQuery();

        while (rs.next()){
            System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
        }
        con.close();

    }
}
