import com.pojo.Book;
import com.pojo.Computer;
import com.pojo.Phone;
import com.pojo.Product;

public class Orders {
    Book[] books = new Book[10];
    Computer[] computers = new Computer[10];
    Phone[] phones = new Phone[10];
//    Computer[] computers = new Computer[10];

    Product products[] = new Product[10];

    public void addBook(Book newBook) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = newBook;
                break;
            }
        }
    }
//
//    public void addComputer(Computer computer) {
//        for (int i = 0; i < computers.length; i++) {
//            if (computers[i] == null) {
//                computers[i] = computer;
//                break;
//            }
//        }
//    }

    public void addProduct(Product product){
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                products[i] = product;
                break;
            }
        }
    }


    /*public void printOrder() {
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                books[i].printProductDetails();
            }
        }
    }
*/



    public void printOrder() {
       for (int i = 0; i < products.length; i++) {
           if (products[i] != null) {
                products[i].printProductDetails(); // BUG HERE

                //products[i].printBookDetails();
            }
        }
    }
}