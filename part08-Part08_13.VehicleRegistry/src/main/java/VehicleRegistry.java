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

public class VehicleRegistry {
    private HashMap<LicensePlate, String> owners;

    public VehicleRegistry() {
        owners = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner){
        if (owners.containsKey(licensePlate)){
            return false;
        }
        
         owners.put(licensePlate,owner);
         return true;
        
    }

    public String get(LicensePlate licensePlate){
        if (owners.containsKey(licensePlate)){
            return owners.get(licensePlate);
        }
        return null;
    }

    public boolean remove(LicensePlate licensePlate){
        if (owners.containsKey(licensePlate)){
            owners.remove(licensePlate);
            return true;
        }
        return false;
    }

    public void printLicensePlates(){
        for (LicensePlate plates : this.owners.keySet()){
            System.out.println(plates);
        }
    }

    public void printOwners(){
        ArrayList<String> list = new ArrayList<>();
        for (String owners : owners.values()){
            if (!list.contains(owners)){
                list.add(owners);
                System.out.println(owners);
            }
            
        }
    }
}



