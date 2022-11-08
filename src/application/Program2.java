package application;

import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao department = new DaoFactory().createDepartmentDao();
		
		System.out.println("\n=== TEST 1: department insert ===");
		Department dep = new Department(3, "Fotball");
		System.out.println("Inserted! New id = " + dep.getId());
		
		System.out.println("\n=== TEST 2: department delete ===");
		System.out.print("Enter id for delete test: ");
		int id = sc.nextInt();
		
		System.out.println("\n=== TEST 3: department update ===");
		dep = department.findById(1);
		dep.setName("Actor");
		department.update(dep);
		System.out.println("Update completed");
		
	}

}
