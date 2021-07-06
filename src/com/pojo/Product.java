package com.pojo;
public abstract class Product {
    protected double price;
    protected String productCode;
    protected ECommerceProductType eCommerceProductType;
    public Product(double inputPrice, ECommerceProductType eCommerceProductTypeInputArgument) {
        this.eCommerceProductType = eCommerceProductTypeInputArgument;
        this.price = inputPrice;
    }
    public Product(String line) {
        String[] detailsOfBookAsArray = line.split(",");
        String productIdentifier = detailsOfBookAsArray[0];
        String productCode = detailsOfBookAsArray[1];
        String price = detailsOfBookAsArray[2];
        this.price = Double.parseDouble(price);
        this.productCode = productCode;
    }
    public double getPrice() {
        return price;
    }
    public String getProductCode(){
        return productCode;
    }
    public abstract void printProductDetails();
}