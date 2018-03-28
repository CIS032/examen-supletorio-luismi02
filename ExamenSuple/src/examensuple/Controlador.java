
package examensuple;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Controlador {
    
    String URL = "jdbc:derby:memory:Tienda; create=true";
Connection cone = null;


public Connection conexion (){
    String driver = "org.apache.derby.jdbc.EmbeddedDriver";
    
    try {
        Class.forName(driver);       
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error" + e);
    } 
    try {
        
        cone = DriverManager.getConnection(URL);
        JOptionPane.showMessageDialog(null, "Conexion Establecida");
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error" + e);
    }
return cone;

}


public Connection crearTablaArticulos (){
    
    String tabla = " Create table Articulos (claveArticulo varchar(10),nombre varchar (100), precio int, claveFabricante varchar(50),nombreFabricante varchar(50), primary key (claveArticulo))";
   
    
    try {
        
        PreparedStatement pstm = cone.prepareStatement(tabla);
        pstm.executeUpdate();      
        pstm.close();
        
        JOptionPane.showMessageDialog(null, "Tabla creada correctamente" );
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error" + e);
    }    
    
    return cone;
}

//
//public Connection crearTablaFabricante (){
//    
//    String tabla = " Create table Fabricante ( claveFabricante varchar(10),nombreFabricante varchar (100),primary key (claveFabricante))";
//    
//    try {
//        PreparedStatement pstm = cone.prepareStatement(tabla);
//        pstm.executeUpdate();
//        pstm.close();
//        
//        JOptionPane.showMessageDialog(null, "Tabla creada correctamente" );
//    } catch (Exception e) {
//        JOptionPane.showMessageDialog(null, "Error" + e);
//    }    
//    
//    return cone;
//}



    
    
    
}
