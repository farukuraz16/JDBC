import JDBCKodlar.MyListener;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MyConnection_03_InsertImage {
    public static void main(String[] args) throws SQLException, IOException {


        String url = "jdbc:mysql://localhost:3306/FSAE01";
        String user = "root";
        String password = "Fz.ebr.4";
        Connection con = DriverManager.getConnection(url, user, password);


        PreparedStatement ps=con.prepareStatement("insert into personel values(?,?,?,?,?)");

        FileInputStream fin=new FileInputStream("/Users/faruk/Documents/marvel-spiderman-ps4-game-2019-5k-2560x1600.jpg");

        ps.setInt(1,1001);
        ps.setString(2,"Ali Can");
        ps.setInt(3,7000);

        ps.setBinaryStream(4,fin,fin.available());

        ps.setString(5,null);

        int i=ps.executeUpdate();

        System.out.println(i+" records inserted");

        con.close();


    }
}
