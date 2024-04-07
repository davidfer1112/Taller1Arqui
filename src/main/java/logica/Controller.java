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
    
}
