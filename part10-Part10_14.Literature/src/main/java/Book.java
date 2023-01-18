/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author -G
 */
public class Book implements Comparable <Book>{
    String name;
    String age;

    public Book() {
    }

    public Book(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public int compareTo(Book o) {
        if (Integer.valueOf(this.age)>Integer.valueOf(o.getAge())){
            return 1;
        } else if (Integer.valueOf(this.age)<Integer.valueOf(o.getAge())){
            return -1;
        } else{
            return this.name.compareToIgnoreCase(o.getName());
        }
    }
    
    @Override
    public String toString(){
        return this.name + " (recommended for " + this.age + " years-old or older)";
    }
    
    
}
