/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.util.List;
import persistencia.ControllerPersistencia;

/**
 *
 * @author User
 */
public class Controller {
    
    ControllerPersistencia controlper = new ControllerPersistencia ();
    
    public void crearUsuario (Usuario usu){
        controlper.crearUsuario(usu);
    }
    
    public List <Usuario> traerUsuarios(){
        return controlper.traerUsuarios();
    }

    public void borrarUsuario(int id_eliminar) {
        controlper.borrarUsuario(id_eliminar);
    }

    public Usuario traerUsuario(int id_editar) {
        return controlper.traerUsuario(id_editar);
    }

    public void editarUsuario(Usuario usu) {
        controlper.editarUsuario(usu);
    }
    
}
