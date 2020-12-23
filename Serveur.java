
package serveur;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;


public class Serveur {

   

    public static void main(String[] args) throws RemoteException, MalformedURLException 
    {
        
        try{
        Service sv = new Service();
        java.rmi.registry.LocateRegistry.createRegistry(1250);
         Naming.rebind("rmi://127.0.0.1:1250/server", sv);
    }catch(Exception e){System.out.println(e.toString());
        
    }
        

        
    }
}
