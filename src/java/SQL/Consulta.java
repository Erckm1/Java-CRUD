/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SQL;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author HP V2
 */
public class Consulta {
    Connection con;
    public int id_Profesor;
    public String nombre;
    public String apellidoP;
    public String apellidoM;

    public Consulta(Connection con, int id_Profesor, String nombre, String apellidoP, String apellidoM) {
        this.con = con;
        this.id_Profesor = id_Profesor;
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
    }

    public void consul(){
    
    Statement s;
        try {
        s =(Statement) con.createStatement();
        //select
        ResultSet rs = s.executeQuery ("select nombre from Profesor where nombre = "+nombre);
        while (rs.next())
        {
        System.out.println (rs.getObject("id_Profesor") + " " + rs.getObject("nombre")+
        " " + rs.getObject("apellidoP")+ " " + rs.getObject("apellidoM"));

        }
        } catch (SQLException ex) {
        System.out.println("Hubo un problema al intentar obetener lo datos"+ex);
        }
    }
    
}
