package babystep;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
	private static String host = "localhost";
	private static int port = 12556;
	  public static void main(String[] args) throws RemoteException {

	        
	        try {
	            Registry registry = LocateRegistry.getRegistry(port);
	            IPrinter stub = (IPrinter) registry.lookup("Hello");
	            stub.printLine("Hello World");
	        } catch (Exception e) {
	            System.err.println("Client exception: " + e.toString());
	            e.printStackTrace();
	        }
	    }

}
