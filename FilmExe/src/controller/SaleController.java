package controller;

import java.sql.SQLException;
import model.Sale;
import model.SaleDAO;

/**
 *
 * @author initmanfig
 */
public class SaleController {

	SaleDAO saleDAO;

	public SaleController(){
		saleDAO = new SaleDAO();
	}

	public boolean makeSale(Sale sale, int idPerson){
		return saleDAO.makeSale(sale, idPerson);
	}

	public Sale searchSale(int idPerson){
		try{
			return saleDAO.searchSale(idPerson);
		}
		catch(SQLException ex){
			return null;
		}
	}

	public boolean updateSaleTotal(int idSale){
		return saleDAO.updateSaleTotal(idSale);
	}
}
