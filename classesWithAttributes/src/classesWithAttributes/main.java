package classesWithAttributes;

public class main {

	public static void main(String[] args) {
	Product product=new Product(1,"laptop","Asus laptop",30000,2,"siyah");
	//public Product=new Product() ;
	//product.name="Laptop";
	//product.setId(1);
	//product.description="Asus Laptop";
	//product.price=5000;
	//product.stockAmount=3;
	
	
	
	ProductManager productManager=new ProductManager();
	productManager.Add(product);
	System.out.println(product.getKod());
	
	
	

	}

}
