package Controlador;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import Modelo.Alumno;
import ModeloDAO.AlumnoDAO;
import SQL.validar;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
/**
 *
 * @author HP V2
 */
@WebServlet(urlPatterns = {"/Log"})
public class Log extends HttpServlet {
    Alumno a = new Alumno();
    AlumnoDAO dao = new AlumnoDAO();
   int id;
   boolean loged;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Log</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Log at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
            String Rol = request.getParameter("Rol");
            String user = request.getParameter("user");
            String pass = request.getParameter("pass");
            String action=request.getParameter("accion");
            out.println("<h1>ROL </h1>");
            String acceso="";
            validar val = new validar();
            loged= val.valido(user, pass, Rol);
            if("Alumno".equals(Rol) && loged){
                //request.setAttribute("Roll",Rol);
                //request.setAttribute("ident",user);
                //request.setAttribute("us",request.getParameter("Rol"));
                RequestDispatcher RequetsDispatcherObj =request.getRequestDispatcher("/Alumno.jsp");
                RequetsDispatcherObj.forward(request, response);
            }else if("Administrador".equals(Rol) && loged){
                out.println("<h2>"+Rol+"</h2>");//lamar jsp para Administrador
                RequestDispatcher RequetsDispatcherObj =request.getRequestDispatcher("/Administrador.jsp");
                RequetsDispatcherObj.forward(request, response);
            }else if(action.equalsIgnoreCase("add")){
                 RequestDispatcher RequetsDispatcherObj =request.getRequestDispatcher("/add.jsp");
                RequetsDispatcherObj.forward(request, response);
            }else if(action.equalsIgnoreCase("Agregar")){
                String id_Alumno = request.getParameter("id_Alumno");
                String nombre=request.getParameter("nombre");
                String apellidoP = request.getParameter("apeP");
                String apellidoM = request.getParameter("apeM");
                String matricula = request.getParameter("matricula");
                String passw = request.getParameter("pass");
                String salon = request.getParameter("salon");
                String profesor = request.getParameter("profesor");
                String hora = request.getParameter("hora");
                String dia = request.getParameter("dia");
                String materia = request.getParameter("materia");
                int x=Integer.parseInt(id_Alumno);
                a.setId_Alumno(x);
                a.setNombre(nombre);
                a.setApellidoP(apellidoP);
                a.setApellidoM(apellidoM);
                a.setMatricula(matricula);
                a.setPass(passw);
                a.setSalon(salon);
                a.setProfesor(profesor);
                a.setHora(hora);
                a.setDia(dia);
                a.setMateria(materia);
                dao.add(a);
                RequestDispatcher RequetsDispatcherObj =request.getRequestDispatcher("/Administrador.jsp");
                RequetsDispatcherObj.forward(request, response);
            }else if(action.equalsIgnoreCase("editar")){
                id=Integer.parseInt(request.getParameter("id"));
                RequestDispatcher RequetsDispatcherObj =request.getRequestDispatcher("/Editar.jsp");
                RequetsDispatcherObj.forward(request, response);
            }else if(action.equalsIgnoreCase("Actualizar")){
                 String id_Alumno = request.getParameter("id_Alumno");
                String nombre=request.getParameter("nombre");
                String apellidoP = request.getParameter("apeP");
                String apellidoM = request.getParameter("apeM");
                String matricula = request.getParameter("matricula");
                String passw = request.getParameter("pass");
                String salon = request.getParameter("salon");
                String profesor = request.getParameter("profesor");
                String hora = request.getParameter("hora");
                String dia = request.getParameter("dia");
                String materia = request.getParameter("materia");
                a.setID(id);
                a.setNombre(nombre);
                a.setApellidoP(apellidoP);
                a.setApellidoM(apellidoM);
                a.setMatricula(matricula);
                a.setPass(passw);
                a.setSalon(salon);
                a.setProfesor(profesor);
                a.setHora(hora);
                a.setDia(dia);
                a.setMateria(materia);
                dao.modif(a);
                RequestDispatcher RequetsDispatcherObj =request.getRequestDispatcher("/Administrador.jsp");
                RequetsDispatcherObj.forward(request, response);
            }else if(action.equalsIgnoreCase("eliminar")){
                id=Integer.parseInt(request.getParameter("id"));
                a.setID(id);
                dao.eliminar(id);
                RequestDispatcher RequetsDispatcherObj =request.getRequestDispatcher("/Administrador.jsp");
                RequetsDispatcherObj.forward(request, response);
            }else{
                request.setAttribute("error","Usuario y/o Contraseña Incorrectos!");
                RequestDispatcher RequetsDispatcherObj =request.getRequestDispatcher("/index.jsp");
                RequetsDispatcherObj.forward(request, response);
            }
            
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
         try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>POST</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Log at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
