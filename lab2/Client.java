import java.net.*;
import java.io.*;

public class Client{
	public static void main(String[] args){
        	try{
            Socket  s = new Socket("localhost",6666);
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            dout.writeUTF("hello");

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