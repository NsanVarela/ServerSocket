package org.apache.maven.archetypes;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

/** 
 * Java program to create a simple HTTP Server to demonstrate how to use
 * ServerSocket and Socket class.
 * @author NsanVarela
 */
public class SimpleHTTPServer 
{
    public static void main( String[] args ) throws Exception {
        ServerSocket server = new ServerSocket(8080);
    	System.out.println( "Listening for connection on port 8080 ..." );
    	while (true) {
    		// 2. Prepare an HTTP response
    		try (Socket socket = server.accept()) {
    			Date today = new Date();
    			String httpResponse = "HTTP/1.1 200 OK\r\n\r\n" + today;
    			socket.getOutputStream().write(httpResponse.getBytes("UTF-8"));
    		}
    	}
    }
}
