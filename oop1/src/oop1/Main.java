package oop1;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Vade oraný";

		Product product1 = new Product();
		product1.setName("Delonghi Kahve Makinesi");
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setUnitsInStock(3);
		product1.setImageUrl("image1.jpg");

		Product product2 = new Product();
		product2.setName("Smeg Kahve Makinesi");
		product2.setDiscount(4);
		product2.setUnitPrice(6500);
		product2.setUnitsInStock(3);
		product2.setImageUrl("image2.jpg");

		Product product3 = new Product();
		product3.setName("Kitchen Aid Kahve Makinesi");
		product3.setDiscount(8);
		product3.setUnitPrice(5500);
		product3.setUnitsInStock(2);
		product3.setImageUrl("image3.jpg");
		
		Product[] products = {product1,product2,product3};
		
		for (Product product : products) {
			System.out.println(product.getName());
		}
		
		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhone("08213428193");
		individualCustomer.setCustomerNumber("12345");
		individualCustomer.setFirstName("Can");
		individualCustomer.setLastName("Kartal");
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setConpanyName("Kodlama.io");
		corporateCustomer.setPhone("02371298732");
		corporateCustomer.setTaxNumber("1234567896");
		corporateCustomer.setCustomerNumber("54321");
		
		Customer[] customers = {individualCustomer,corporateCustomer};
		
		for (Customer customer : customers) {
			System.out.println(customer.getId());
		}
	}
}