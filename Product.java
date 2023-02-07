package com.app.pojos;

import java.time.LocalDate;

import javax.persistence.*;

@Entity
@Table(name = "product")
public class Product extends BaseEntity {
	@Column(length = 20,nullable = false)
	private String pname;
	@Column(length = 30,nullable = false)
	private String description;
	@Column(nullable = false)
	private int quantity;
	@Column(nullable = false)
	private double price;
	@Column(nullable = false)
	private LocalDate mgfdate;
	
	public Product() {
		super();
	}
	public Product(String pname, String description, int quantity, double price, LocalDate mgfdate) {
		super();
		this.pname = pname;
		this.description = description;
		this.quantity = quantity;
		this.price = price;
		this.mgfdate = mgfdate;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public LocalDate getMgfdate() {
		return mgfdate;
	}
	public void setMgfdate(LocalDate mgfdate) {
		this.mgfdate = mgfdate;
	}
	@Override
	public String toString() {
		return "Product"+getId()+" [pname=" + pname + ", description=" + description + ", quantity=" + quantity + ", price="
				+ price + ", mgfdate=" + mgfdate + "]";
	}

}
