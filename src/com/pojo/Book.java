package com.pojo;
import com.exceptions.CustomException;
import com.exceptions.InvalidPriceException;
public class Book extends Product{
    private String title;
    private String author;
    public Book(String newTitle, String newAuthor, double price, ECommerceProductType eCommerceProductType) throws InvalidPriceException, CustomException{
        super(price, eCommerceProductType);
        if(newTitle == null) {
            throw new CustomException("Invalid title provided");
        }
        title = newTitle;
        author = newAuthor;
    }
    public Book(String lineFromFile) {
        //BOOK, ISNB001, 29.34,  How to program in java,  John Doe
        super(lineFromFile); //Come back and discuss this
        String[] detailsOfBookAsArray = lineFromFile.split(",");
        String productIdentifier = detailsOfBookAsArray[0];
        String productCode = detailsOfBookAsArray[1];
        String price = detailsOfBookAsArray[2];
        String bookTitle = detailsOfBookAsArray[3];
        String author = detailsOfBookAsArray[4];
        title = bookTitle;
        this.author = author;
        this.eCommerceProductType = ECommerceProductType.valueOf(productIdentifier);
    }
    //    public Book(String line) {
////        super();
//        String[] bookdetails = line.split(",");
//        //IBOOK, ISNB001, 29.34,  How to program in java,  John Doe
//       // bookdetails[0] -> IBOOK
//        // bookdetails[1] -> ISNB001
//        // bookdetails[2] -> 29.34
//        // bookdetails[3] -> How to program in java
//        title = bookdetails[3];
//    }
    public void printProductDetails(){
        System.out.println("*********************************");
        System.out.println("Product is a "+eCommerceProductType);
        System.out.println("Product ID Is... "+productCode);
        System.out.println("Title of book is... "+title);
        System.out.println("Author of book is... "+author);
        System.out.println("Book prices is... "+price);
        System.out.println("*********************************");
    }
}