package starbucksAndNero;

import java.sql.Date;

public class Main {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		BaseCustomerManager customerManager = new NeroCustomerManager();
		BaseCustomerManager customerManager2 = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(new Customer(29, "mahmut", "özel", new Date(2000, 1, 29), 11111111111l));
		customerManager2.save(new Customer(29, "mahmut", "özel", new Date(2000, 1, 29), 11111111111l));

	}

}
