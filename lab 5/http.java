import java.io.*;
import java.net.InetSocketAddress;
import com.sun.net.httpserver.*;

class http{

        public static int a = 0;
         public static int b = 0;
         public static int c=0;
         public static void main(String[] args) throws Exception{

            HttpServer ob = HttpServer.create(new InetSocketAddress(8000),0);
            ob.createContext("/a", new nameHandler());
            ob.createContext("/b", new nameHandler2());
            ob.createContext("/c", new nameHandler3());
            ob.setExecutor(null);
            ob.start();
         }

         static class nameHandler implements HttpHandler{
            public void handle(HttpExchange t) throws IOException{
               a = Integer.parseInt(t.getRequestURI().getQuery());
               String res = "The value of a = "+a;
                t.sendResponseHeaders(200, res.length());
                OutputStream os = t.getResponseBody();
                os.write(res.getBytes());
                os.close();
            }
         }

         static class nameHandler2 implements HttpHandler{
            public void handle(HttpExchange t) throws IOException{
               b = Integer.parseInt(t.getRequestURI().getQuery());
                String res = "The value of b="+b;
                t.sendResponseHeaders(200, res.length());
                OutputStream os = t.getResponseBody();
                os.write(res.getBytes());
                os.close();
            }
         }

           static class nameHandler3 implements HttpHandler{
            public void handle(HttpExchange t) throws IOException{
              
              c=a+b;
             
                String res = "The value of a+b = "+c;
                t.sendResponseHeaders(200, res.length());
                OutputStream os = t.getResponseBody();
                os.write(res.getBytes());
                os.close();
            }
         }
}