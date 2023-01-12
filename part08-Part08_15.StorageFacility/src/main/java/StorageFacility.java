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
import java.util.HashMap;

public class StorageFacility {
    private HashMap<String , ArrayList<String>> map;

    public StorageFacility() {
        this.map = new HashMap<>();
    }
    public void add(String unit, String item){
        this.map.putIfAbsent(unit, new ArrayList<>());
        ArrayList<String> list = this.map.get(unit);
        list.add(item);
    }
    public ArrayList<String> contents(String storageUnit){
        if (this.map.containsKey(storageUnit)){
            return this.map.get(storageUnit);
        }
        return new ArrayList<>();
    }

    public void remove(String storageUnit, String item){
        if (this.map.containsKey(storageUnit)){
            ArrayList<String> list = this.map.get(storageUnit);
            list.remove(item);
            if (list.size() == 0){
                this.map.remove(storageUnit);
            }
        }
    }

    public ArrayList<String> storageUnits(){
        ArrayList<String> list = new ArrayList<>();
        for (String key : this.map.keySet()){

            if (this.map.get(key).size()>0){
                list.add(key);
            }
        }
        return list;

    }

}

