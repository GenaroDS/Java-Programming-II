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

public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> dictionary;

    public DictionaryOfManyTranslations() {
        this.dictionary = new HashMap<>();
    }

    public void add(String word, String translation){
        dictionary.putIfAbsent(word, new ArrayList<>());
        ArrayList<String> words = dictionary.get(word);
        words.add(translation);
    }

    public ArrayList<String> translate(String word){
        if (dictionary.containsKey(word)){
            return dictionary.get(word);

        }
        return new ArrayList<>();
    }

    public void remove(String word){
        if (dictionary.containsKey(word)){
            dictionary.remove(word);
        }
    }

}