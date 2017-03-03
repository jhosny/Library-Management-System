import java.sql.*;
import javax.swing.JOptionPane;
public class main{
    Connection connect;
    public static Connection ConnecrDb(){
        try {
          Class.forName("org.sqlite.JDBC");
          Connection connect = DriverManager.getConnection("jdbc:sqlite:U:\\Documents\\NetBeansProjects\\ManagementSystem\\Mylibrary.sqlite");
          return connect;
            
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
    }
    
    
}
//connect the project to the database GUI
/*Library management system
Written by Joy Hosny */
