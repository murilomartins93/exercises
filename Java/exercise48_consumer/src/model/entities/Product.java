package model.entities;

public class Product {
	
	private String name;
	private Double price;
	
	public Product() {
	}
	
	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public static void staticPriceUpdate(Product p) {
		p.setPrice(p.getPrice() * 1.1); // Works with argument
	}
	
	public void nonStaticPriceUpdate() {
		price *= 1.1; // Instance Method
	}
	
	@Override
	public String toString() {
		return "Product [" + name + ", " + String.format("%.2f", price) + "]";
	}	
		
}
