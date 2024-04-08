/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import logica.Controller;


@WebServlet(name = "SvEliminar", urlPatterns = {"/SvEliminar"})
public class SvEliminar extends HttpServlet {

    //intancia de controller
    Controller control = new Controller();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        int id_eliminar = Integer.parseInt(request.getParameter("id_usuario"));
        control.borrarUsuario(id_eliminar);
//        response.sendRedirect("mostrarUsuarios.jsp");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

    

}
