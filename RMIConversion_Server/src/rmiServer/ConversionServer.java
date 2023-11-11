package rmiServer;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

import rmiService.ConversionImpl;


public class ConversionServer {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		try {
			//creer un annuaire
			LocateRegistry.createRegistry(1999);
			//la creation de skeleton ,od=objet distant
			ConversionImpl od=new  ConversionImpl();
			System.out.println("od.toString()");
			//bch na3mel Rebind
			//skeleton bch yaaml l exportation de lobject dans l annuaire et rebund va faire la publication de lobjet
			//od jouer le role de l implementation de l,interface et une skeleton
			//publier la reference de lobjet distant dans l'annuaire
			
			Naming.rebind("rmi://localhost:1099/OD",od);
			
			
			
		} catch (RemoteException e){
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
