/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModeloDAO;

import Interfaces.CRUD;
import Modelo.Alumno;
import SQL.conect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP V2
 */
public class AlumnoDAO implements CRUD {
    Connection con = null;
    conect conex = new conect();
    PreparedStatement pst = null;
    ResultSet rs = null;
    Alumno a = new Alumno();
  
    @Override
    public List listar() {
        ArrayList<Alumno>list=new ArrayList<>();
        String sql="select * from Alumno";
        try{
            con = conex.getCon();
            pst = con.prepareStatement(sql);
            rs=pst.executeQuery();
            while(rs.next()){
                   Alumno al = new Alumno();
                   al.setId_Alumno(rs.getInt("id_Alumno"));
                   al.setNombre(rs.getString("nombre"));
                   al.setApellidoP(rs.getString("apellidoP"));
                   al.setApellidoM(rs.getString("apellidoM"));
                   al.setMatricula(rs.getString("identificador"));
                   al.setPass(rs.getString("pass"));
                   al.setSalon(rs.getString("salon"));
                   al.setProfesor(rs.getString("profesor"));
                   al.setHora(rs.getString("hora"));
                   al.setDia(rs.getString("dia"));
                   al.setMateria(rs.getString("materia"));
                   System.out.println (rs.getObject("id_Alumno") + " " + rs.getObject("nombre")+
        " " + rs.getObject("apellidoP")+ " " + rs.getObject("apellidoM")+ " " + rs.getObject("identificador")+ " " + rs.getObject("salon")+ " " + rs.getObject("profesor"));
                   list.add(al);
            }
        }catch(Exception e){
            System.out.println(e);
        }
        return list;
    }

    @Override
    public Alumno list(int id) {
        String sql="select * from Alumno where id="+id;
        try{
            con = conex.getCon();
            pst = con.prepareStatement(sql);
            rs=pst.executeQuery();
            while(rs.next()){
                   a.setId_Alumno(rs.getInt("id_Alumno"));
                   a.setNombre(rs.getString("nombre"));
                   a.setApellidoP(rs.getString("apellidoP"));
                   a.setApellidoM(rs.getString("apellidoM"));
                   a.setMatricula(rs.getString("identificador"));
                   a.setPass(rs.getString("pass"));
                   a.setSalon(rs.getString("salon"));
                   a.setProfesor(rs.getString("profesor"));
                   a.setHora(rs.getString("hora"));
                   a.setDia(rs.getString("dia"));
                   a.setMateria(rs.getString("materia"));
            }
        }catch(Exception e){
            System.out.println(e);
        }
        return a;
    }

    @Override
    public boolean add(Alumno al) {
        String sql = "insert into Alumno (id_Alumno,nombre,apellidoP,apellidoM,identificador,pass,salon,profesor,hora,dia,materia) values('"+al.getId_Alumno()+"','"+al.getNombre()+"','"+al.getApellidoP()+"','"+al.getApellidoM()+"','"+al.getMatricula()+"','"+al.getPass()+"','"+al.getSalon()+"','"+al.getProfesor()+"','"+al.getHora()+"','"+al.getDia()+"','"+al.getMateria()+"')";
            System.out.println(sql);
            try{
                con = conex.getCon();
                Statement s;
                s =(Statement) con.createStatement();
                //insert
                s.executeUpdate(sql);
            }catch(Exception e){
                System.out.println(e);
            }
        return true;
    }

    @Override
    public boolean modif(Alumno al) {
        String sql="update Alumno set nombre='"+al.getNombre()+"',apellidoP='"+al.getApellidoP()+"',apellidoM='"+al.getApellidoM()+"',identificador='"+al.getMatricula()+"',pass='"+al.getPass()+"',salon='"+al.getSalon()+"',profesor='"+al.getProfesor()+"',hora='"+al.getHora()+"',dia='"+al.getDia()+"',materia='"+al.getMateria()+"' where id_Alumno="+al.getID();
          System.out.println(sql);
            try{
                con = conex.getCon();
                Statement s;
                s =(Statement) con.createStatement();
                s.executeUpdate(sql);
            }catch(Exception e){
            System.out.println(e);
            }
            return true;
    }

    @Override
    public boolean eliminar(int id) {
        String sql = "delete from Alumno where id_Alumno="+id;
        System.out.println(sql);
            try{
                con = conex.getCon();
                Statement s;
                s =(Statement) con.createStatement();
                s.executeUpdate(sql);
            }catch(Exception e){
            System.out.println(e);
            }
            return true;
    }

    @Override
    public List listarAl(String al) {
        ArrayList<Alumno>list=new ArrayList<>();
        String sql="select * from Alumno where identificador = "+al;
        try{
            con = conex.getCon();
            pst = con.prepareStatement(sql);
            rs=pst.executeQuery();
            while(rs.next()){
                   Alumno alu = new Alumno();
                   alu.setId_Alumno(rs.getInt("id_Alumno"));
                   alu.setNombre(rs.getString("nombre"));
                   alu.setApellidoP(rs.getString("apellidoP"));
                   alu.setApellidoM(rs.getString("apellidoM"));
                   alu.setMatricula(rs.getString("identificador"));
                   alu.setPass(rs.getString("pass"));
                   alu.setSalon(rs.getString("salon"));
                   alu.setProfesor(rs.getString("profesor"));
                   alu.setHora(rs.getString("hora"));
                   alu.setDia(rs.getString("dia"));
                   alu.setMateria(rs.getString("materia"));
            }
        }catch(Exception e){
            System.out.println(e);
        }
        return list;
    }
    
}
