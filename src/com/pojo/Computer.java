package com.pojo;
public class Computer extends Product {
    String brand;
    public Computer(String brand, double inputPrice, ECommerceProductType eCommerceProductType) {
        super(inputPrice, eCommerceProductType);
        this.brand = brand;
    }
    public Computer(String lineFromFile) {
        //COMPUTER, MAC14INC, 1200, Mac
        super(lineFromFile); //Come back and discuss this
        String[] detailsOfBookAsArray = lineFromFile.split(",");
        String productIdentifier = detailsOfBookAsArray[0];
        String productCode = detailsOfBookAsArray[1];
        String price = detailsOfBookAsArray[2];
        String brand = detailsOfBookAsArray[3];
        this.brand = brand;
        this.eCommerceProductType = ECommerceProductType.valueOf(productIdentifier);

    }
    @Override
    public void printProductDetails() {
        System.out.println("*********************************");
        System.out.println("Product is a "+eCommerceProductType);
        System.out.println("Computer ID is... " + productCode);
        System.out.println("Brand of computer is... " + brand);
        System.out.println("Computer price is... " + price);
        System.out.println("*********************************");
    }
}