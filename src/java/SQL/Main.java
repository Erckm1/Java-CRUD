/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SQL;

//import static SQL.conect.connect;

import Modelo.Alumno;
import ModeloDAO.AlumnoDAO;

/**
 *
 * @author HP V2
 */
public class Main {
    public static void main(String[] args){
        Alumno a = new Alumno();
        AlumnoDAO dao = new AlumnoDAO();
            String id_Alumno="6";
        int x=Integer.parseInt(id_Alumno);
                a.setId_Alumno(x);
                a.setNombre("Chris");
                a.setApellidoP("Master");
                a.setApellidoM("Martinez");
                a.setMatricula("123434X");
                a.setMatricula("masta");
                a.setPass("masta");
                a.setSalon("B5");
                a.setProfesor("Trillo");
                a.setHora("12:00-02:00");
                a.setDia("Jueves");
                dao.add(a);
    }
}
