package oopWithNLayeredApp.dataAcess;

import oopWithNLayeredApp.entities.Product;

public class HibernateProductDao implements ProductDao {
	public void add(Product product) {
		// sadece ve sadce db erişim kodları buraya yazılır....SQL
		System.out.println("Hibernate ile veritabanına eklendi");	
	}

}
