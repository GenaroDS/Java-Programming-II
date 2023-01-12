/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author -G
 */
public class Organism implements Movable{
    private int dx;
    private int dy;   

    public Organism(int dx, int dy) {
        this.dx = dx;
        this.dy = dy;
    }

    @Override
    public void move(int dx, int dy) {
        this.dx+=dx;
        this.dy+=dy;
    }
    
    @Override
    public String toString(){
        return "x: " + this.dx + "; y: " + this.dy;
    }
    
    
    
}
