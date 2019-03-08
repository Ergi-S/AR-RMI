package babystep;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Server {
	private static int port = 12556;
	public static void main(String[] args) throws RemoteException {
		  try {
	            IPrinter printer = new Printer();

	            // Bind the remote object's stub in the registry
	            Registry registry = LocateRegistry.createRegistry(port);
	            registry.bind("Hello", printer);

	            System.out.println("Server ready");
	        } catch (Exception e) {
	            System.err.println("Server exception: " + e.toString());
	            e.printStackTrace();
	        }

	}


}
