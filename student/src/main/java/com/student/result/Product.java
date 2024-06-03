package com.student.result;

public class Product {

	private int id;
	private String pName;
	private int quantity;
	private Double price;
	private Double discount;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Double getDiscount() {
		return discount;
	}
	public void setDiscount(Double discount) {
		this.discount = discount;
	}
	public Product(int id, String pName, int quantity, double price, Double discount) {
		super();
		this.id = id;
		this.pName = pName;
		this.quantity = quantity;
		this.price = price;
		this.discount = discount;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", pName=" + pName + ", quantity=" + quantity + ", price=" + price + ", discount="
				+ discount + "]";
	}
	
	public void getDetails() {
		System.out.println("product name : "+pName+"\n"+
				"product quantity : "+quantity+"\n"+
				"product price : "+price+"\n"+
				"product Discount : "+discount
				);
		
		Double finalPrice = price - (price * discount/100);
		System.out.println("final price after discount : "+finalPrice);
		Double totalPrice = quantity*finalPrice;
		System.out.println("total price : "+totalPrice);
		Double totalProfit = ((quantity*price)-finalPrice);
		System.out.println("total profit : "+totalProfit);
		
	}
	
	
	
	
	
}
