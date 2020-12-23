
package serveur;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyInterface extends Remote {

    double debiter(double montant)throws RemoteException;
    double crediter(double montant)throws RemoteException;
    double lireSolde()throws RemoteException;

}