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
import java.util.List;
import java.util.ArrayList;
import logica.Usuario;
import javax.servlet.http.HttpSession;
import logica.Controller;


/**
 *
 * @author User
 */
@WebServlet(name = "SvUsuarios", urlPatterns = {"/SvUsuarios"})
public class SvUsuarios extends HttpServlet {
//intancia de la clase Controller
Controller control = new Controller();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // Crear una lista de usuarios para emular una base de datos
        // List<Usuario> listaUsuarios = new ArrayList<>();
        // listaUsuarios.add(new Usuario("123", "Juan", "Perez", "1234567"));
        // listaUsuarios.add(new Usuario("456", "Maria", "Lopez", "7654321"));
        // listaUsuarios.add(new Usuario("789", "Pedro", "Gomez", "9876543"));
        
        // Con base de datos
        List<Usuario> listaUsuarios = new ArrayList<>();
        listaUsuarios = control.traerUsuarios();
        
        // Crear una sesion para enviar la lista de usuarios a la vista
        HttpSession sesion = request.getSession();
        sesion.setAttribute("listaUsuarios", listaUsuarios);
        
        // Redireccionar a la vista
        response.sendRedirect("mostrarUsuarios.jsp");

    }

   
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        

        // Captura los datos del que se envian desde el formulario
        String  cc = request.getParameter("CC");
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String telefono = request.getParameter("telefono");

        // Crea un objeto de tipo Usuario y se le asignan los valores
        Usuario usu = new Usuario();
        usu.setCc(cc);
        usu.setNombre(nombre);
        usu.setApellido(apellido);
        usu.setTelefono(telefono);
 
        //se pasa el objeto al controller (Logica)
        control.crearUsuario(usu);


        response.sendRedirect("index.jsp");
        
        // Muestra por consola la captura de los datos
        // System.out.println("Cedula: " + cc);
        // System.out.println("Nombre: " + nombre);
        // System.out.println("Apellido: " + apellido);
        // System.out.println("Telefono: " + telefono);                 
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
