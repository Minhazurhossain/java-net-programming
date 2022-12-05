import java.net.*;
import java.io.*;

public class Server{
    public static void main(String args[]){
		
		try{	
			ServerSocket ss = new ServerSocket(6666);
			System.out.println("server is listening.. ");
			Socket s = ss.accept();
			DataInputStream dis = new DataInputStream(s.getInputStream());
			String msg = dis.readUTF();
			System.out.println("From client: "+msg);
			ss.close();
			s.close();	
			
		}catch(Exception e){
			System.out.println(e);
		}				
	}
	
}