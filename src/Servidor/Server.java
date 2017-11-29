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
         Tareas_servicio tareas_servicio = new Tareas_servicio();
            
        try{

            Registry reg = LocateRegistry.getRegistry("127.0.0.1", 4444);
            UserInterface i= (UserInterface) reg.lookup("user2");
            tareas_servicio.guardar(Conexion.obtener(), i);
      
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
}



