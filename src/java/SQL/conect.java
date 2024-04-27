package SQL;


import java.sql.Connection;
import java.sql.DriverManager;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


public class conect {
      public  Connection con = null;

    public Connection getCon() {
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
        return con;
    }
      
        /*Statement s;
        try {
        s =(Statement) con.createStatement();
        //insert
        s.executeUpdate("INSERT INTO Profesor (id_Profesor,nombre,apellidoP,apellidoM) VALUES(2,'chris','Mar','luna')");

        //update
        s.executeUpdate("UPDATE Profesor SET apellidoP='Lobo' WHERE nombre='Fede'");
        //delete
        s.executeUpdate("DELETE FROM Profesor WHERE id_Profesor=5");
        //select
        ResultSet rs = s.executeQuery ("select * from Profesor");
        while (rs.next())
        {
        System.out.println (rs.getObject("id_Profesor") + " " + rs.getObject("nombre")+
        " " + rs.getObject("apellidoP")+ " " + rs.getObject("apellidoM"));

        }
        } catch (SQLException ex) {
        System.out.println("Hubo un problema al intentar obetener lo datos"+ex);
        }*/
}
