/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Usuario;
import persistencia.exceptions.NonexistentEntityException;

/**
 *
 * @author User
 */
public class ControllerPersistencia {
    
    UsuarioJpaController usuJpa = new UsuarioJpaController ();
    
    
    //Metodo para crear usuarios
    public void crearUsuario (Usuario usu){
        
        usuJpa.create(usu);
    }
    
    //Metodo para leer los usuarios
    public List<Usuario> traerUsuarios (){
        return usuJpa.findUsuarioEntities();
    }
    
    //Metodo para borrar usuarios
    public void borrarUsuario(int id_eliminar) {
        try {
            usuJpa.destroy(id_eliminar);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControllerPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Usuario traerUsuario(int id_editar) {
       return usuJpa.findUsuario(id_editar);
    }

    public void editarUsuario(Usuario usu) {
        try {
            usuJpa.edit(usu);
        } catch (Exception ex) {
            Logger.getLogger(ControllerPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
