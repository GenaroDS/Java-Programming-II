
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author -G
 */
public class BoxWithMaxWeight extends Box{
    private int capacity;
    private ArrayList<Item> items;
    
    public BoxWithMaxWeight(int capacity){
        super();
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }
    

    @Override
    public void add(Item item) {
        int currentWeight = 0;
        for (Item items : items){
            currentWeight+= items.getWeight();
        }
        if (currentWeight + item.getWeight() <= capacity) {
            items.add(item);
            
        }
    }

    @Override
    public boolean isInBox(Item item) {
        return items.contains(item);
    }
    
}
