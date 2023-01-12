
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
public class Herd implements Movable {

    private ArrayList<Movable> herd;

    public Herd() {
        this.herd = new ArrayList<>();
    }

    @Override
    public void move(int dx, int dy) {
        for (Movable movable : herd) {
            movable.move(dx, dy);
        }
    }

    public void addToHerd(Movable movable) {
        this.herd.add(movable);
    }

    public Herd(ArrayList<Movable> herd) {
        this.herd = herd;
    }

    @Override
    public String toString() {
        String toReturn = "";
        for (Movable movable : herd) {
             toReturn+=movable;
             toReturn+="\n";
        }
        toReturn.trim();
        return toReturn;
    }

}
