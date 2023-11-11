package rmiClient;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import rmiService.IConversion;
public class ConversionClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		try {
			//lookup traja3li haja de type remote
			IConversion stub=(IConversion)Naming.lookup("rmi://localhost:1099/OD");
			System.out.println(stub.convertirMontant(150.00));
			System.out.println(stub.convertirMontant(180.00));
			
			
			
		} catch (MalformedURLException | RemoteException | NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
