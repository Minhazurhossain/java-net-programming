import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.NotBoundException;


public class client {
    private client(){}
    public static void main(String[] args) throws RemoteException{
        try{
            Registry reg=LocateRegistry.getRegistry("Localhost",9999);
            face stub=(face)reg.lookup("hi server");
            stub.printMsg();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
}
