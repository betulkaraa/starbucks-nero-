package starbucksAndNero;

import java.rmi.RemoteException;


public class MernisServiceAdapter implements CheckingManager {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		
		KPSPublicSoap client = new KPSPublicSoapProxy();
		boolean result = false;
		try {
			result = client.TCKimlikNoDogrula(customer.getNationalityId(), customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(), customer.getBirthDate().getYear());
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return result;
	}

}