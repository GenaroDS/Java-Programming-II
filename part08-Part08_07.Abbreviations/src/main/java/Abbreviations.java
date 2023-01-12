
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author -G
 */
public class Abbreviations {

    private HashMap<String, String> map;

    public Abbreviations() {
        this.map = new HashMap<>();
    }
    
    public void addAbbreviation(String key, String value){
        this.map.put(key, value);
    }
    
    public boolean hasAbbreviation(String abbreviation){
        return this.map.containsKey(abbreviation);
    }
    
    public String findExplanationFor(String abbreviation){
        if (this.map.containsKey(abbreviation)) {
            return this.map.get(abbreviation);
        } else{
            return null;
        }
        
    }
}
