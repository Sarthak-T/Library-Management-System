package Build;

import java.sql.*;
import javax.swing.JOptionPane;


class javaconnect {
    Connection conn;

    public static Connection ConnecrDb() {
        try
        {
             Class.forName("com.mysql.jdbc.Driver");
             String url="jdbc:mysql://localhost:3306/library";
             Connection conn=DriverManager.getConnection(url,"root","");
             return conn;
        }
        catch(ClassNotFoundException | SQLException x)
        {
            JOptionPane.showMessageDialog(null, x);
        }
        return null;
    }
    
}
