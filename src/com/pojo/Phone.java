package com.pojo;
public class Phone extends Product{
    String type; //Iphone/ android;
    String brand;
    String version;
    public Phone(String brand, double inputPrice, ECommerceProductType eCommerceProductType) {
        super(inputPrice, eCommerceProductType);
        this.brand = brand;


    }
    public Phone(String lineFromFile) {
        //BOOK, ISNB001, 29.34,  How to program in java,  John Doe
        super(lineFromFile); //Come back and discuss this
        String[] detailsOfBookAsArray = lineFromFile.split(",");
        String productIdentifier = detailsOfBookAsArray[0];
        String productCode = detailsOfBookAsArray[1];
        String price = detailsOfBookAsArray[2];
        String brand = detailsOfBookAsArray[3];
        String version = detailsOfBookAsArray[4];
        this.eCommerceProductType = ECommerceProductType.valueOf(productIdentifier);
        this.brand = brand;
        this.version = version;

    }

    @Override
    public void printProductDetails() {
        System.out.println("*********************************");
        System.out.println("Product is a "+eCommerceProductType);
        System.out.println("Phone brand is :"+brand);
        System.out.println("Phone ID is :"+productCode);
        System.out.println("Phone software is :"+version);
        System.out.println("Phone price is :"+price);
        System.out.println("*********************************");
    }
}
