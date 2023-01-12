/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author -G
 */
public class Container {

    int amount;

    public Container() {
        this.amount = 0;
    }

    public int contains() {
        return this.amount;
    }

    public void add(int toAdd) {
        if (toAdd > 0) {
            this.amount += toAdd;
        }
        if (this.amount > 100) {
            this.amount = 100;
        }
    }

    public void remove(int toRemove) {
        if (toRemove > 0) {
            this.amount -= toRemove;
        }
        if (this.amount < 0) {
            this.amount = 0;
        }
    }
    
    public String toString(){
        return this.amount + "/100";
    }
}
