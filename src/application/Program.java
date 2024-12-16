package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {	
		
		// O programa não conhece a implementação - injeção de dependência sem explicitar a implementação
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== TEST 1: seller findByID =====");
		Seller seller = sellerDao.findById(3);
		
		System.out.println(seller);
	}

}
