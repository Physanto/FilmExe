/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.SQLException;
import java.util.ArrayList;
import model.Seat;
import model.SeatDAO;

/**
 *
 * @author Devil
 */
public class SeatController {

    private SeatDAO seatDAO;

    public SeatController() {
        seatDAO = new SeatDAO();
    }

    public boolean insertAllSeats(String[] seats) {
        return seatDAO.insertSeats(seats);
    }

    public Seat searchSeat(String name) {

        try {
            return seatDAO.searchSeat(name);
        } catch (SQLException ex) {
            return null;
        }
    }
	public ArrayList<Seat> searchSeats(ArrayList<String> names) {

        try {
            return seatDAO.searchSeats(names);
        } catch (SQLException ex) {
            return null;
        }
    }

	public ArrayList<Seat> seatDisponibles(){
		try {
			return seatDAO.seatDisponible();
		} catch (SQLException e) {
			System.out.println("error "+e.toString());
			return null;
		}
	}
}
