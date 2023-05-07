package models;

public class Product {
    private String productName;
    private double productPrice;

    public Product() {
    }

    public Product(String productName, double productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getproductPrice() {
        return productPrice;
    }

    public void setproductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    @Override
    public String toString() {
        return "Product" +
                "productName = '" + productName + '\'' +
                ", productPrice = " + productPrice;
    }
}
