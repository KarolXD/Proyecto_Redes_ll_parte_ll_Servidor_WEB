/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
/**
 *
 * @author Jahanel
 */
public class Proyecto2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        final int Puerto = 8080;
        HttpServer http = HttpServer.create(new InetSocketAddress(Puerto), 0);
        com.sun.net.httpserver.HttpContext ctx = http.createContext("/");
        ctx.setHandler(Proyecto2::gestionarSolicitud);
        http.start();
    }

    public static void gestionarSolicitud(HttpExchange exchange) throws IOException {
        final int CODIGO_RESPUESTA = 200;
        String contenido = "Respuesta desde el servidor HTTP"
                + "";

        exchange.sendResponseHeaders(CODIGO_RESPUESTA, contenido.getBytes().length);

        OutputStream os = exchange.getResponseBody();

        os.write(contenido.getBytes());
        os.close();
    }
}
