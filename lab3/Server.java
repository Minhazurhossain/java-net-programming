import java.util.*;
import java.net.*;
import java.io.*;
public class Server{
    public static void main(String args[])
    {
        try{
            ServerSocket server=new ServerSocket(6666);
			System.out.println("server is listening..");
            Socket socket=server.accept();
            DataInputStream din=new DataInputStream(socket.getInputStream());
            int a=din.readInt();
            int b=din.readInt();
            int c =din.readInt();
            System.out.println("sending result to client");
			int result=0;
            if(c==1) {
              result=a+b;
			  }
             if(c==2){
              result=a-b;
			  }
              if(c==3){
              result=a*b;
			  }
              if(c==4){
              result=a/b;
			}
             DataOutputStream data=new DataOutputStream(socket.getOutputStream());
             data.writeInt(result);
             data.flush();
            data.close();
            socket.close();
            socket.close();
        }

        catch(Exception e)
        {
			System.out.println(e);
        }
    }
}