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

public class Hideout<T> {

    private T object;

    public Hideout() {
        this.object = null;
    }

    public void putIntoHideout(T tohide) {
        this.object = tohide;
    }

    public T takeFromHideout() {
        T toReturn = this.object;
        this.object = null;
        return toReturn;

    }

    public boolean isInHideout() {
        return (!(this.object == null));
    }
}
