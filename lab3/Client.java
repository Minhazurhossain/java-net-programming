import java.util.*;
import java.net.*;
import java.io.*;

public class Client{
    public static void main(String args[])
    {
        try{
            Socket socket=new Socket("localhost",6666);
            Scanner scr=new Scanner(System.in);
            System.out.println("enter 2 values");
            int a=scr.nextInt();
            int b=scr.nextInt();
            System.out.println("enter 1 to add, 2 to sub, 3 to mult, 4 to div ");
            int c=scr.nextInt();
            

            DataOutputStream data=new DataOutputStream(socket.getOutputStream());
            data.writeInt(a);
            data.writeInt(b);
            data.writeInt(c);

            DataInputStream din=new DataInputStream(socket.getInputStream());
            int ans=din.readInt();

            System.out.println("Operation is: "+ans);
            data.flush();
            data.close();
            socket.close();
        }
            

        catch(Exception e)
        {

        }
    }

}