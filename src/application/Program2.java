package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n=== TEST 4: seller insert ===");
		Department dep = new Department(3, "Fotball");
		System.out.println("Inserted! New id = " + dep.getId());
	}

}
