import com.pojo.Book;
import com.pojo.Computer;
import com.pojo.Phone;
import com.pojo.Product;

import java.io.File;
import java.util.Scanner;
public class ECommerceWithInventory {
    public static void main(String args[]) throws Exception{
        File file = new File("/Users/gamin/Documents/sample.txt");
        Scanner myReader = new Scanner(file);
        Inventory inventory = new Inventory();
        while (myReader.hasNextLine()) {
            String line = myReader.nextLine();
//            System.out.println(line);
            String[] productArray = line.split(",");
            if(productArray[0].equals("BOOK")) {
                Book book = new Book(line);
                inventory.addInventory(book);
            }
            if(productArray[0].equals("COMPUTER")) {
                Computer computer = new Computer(line);
                inventory.addInventory(computer);
            }
            if(productArray[0].equals("PHONE")) {
                Phone phone = new Phone(line);
                inventory.addInventory(phone);
                //Initialize phone
            }
        }
        inventory.printInventory();
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter product you want to purchase");
        String product = userInput.nextLine();
        Product product1 = inventory.removeFromInventory(product);
        Orders orders = new Orders();
        orders.addProduct(product1);
        inventory.printInventory();
        orders.printOrder();
    }
}