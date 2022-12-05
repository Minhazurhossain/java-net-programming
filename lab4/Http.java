
import java.io.*;
import java.net.InetSocketAddress;
import com.sun.net.httpserver.*;

class Http
{
    public static void main(String[] args) throws Exception
    {
        HttpServer ob = HttpServer.create(new InetSocketAddress(8000),0);
        ob.createContext("/lab", new NameHandler());
        ob.setExecutor(null);
        ob.start();
    }
    static class NameHandler implements HttpHandler
    {
        public void handle(HttpExchange t) throws IOException
        {
            byte[] res = "<h1>Hello world</h1>".getBytes();
            t.sendResponseHeaders(200, res.length);
            OutputStream os = t.getResponseBody();
            os.write(res);
            os.close();
        }
    }
}
