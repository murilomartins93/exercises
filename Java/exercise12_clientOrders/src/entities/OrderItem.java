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
		price = product.getPrice();
	}
		
	public Double getPrice() {
		return price;
	}

	public Integer getQuantity()  {
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
		return price * quantity;
	}
	
	@Override
	public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(product);
        sb.append(", Quantity: " + quantity);
        sb.append(", Subtotal: $" + String.format("%.2f", subTotal()));
        return sb.toString();
    }
}