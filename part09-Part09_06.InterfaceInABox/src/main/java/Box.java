
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
public class Box implements Packable {

    private double weight;
    private double capacity;
    private ArrayList<Packable> items;

    public Box(double capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>();
        this.weight = 0;
    }

    @Override
    public double weight() {
        double totalWeight = 0;
        for (Packable item : items){
            totalWeight += item.weight();
        }
        
        return totalWeight;
    }

    public void add(Packable item) {
        if (this.weight + item.weight() <= capacity) {
            this.items.add(item);
            this.weight += item.weight();
        }

    }
    
    public String toString(){
        return "Box: " + this.items.size() + " items, total weight " + this.weight + " kg";
    }

}
