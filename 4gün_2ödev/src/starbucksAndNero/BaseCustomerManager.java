package starbucksAndNero;


public abstract class BaseCustomerManager implements CustomerInterface{

	public void save(Customer customer) {
		System.out.println("Veritaban�na kaydedildi. " + customer.getFirstName());
		
	}
}