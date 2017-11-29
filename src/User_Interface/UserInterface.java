/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User_Interface;

/**
 *
 * @author andres felipe
 */
import java.rmi.*;

public interface UserInterface  extends Remote{
    
    
    
    
    //Metodos Getter's y Setter's 
    
   public Integer getId_user()throws RemoteException;
   public String getName() throws RemoteException;
   public void setName(String name) throws RemoteException;
   public void setFila(int fila) throws RemoteException;
   public int getFila() throws RemoteException;
   public String getPassword()throws RemoteException;
   public void setPassword(String password)throws RemoteException;
   public String getTipo()throws RemoteException;
   public void setTipo(String tipo)throws RemoteException;
    
        
    
}

