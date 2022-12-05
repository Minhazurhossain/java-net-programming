
import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class server extends UnicastRemoteObject implements face{
    public server() throws RemoteException{

    }
    public void printMsg() throws RemoteException{
        System.out.println("This is a RMI programm");
    }


 public static void main(String[] args)throws RemoteException {
    try{
        Registry reg=LocateRegistry.createRegistry(9999);
        reg.rebind("hi server",new server());
        System.out.println("server is ready");
    
    }
    catch(RemoteException e){
        System.out.println(e);
    }
}
}