import com.pojo.Product;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class Inventory {
    List inventoryList = new ArrayList();
    public void addInventory(Product product) {
        inventoryList.add(product);
    }
    public void printInventory() {
        Iterator productIterator = inventoryList.iterator();
        while(productIterator.hasNext()){
            Product product = (Product) productIterator.next();
            product.printProductDetails();
        }
    }
    public Product removeFromInventory(String productCode){
        for(int i = 0; i < inventoryList.size(); i++){
            Product product = (Product)inventoryList.get(i);
            System.out.println(product.getProductCode());

            if(product.getProductCode().trim().equals(productCode)) {
                //remove element from inventory
                return (Product) inventoryList.remove(i);
            }
        }
        return null;
    }
}