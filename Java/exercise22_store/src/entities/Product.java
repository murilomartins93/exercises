package entities;

public class Product {
	
    private String name;
    private Double purchasePrice;
    private Double salePrice;
    
    public Product() {
    }
    
    public Product(String name, Double purchasePrice, Double salePrice) {
        this.name = name;
        this.purchasePrice = purchasePrice;
        this.salePrice = salePrice;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public Double getPurchasePrice() {
        return purchasePrice;
    }
    
    public void setPurchasePrice(Double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }
    
    public Double getSalePrice() {
        return salePrice;
    }
    
    public void setSalePrice(Double salePrice) {
        this.salePrice = salePrice;
    }
    
    public double profit() {
        return (salePrice / purchasePrice - 1.0) * 100.0;
    }
}