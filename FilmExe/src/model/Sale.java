
package model;

import java.time.LocalDateTime;

/**
 *
 * @author initmanfig
 */
public class Sale {
	private int id;
	private double total;
	private LocalDateTime star_date;
	private LocalDateTime end_date;

	public Sale(int id, double total, LocalDateTime star_date, LocalDateTime end_date) {
		this.id = id;
		this.total = total;
		this.star_date = star_date;
		this.end_date = end_date;
	}

	public Sale(double total, LocalDateTime star_date, LocalDateTime end_date) {
		this.total = total;
		this.star_date = star_date;
		this.end_date = end_date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public LocalDateTime getStar_date() {
		return star_date;
	}

	public void setStar_date(LocalDateTime star_date) {
		this.star_date = star_date;
	}

	public LocalDateTime getEnd_date() {
		return end_date;
	}

	public void setEnd_date(LocalDateTime end_date) {
		this.end_date = end_date;
	}	
}
