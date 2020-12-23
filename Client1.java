/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client1;

import java.rmi.Naming;
import serveur.MyInterface;


public class Client1 {

    public static void main(String[] args) {
        try {
            MyInterface service1 = (MyInterface) Naming.lookup("rmi://127.0.0.1:1250/server");
            System.out.println(service1.debiter(500.5));
            System.out.println(service1.crediter(100));
            System.out.println(service1.lireSolde());

        } catch (Exception e) {
            System.out.println("Error");
            System.out.println(e.toString());
        }
    }

}
