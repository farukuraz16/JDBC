import java.sql.*;

public class MyConnection_02 {
    public static void main(String[] args) throws SQLException {

        String url = "jdbc:mysql://localhost:3306/FSAE01";
        String user = "root";
        String password = "Fz.ebr.4";
        Connection con = DriverManager.getConnection(url, user, password);
        //if (con != null) System.out.println("Connection OK");

        java.sql.Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

        ResultSet rs = stmt.executeQuery("select * from ogrenciler");

        //getting the record of n rd row
        rs.absolute(2);//2. satırdaki datayı result ediyoruz
            System.out.println(rs.getInt(1)
                    + " - "
                    + rs.getString(2)
                    + " - "
                    + rs.getString(3)
                    + " - "
                    + rs.getInt(4));

        rs.next();//yukaridaki result'dan sonraki data
        System.out.println(rs.getInt(1)
                + " - "
                + rs.getString(2)
                + " - "
                + rs.getString(3)
                + " - "
                + rs.getInt(4));

        rs.first();//ilk data
        System.out.println(rs.getInt(1)
                + " - "
                + rs.getString(2)
                + " - "
                + rs.getString(3)
                + " - "
                + rs.getInt(4));





        con.close();

    }
}
