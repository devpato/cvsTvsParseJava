package com.is.dev.assessment.domain;


public class Product {
	private String title;
	private String upc;
	private String sku;
	private String price;
	private String condition;
	private String quantity;
	
	public Product (String title, String upc, String sku, String price, String condition, String quantity) {
		this.title = title;
		this.upc = upc;
		this.sku = sku;
		this.price = price;
		this.condition = condition;
		this.quantity = quantity;		
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUpc() {
		return upc;
	}

	public void setUpc(String upc) {
		this.upc = upc;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

}
