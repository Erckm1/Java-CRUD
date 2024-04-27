/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author HP V2
 */
public class validar {
    public boolean valido(String nombre, String pass,String Rol){
        int r=0;
        Connection con = null;
        conect conex = new conect();
          PreparedStatement pst = null;
          ResultSet rs = null;
          try{
                con = conex.getCon();
               String sql = "SELECT * FROM "+Rol+" where identificador=? and pass=?";
               pst = con.prepareStatement(sql);
               pst.setString(1, nombre);
               pst.setString(2, pass);
               rs = pst.executeQuery();
               while(rs.next()){
                   r+=1;
               }
               if(r>=1) return true;
               else return false;
          }catch(Exception e){
              System.out.println("Error"+e);
          }finally{
              try{
                  if(con!=null) con.close();
                  if(pst!=null) pst.close();
                  if(rs!=null) rs.close();
              }catch(Exception e){
                  System.out.println("Final Error"+e);
              }
          }
          
        return false;
    }
}
