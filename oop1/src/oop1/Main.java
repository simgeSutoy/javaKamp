package oop1;

public class Main {

	public static void main(String[] args) {
		String mesaj="Vade oranı";
		
		Product product1 = new  Product();
		product1.setName("Delongi kahve makinesi");
		product1.setDiscount(7);
		product1.setUnitsInStock(3);
		product1.setImageUrl("image1.jpg");
		
		
		
		Product product2 = new  Product();
		product2.setName("smeg kahve makinesi");
		product2.setDiscount(7);
		product2.setUnitsInStock(3);
		product2.setImageUrl("image2.jpg");
		 
		Product product3 = new  Product();
		product3.setName("Kitchen Aid kahve makinesi");
		product3.setDiscount(7);
		product3.setUnitsInStock(3);
		product3.setImageUrl("image3.jpg");
		   
		
		
		Product[] products = { product1,product2,product3};
		
		System.out.println("<ul>");
		for (Product product : products) {
			System.out.println("<li>" + product.getName() +"</li>");
			
		}
		System.out.println("</ul>");
		 
		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhone("057847");
		individualCustomer.setCustomerNumber("6316");
		individualCustomer.setFirstName("simge");
		individualCustomer.setLastName("toy");
		
		CorporateCustomer corporateCustomer = new CorporateCustomer() ;
		corporateCustomer.setId(2);
		corporateCustomer.setCompanyName("Kodlama.io");
		corporateCustomer.setPhone("364563");
		corporateCustomer.setTaxNumber("72676");
		corporateCustomer.setCustomerNumber("378");
		
		Customer[] customer = {individualCustomer,corporateCustomer};
		
		
		
		
		
		
	}

}
