import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Hello extends Remote
{
	int multiplication(int a, int b) throws RemoteException;

	int division(int a, int b) throws RemoteException;
	
}