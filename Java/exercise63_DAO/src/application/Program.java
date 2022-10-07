package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		DepartmentDao deptDao = DaoFactory.createDepartmentDao();

 		System.out.println("=== SellerDao ====\n");
 		System.out.println("=== TEST 1: seller findById ====");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("\n=== TEST 2: seller findByDepartment ====");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for (Seller sell : list) {
			System.out.println(sell);
		}
		
		System.out.println("\n=== TEST 3: seller findAll ====");
		list = sellerDao.findAll();
		for (Seller sell : list) {
			System.out.println(sell);
		}	
		
		System.out.println("\n=== TEST 4: seller insert ====");
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New id = " + newSeller.getId());
		
		System.out.println("\n=== TEST 5: seller update ====");
		seller = sellerDao.findById(1);
		seller.setName("Marta White");
		seller.setEmail("marta@gmail.com");
		sellerDao.update(seller);
		System.out.println("Update completed!");
		
		System.out.println("\n=== TEST 6: seller delete ====");
		System.out.print("Enter id for delete test: ");
		int id = sc.nextInt();
		sellerDao.deleteById(id);
		System.out.println("Delete completed!");

		System.out.println("\n=== DepartmentDao ====");
		
 		System.out.println("=== TEST 7: department findById ====");
		Department dept = deptDao.findById(4);
		System.out.println(dept);
		
		System.out.println("=== TEST 8: department findByName ====");
		dept = deptDao.findByName("Fashion");
		System.out.println(dept);
		
		System.out.println("=== TEST 9: department findAll ====");
		List<Department> deptList = deptDao.findAll();
		for (Department d : deptList) {
			System.out.println(d);
		}
		
		System.out.println("\n=== TEST 10: department delete ====");
		System.out.print("Enter id for delete test: ");
		id = sc.nextInt();
		deptDao.deleteById(id);
		System.out.println("Delete completed!");
			
		System.out.println("\n=== TEST 11: department insert ====");
		Department newDept = new Department(null, "Decoration");
		deptDao.insert(newDept);
		System.out.println("Inserted! New id = " + newDept.getId());
			
		System.out.println("\n=== TEST 12: department update ====");
		dept = deptDao.findById(6);
		dept.setName("Food");
		deptDao.update(dept);
		System.out.println("Update completed!");
	
		sc.close();
	}
}
