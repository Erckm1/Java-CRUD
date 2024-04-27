/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author HP V2
 */
public class Modificar {
    public void mod(){
        Connection con = null;
        String driver="com.mysql.jdbc.Driver";
        try{
            Class.forName(driver);
            System.out.println("Driver cargado");
            try{
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/proyect?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "BasesSh1t");
                if(con!=null) System.out.println("Coneccion exitosa");
            }catch(Exception e){
                System.out.println("Intento fallido");
            }
        }catch(Exception e){
            System.out.print("error al cargar:"+e);
        }
        Statement s;
        try{
            s =(Statement) con.createStatement();
            //update
            s.executeUpdate("UPDATE Profesor SET apellidoP='Martinez' WHERE nombre='chris'");
        }
        catch (SQLException ex) {
        System.out.println("Hubo un problema al intentar obetener lo datos"+ex);
        }
    }
}
