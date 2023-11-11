package rmiService;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ConversionImpl extends UnicastRemoteObject implements IConversion {

	public ConversionImpl() throws RemoteException {
		super();
		//super fait la creation de skeleton 
		//le constructeur de unicastremoteobject fait la creation de skeleton
		
	}

	@Override
	public double convertirMontant(double mt) throws RemoteException {
		// TODO Auto-generated method stub
		return mt*3.3;
	}

}
