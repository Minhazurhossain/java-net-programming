import java.net.*;
import java.io.*;
import java.util.Scanner;

public class Client{
	public static void main(String[] args){
        	try{
            Socket  s = new Socket("localhost",6666);
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            Scanner obj= new Scanner(System.in);  
            System.out.println("Enter a message to server");
            String text = obj.nextLine();  
            dout.writeUTF(text);
            DataInputStream dis = new DataInputStream(s.getInputStream());
			String msg = dis.readUTF();
			System.out.println("From server: "+msg);
            dout.flush();
            dout.close();
            s.close();
		}catch(Exception e){
			System.out.println(e);
		}		

    }
}