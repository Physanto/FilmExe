package controller;

import model.SeatSaleDAO;

/**
 *
 * @author initmanfig
 */
public class SeatSaleController {	

	private SeatSaleDAO seatSaleDAO;

	public SeatSaleController(){
		seatSaleDAO = new SeatSaleDAO();
	}

	public boolean insertSeatSale(int idSale, int[] idSeat, double price){
		return seatSaleDAO.insertSeatSale(idSale, idSeat, price);
	}
}
