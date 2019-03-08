package babystep;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
	static Printer p;
	  public static void main(String[] args) {
		  p = new Printer();
	        String host = (args.length < 1) ? null : args[0];
	        try {
	            Registry registry = LocateRegistry.getRegistry(host);
	            Printer stub = (Printer) registry.lookup("Hello");
	            stub.printLine("Hello World");
	        } catch (Exception e) {
	            System.err.println("Client exception: " + e.toString());
	            e.printStackTrace();
	        }
	    }

}
