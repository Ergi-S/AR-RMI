package babystep;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IPrinter extends Remote{
	
	public void printLine(String s) throws RemoteException;

}
