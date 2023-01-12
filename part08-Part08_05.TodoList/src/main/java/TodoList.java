/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author -G
 */
import java.util.ArrayList;
import java.util.List;


public class TodoList {
    private List<String> list;

    public TodoList(){
        this.list = new ArrayList<>();
    }

    public void add(String toAdd){
        this.list.add(toAdd);
    }

    public void remove(int index){
        this.list.remove(index-1);
    }

    public void print(){
        int i = 1;
        for (String things : list){
            System.out.println( i+ ": " + things);
            i++;
        }
    }

}
