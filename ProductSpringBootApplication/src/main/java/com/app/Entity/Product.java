package com.app.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="products")
public class Product extends BaseEntity {
	@Column(name="pname",length=20)
	private String productname;
	@Column(length=20)
	private int quantity;
	@Column(length=20)
	private double price;
	@Column(name="descript",length=20)
	private String description;
	
	public Product() {
		System.out.println("In default ctr of Product");
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Product [productname=" + productname + ", quantity=" + quantity + ", price=" + price + ", description="
				+ description + "]";
	}
	

}
