/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servidor;

/**
 *
 * @author andres felipe
 */


import User_Implements.UserImplements;

import User_Interface.UserInterface;
    import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import Servidor.Conexion;

public class Server {

    public static void main(String []args){
        //Se declara un instancia de la clase  tarea_servicios
         Tareas_servicio tareas_servicio = new Tareas_servicio();
            
        try{
            //Se instancia un objeto de la clase Registry, que se conectara a la loopback en el puerto 4444
            Registry reg = LocateRegistry.getRegistry("127.0.0.1", 4444);
            //Se define una clase de tipo UserInterface, que tomara como valor el objeto capturado del registro user2
            UserInterface i= (UserInterface) reg.lookup("user2");
            //Se hace un llamado a el metodo guardar, pasandole como paramero una conexion a la base de datos y un objeto de tipo userinterface 
            tareas_servicio.guardar(Conexion.obtener(), i);
      
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
}



