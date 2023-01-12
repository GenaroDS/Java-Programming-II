/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author -G
 */
public class ProductWarehouseWithHistory extends ProductWarehouse {

    private ChangeHistory history;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        history = new ChangeHistory();
        this.history.add(initialBalance);
        super.addToWarehouse(initialBalance);
    }

    public String history() {
        return this.history.toString();
    }

    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        this.history.add(super.getBalance());
    }
    
    public double takeFromWarehouse(double amount) {
        double toReturn = super.takeFromWarehouse(amount);
        this.history.add(super.getBalance());
        return toReturn;
    }
    
    public void printAnalysis(){
        
        System.out.println("Product: " + this.getName() + "\n" +
                "History: "+ this.history.toString()+ "\n" +
                "Largest amount of product: " + this.history.maxValue() + "\n" +
                "Smallest amount of product: " + this.history.minValue() + "\n" +
                "Average: " + this.history.average());
        
        
    }
    
    
}
