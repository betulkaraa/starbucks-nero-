package starbucksAndNero;



public class StarbucksCustomerManager extends BaseCustomerManager{
	
	CheckingManager checkingManager;

	public StarbucksCustomerManager(CheckingManager checkingManager) {
		super();
		this.checkingManager = checkingManager;
	}

	public StarbucksCustomerManager(MernisServiceAdapter mernisServiceAdapter) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void save(Customer customer) {
		
		if(checkingManager.checkIfRealPerson(customer)) {
			System.out.println("Veritabanna kaydedildi. " + customer.getFirstName());
		}else {
			System.out.println("Kimlik bilgileri hatal.");
		}
		
	}

}