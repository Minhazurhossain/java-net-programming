import java.rmi.Remote;
import java.rmi.RemoteException;

public interface face extends Remote{
    void printMsg() throws RemoteException;
}