/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User_Implements;

import User_Interface.UserInterface;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author andres felipe
 */
public class UserImplements extends UnicastRemoteObject implements UserInterface {

    
  private Integer id_user;
   private String name;
   private int fila;
   private String password;
   private String Tipo;

    
 
     //Constructor vacio
   public UserImplements() throws RemoteException {
      this.id_user = null;
      this.name= null;
      this.fila=0;
      this.password=null;
      this.Tipo=null;
   }
   
   //Contructor con 3 tipos de datos de entrada, utilizado para realizar la presentacion de la informacion de la db a el usarioc cliente
    public UserImplements(Integer id_tarea, String name, String password) throws RemoteException {
      this.id_user = id_tarea;
      this.name = name;
      this.password=password;
      
   
   }
   
    
   

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

   public Integer getId_user() {
      return id_user;
   }
   public String getName() {
      return name;
   }
  
   public void setName(String name) {
      this.name= name;
   }
  
   
    public void setFila(int fila) {
       this.fila=fila;
    }
    
    public int getFila() {
       return fila;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public void setTipo(String Tipo){
        this.Tipo=Tipo;
    }
     public String getTipo(){
        return Tipo;
    }
   
    
    
    
   @Override
   public String toString() {
      return "Tarea{" + "id_tarea=" + id_user + ", nombre=" + name + '}';
   } 

    

    
    
}
