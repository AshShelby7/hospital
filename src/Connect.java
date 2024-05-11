
import java.sql.*;
import javax.swing.*;
public class Connect {
     Connection con=null;

        public static Connection ConnectDB(){
             try{

                 Class.forName("com.mysql.jdbc.Driver");
                 String s = "jdbc:mysql://localhost:3306/hms_db?useSSL=false";
                 Connection con = DriverManager.getConnection(s, "root", "root");
         // JOptionPane.showMessageDialog(null, "Connected to database");
          return con;

        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, e);
            return null;
    }
}
}
