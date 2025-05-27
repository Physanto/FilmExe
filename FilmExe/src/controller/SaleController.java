package controller;

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
}
