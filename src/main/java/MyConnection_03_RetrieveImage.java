import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.*;

public class MyConnection_03_RetrieveImage {
    public static void main(String[] args) throws SQLException, IOException {


        String url = "jdbc:mysql://localhost:3306/FSAE01";
        String user = "root";
        String password = "Fz.ebr.4";
        Connection con = DriverManager.getConnection(url, user, password);


        PreparedStatement ps=con.prepareStatement("insert into personel values(?,?,?,?,?)");

        ResultSet rs=ps.executeQuery();

        rs.next();//now on 1st row

        Blob b=rs.getBlob(4);

        byte barr []= new byte[(int)b.length()];

        // an array is created but contains no data

        barr=b.getBytes(1,(int)b.length());

        FileOutputStream fout=new FileOutputStream("/Users/faruk/Documents/spiderman.jpg");
        fout.write(barr);
        fout.close();

        System.out.println("OK :)");

        con.close();


    }
}
