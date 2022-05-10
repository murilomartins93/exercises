package entities;

public class OrderItem {

	private Integer quantity;
	private Double price;
	
	private Product product;
	
	public OrderItem() {	
	}
	
	public OrderItem(Integer quantity, Product product) {	
		this.quantity = quantity;
		this.product = product;
		price = subTotal();
	}
		
	public Double getPrice() {
		return price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public double subTotal(){
		price = quantity * product.getPrice();
		return price;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(product.getName());
		sb.append(", $");
		sb.append(String.format("%.2f", product.getPrice()));
		sb.append(", Quantity: ");
		sb.append(quantity);
		sb.append(", Subtotal: $");
		sb.append(String.format("%.2f", subTotal()));
		return sb.toString();
	}

}