import java.net.*;
import java.io.*;
import java.util.Scanner;
public class Server{
    public static void main(String args[]){
		
		try{	
			ServerSocket ss = new ServerSocket(6666);
			System.out.println("server is listening.. ");
			Socket s = ss.accept();
			DataInputStream dis = new DataInputStream(s.getInputStream());
			String msg = dis.readUTF();
			System.out.println("From client: "+msg);

			 Scanner obj= new Scanner(System.in);  
            System.out.println("Enter a message to client");

            String text = obj.nextLine();  

			DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            dout.writeUTF(text);

            dout.flush();
            dout.close();

			ss.close();
			s.close();	
			
		}catch(Exception e){
			System.out.println(e);
		}				
	}
	
}