
package sistema;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexionMysql {
    
public Connection conectar () {
     Connection cn = null;
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        cn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/sistemagustavo","root","1234");
        System.out.println("CONECTADO A LA BASE DE DATOS");
    } catch (ClassNotFoundException | SQLException e) {
        JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
    }
        return cn;

} 
  
}
