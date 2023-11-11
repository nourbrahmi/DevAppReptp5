package rmiService;

import java.rmi.Remote;
import java.rmi.RemoteException;
//Nour Brahmi LSI3.1.2
public interface IConversion extends Remote {
	public double convertirMontant(double mt) throws RemoteException;

}
