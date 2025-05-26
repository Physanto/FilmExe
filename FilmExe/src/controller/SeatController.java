/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.SQLException;
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
}
