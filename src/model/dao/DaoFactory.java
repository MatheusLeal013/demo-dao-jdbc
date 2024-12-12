package model.dao;

import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {

	// Classe vai expor um método que retorna o tipo da interface
	public static SellerDao createSellerDao() {
		// Internamente vai instanciar uma implementação - Macete para não expor a implementação
		return new SellerDaoJDBC();
	}
}
