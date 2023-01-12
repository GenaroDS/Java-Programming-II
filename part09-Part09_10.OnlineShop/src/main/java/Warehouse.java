
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author -G
 */
public class Warehouse {

    private Map<String, Integer> productsPrice;
    private Map<String, Integer> productsStock;

    public Warehouse() {
        this.productsPrice = new HashMap<>();
        this.productsStock = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        productsPrice.put(product, price);
        productsStock.put(product, stock);
    }

    public int price(String product) {
        if (this.productsPrice.keySet().contains(product)) {
            return this.productsPrice.get(product);
        }
        return -99;
    }

    public int stock(String product) {
        if (this.productsStock.keySet().contains(product)) {
            return this.productsStock.get(product);
        }
        return 0;
    }
    
    public boolean take(String product){
        if (this.productsStock.keySet().contains(product)){
            int num = this.productsStock.get(product);
            if (num == 0){
                return false;
            }
            num--;
            this.productsStock.put(product, num);            
            return true;
        }
        return false;
    }
    
    public Set<String> products(){
        return this.productsPrice.keySet();
    }

}
