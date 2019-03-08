package babystep;

import java.rmi.Remote;

public interface IPrinter extends Remote{
	
	public void printLine(String s);

}
