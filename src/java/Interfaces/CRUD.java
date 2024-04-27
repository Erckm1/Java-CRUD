/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import Modelo.Alumno;
import java.util.List;

/**
 *
 * @author HP V2
 */
public interface CRUD {
    public List listar();
    public List listarAl(String al);
    public Alumno list(int id);
    public boolean add(Alumno al);
    public boolean modif(Alumno al);
    public boolean eliminar(int id);
}
