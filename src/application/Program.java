package application;



import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		Department obj = new Department(1, "Books");
		
		
		Seller seller = new Seller(21, "bob", "bob@gmail.com", null, 3000.0, obj);
		
		System.out.println(seller);

	}

}
