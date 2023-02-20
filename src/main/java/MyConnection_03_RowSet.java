import JDBCKodlar.MyListener;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MyConnection_03_RowSet {
    public static void main(String[] args) throws SQLException {


        //Creating and Executing RowSet
        JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet();

        rowSet.setUrl("jdbc:mysql://localhost:3306/FSAE01");
        rowSet.setUsername("root");
        rowSet.setPassword("Fz.ebr.4");

        rowSet.setCommand("select * from ogrenciler");

        rowSet.execute();

        // Adding Listener and moving RowSet
        rowSet.addRowSetListener(new MyListener());

        while (rowSet.next()) {
            // Generating cursor Moved event
            System.out.println("Id: " + rowSet.getInt(1));
            System.out.println("Isim: " + rowSet.getString(2));
            System.out.println("Adres: " + rowSet.getString(3));
            System.out.println("Not: " + rowSet.getInt(4));
        }

        rowSet.close();
    }
}
