package application;

import java.time.LocalDate;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Department obj = new Department(1, "Books");	
		
		Seller seller = new Seller(21, "Bob", "bob@gmail.com", LocalDate.now(), 3000.0, obj);
		
		// O programa não conhece a implementação - injeção de dependência sem explicitar a implementação
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println(seller);
	}

}
