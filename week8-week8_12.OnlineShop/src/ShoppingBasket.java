
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
public class ShoppingBasket {
    private List<Purchase> basket;

    public ShoppingBasket(){
        this.basket=new ArrayList<Purchase>();
    }

    public void add(String product, int price){
        Purchase purchase = new Purchase(product, 1,price);
        if(!this.basket.contains(product)){
            this.basket.add(purchase);
        }else{
           purchase.increaseAmount();
                }
    }
    public int price(){
        int price=0;
        if(basket.size()==0){
            return 0;
        }else{
            for(Purchase itemPrice : basket){
                price+=itemPrice.price();
            }
            return price;
        }
    }
    public void print(){
        HashMap<String, Integer> shoppingBasket = new HashMap<String, Integer>();
        for(Purchase product : this.basket){
            String itemName = product.name();
            if(shoppingBasket.containsKey(itemName)){
                shoppingBasket.put(itemName,shoppingBasket.get(itemName)+1);
                }else{
                shoppingBasket.put(itemName,1);
            }
            }
            for(String key : shoppingBasket.keySet()){
                System.out.println(key + ": " + shoppingBasket.get(key));
            }
        }
        }



