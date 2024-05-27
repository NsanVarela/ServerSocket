# Simple Java ServerSocket

1) This repository contains a **simple HTTP server in Java**, which can listen for HTTP requests on a port, 
say **80**, and send a response to the client. As this is an HTTP server, you can connect to it using your browser, 
such as Chrome, Firefox or Internet Explorer.


2) When you run the program in Eclipse or from the command line and connect to the **http://localhost:8080** from your browser, 
you will see the following response :

> Mon May 27 11:37:03 CEST 2024

Which is today's date. 

It means our HTTP Server is working properly, 
- it is listening on port **8080**,
- accepting connections,
- reading requests, 
- and sending responses. 

By using the try-with-resource statement of Java 7, the socket will automatically be closed by Java once you are done with the response. The only limitation of this server is that it can serve one client at a time. 

3) If request processing takes a longer time, which is not in our case, the other connection has to wait. 
This problem can be solved by using threads or Java NIO non-blocking selectors and channels.