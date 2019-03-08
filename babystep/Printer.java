package babystep;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Printer extends UnicastRemoteObject implements IPrinter {
	protected Printer() throws RemoteException {
		super();
	}

	public void printLine(String s) throws RemoteException {
		System.out.println(s);
	}
}
