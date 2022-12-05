import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.*;

public class One extends UnicastRemoteObject implements Hello
{
	private static int res;

	public One() throws RemoteException
	{



	}

	public int multiplication(int a, int b) throws RemoteException
	{

		
		


		for(int i = a; i < b; i++)
		{
			if(i%2==0)
			{
				res = i;
				
					
			}
		}

		return display(res);
		
	}





	public int division(int a, int b) throws RemoteException
	{

		int d = a / b;

		return d;	
		
	}

	private static void display(int res)
	{
		System.out.println(res);
	}

	public static void main(String[] args) throws RemoteException
	{
		try{

			Registry reg = LocateRegistry.createRegistry(9999);
			reg.rebind("hi server",new One());
			System.out.println("Server is ready");

		}catch(RemoteException e)
		{
			System.out.println(e);
		}
	}
}