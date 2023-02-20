import java.sql.*;

public class MyConnection_02_DataBaseMetaData3 {
    public static void main(String[] args) throws SQLException {

        String url = "jdbc:mysql://localhost:3306/FSAE01";
        String user = "root";
        String password = "Fz.ebr.4";
        Connection con = DriverManager.getConnection(url, user, password);
        //if (con != null) System.out.println("Connection OK");

        DatabaseMetaData dbmd = con.getMetaData();

        String table[] = {"VIEW"};
        ResultSet rs = dbmd.getTables(null, null, null, table);

        while (rs.next()){
            System.out.println(rs.getString(1));
            System.out.println(rs.getString(3));
        }

        con.close();

    }
}
