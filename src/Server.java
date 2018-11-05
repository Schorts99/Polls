package src;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;
import java.util.StringTokenizer;
import pages.Router;

public class Server implements Runnable {
  static final int PORT = 3000;
	static final String METHOD_NOT_SUPPORTED = "not_supported.html";
  static final boolean verbose = true;
  private Socket connect;

  public Server(Socket socket) {
		connect = socket;
  }

  public static void main(String[] args) {
    try {
      var serverConnect = new ServerSocket(PORT);
      printServerInfo();

      while(true) {
        var server = new Server(serverConnect.accept());

        if (verbose) {
					System.out.println("Connecton opened: (" + new Date() + ")");
        }
        
        var thread = new Thread(server);
				thread.start();
      }
    } catch(IOException e) {
      System.err.println("Server Connection error : " + e.getMessage());
    }
  }
  
  @Override
  public void run() {
    BufferedReader in = null;
    PrintWriter out = null;
    BufferedOutputStream dataOut = null;
		String fileRequested = null;

    try {
      in = new BufferedReader(new InputStreamReader(connect.getInputStream()));
      out = new PrintWriter(connect.getOutputStream());
      dataOut = new BufferedOutputStream(connect.getOutputStream());
      var input = in.readLine();
      var parse = new StringTokenizer(input);
      var method = parse.nextToken().toUpperCase();
      fileRequested = parse.nextToken().toLowerCase();

      if (!method.equals("GET")  &&  !method.equals("HEAD")) {
        if (verbose) {
					System.out.println("501 Not Implemented : " + method + " method.");
        }

        fileRequested = Router.getRequested(fileRequested);
        
        out.println("HTTP/1.1 501 Not Implemented");
				out.println("Date: " + new Date());
				out.println();
        out.flush();
        dataOut.write(fileRequested.getBytes(), 0, fileRequested.length());
				dataOut.flush();
      } else {
        fileRequested = Router.getRequested(fileRequested);
        
        if (method.equals("GET")) {
          out.println("HTTP/1.1 200 OK");
					out.println("Date: " + new Date());
					out.println();
          out.flush();
          dataOut.write(fileRequested.getBytes(), 0, fileRequested.length());
					dataOut.flush();
        }
      }
    } catch(IOException ioe) {
      System.err.println("Server error : " + ioe);
    } finally {
      try {
				in.close();
				out.close();
				dataOut.close();
				connect.close();
			} catch (Exception e) {
				System.err.println("Error closing stream : " + e.getMessage());
			} 
			
			if (verbose) {
				System.out.println("Connection closed.\n");
			}
    }
  }

  public static void printServerInfo() {
    System.out.println("===========================");
    System.out.println("Running on 0.0.0.0:3000");
    System.out.println("===========================");
  }
}