import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.NotBoundException;
import java.util.Scanner;

public class Two
{
	private Two(){}
	public static void main(String[] args) throws RemoteException
	{
		try
		{

			Registry reg = LocateRegistry.getRegistry("localhost",9999);

			Hello stub = (Hello) reg.lookup("hi server");

			Scanner input = new Scanner(System.in);

			System.out.println("Enter First  number: ");
			int number1 = input.nextInt();


			System.out.println("Enter second  number: ");
            int number2 = input.nextInt();
		

			int m = stub.multiplication(number1, number2);

			System.out.println("Multiplication: "+m);

			/*int d = stub.division(number1, number2);

			System.out.println("Division: "+d);*/

		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
}