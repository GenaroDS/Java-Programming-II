
public class Checker {

    public boolean isDayOfWeek(String string)   {
        return string.matches("mon|tue|wed|thu|fri|sat|sun");
    }
    
    public boolean allVowels(String string){
        return string.toLowerCase().matches("^[aeiou]*");
    }
    
    public boolean timeOfDay(String string){
        return string.matches("(?:[01]\\d|2[0123]):(?:[012345]\\d):(?:[012345]\\d)");
    }
}
