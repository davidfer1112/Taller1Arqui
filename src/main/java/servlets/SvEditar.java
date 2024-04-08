/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import logica.Controller;
import logica.Usuario;

@WebServlet(name = "SvEditar", urlPatterns = {"/SvEditar"})
public class SvEditar extends HttpServlet {

    //Crear la instancia para controller
    Controller control = new Controller();

  
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        int id_editar = Integer.parseInt(request.getParameter("id_usuarioEdit"));
        Usuario usu = control.traerUsuario(id_editar);
        
        HttpSession sesion = request.getSession();
        sesion.setAttribute("usuEditar", usu);
        
        response.sendRedirect("editarUsuario.jsp");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        

    }


}
