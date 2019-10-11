import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Storehouse {
    private Map<String, Integer> productPrice;
    private Map<String, Integer> productStock;

    public Storehouse() {
        this.productPrice = new HashMap<String, Integer>();
        this.productStock = new HashMap<String, Integer>();

    }

    public void addProduct(String product, int price, int stock) {
        productPrice.put(product, price);
        productStock.put(product, stock);

    }

    public int price(String product) {
        if (!productPrice.containsKey(product)) {
            return -99;
        }else{
            return productPrice.get(product);
        }
    }

    public int stock(String product) {
        if (productStock.containsKey(product)) {

            return productStock.get(product);
        } else {
            return 0;
        }
    }

    public boolean take(String product) {
        if (productStock.containsKey(product) && productStock.get(product)>0){
                int stock = productStock.get(product);
                stock--;
                productStock.put(product, stock);
                return true;
        } else {
            return false;
        }
    }
    public Set<String> products (){
        Set<String> productInventory = new HashSet<String>();
        for(String products : productPrice.keySet()){
            productInventory.add(products);
        }
        return productInventory;
    }
    public boolean available(String product) {
        if (this.productStock.containsKey(product)) {
            return true;
        } else {
            return false;
        }

    }
    }
