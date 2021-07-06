package com.pojo;
import java.util.Comparator;
public class ProductComparator implements Comparator<Product> {
    /*
    1 - if productOne price is greater than productTwo
    -1 - if productTwo price is greater than productOne
    0 - if products are of the same price
     */
    @Override
    public int compare(Product productOne, Product productTwo) {
        if(productOne.getPrice() > productTwo.getPrice()){
            return 1;
        }else if(productOne.getPrice() < productTwo.getPrice()){
            return -1;
        }
        return 0;
    }
}