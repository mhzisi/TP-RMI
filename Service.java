
package serveur;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Service extends UnicastRemoteObject implements MyInterface {
 
 double solde=0;

    protected Service() throws RemoteException
           { super(); }                     
      
         
    @Override
    public double debiter(double montant) throws RemoteException {
       
        solde=solde+montant;
        return solde;
        
    }

 @Override
    public double crediter(double montant) throws RemoteException {
        solde=solde-montant;
        return solde;
    }

    @Override
    public double lireSolde() throws RemoteException
    {
        return solde;
    }
    
}
