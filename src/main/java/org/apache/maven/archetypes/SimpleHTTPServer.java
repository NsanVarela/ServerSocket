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
    		Socket clientSocket = server.accept();
    		
    		// 1. Read HTTP request from the client socket
    		InputStreamReader isr = new InputStreamReader(clientSocket.getInputStream());
    		BufferedReader reader = new BufferedReader(isr);
    		String line = reader.readLine();
    		while (!line.isEmpty()) {
    			System.out.println(line);
    			line = reader.readLine();
    		}
    	}
    }
}
