package oopWithNLayeredApp;

import oopWithNLayeredApp.business.ProductManager;
import oopWithNLayeredApp.core.logging.DatabaselLogger;
import oopWithNLayeredApp.core.logging.FileLogger;
import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.core.logging.MailLogger;
import oopWithNLayeredApp.dataAcess.HibernateProductDao;
import oopWithNLayeredApp.dataAcess.JdbcProductDao;
import oopWithNLayeredApp.entities.Product;

public class main {

	public static void main(String[] args) throws Exception {
		Product product1=new Product(1,"Iphone Xr",10000);
		
		
		Logger[] loggers= { };
		 
		ProductManager productManager=new ProductManager(new HibernateProductDao(),loggers);
		productManager.add(product1);
				
	}

}
