package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class JdbcProductDao implements ProductDao {
	public void add(Product product) {
		// sadece ve sadece db eri�im kodlar� buraya yaz�l�r...
		System.out.println("JDBC ile veritaban�na eklendi");
	}
}