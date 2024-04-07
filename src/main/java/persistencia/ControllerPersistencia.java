/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.util.List;
import logica.Usuario;

/**
 *
 * @author User
 */
public class ControllerPersistencia {
    
    UsuarioJpaController usuJpa = new UsuarioJpaController ();
    
    
    //Operacion create
    public void crearUsuario (Usuario usu){
        
        usuJpa.create(usu);
    }
    
    //Operacion Read
    public List<Usuario> traerUsuarios (){
        return usuJpa.findUsuarioEntities();
    }
    
}
