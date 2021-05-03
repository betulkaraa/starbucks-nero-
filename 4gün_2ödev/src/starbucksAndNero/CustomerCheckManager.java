package starbucksAndNero;

public class CustomerCheckManager implements CheckingManager {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		
		return true;
	}

}