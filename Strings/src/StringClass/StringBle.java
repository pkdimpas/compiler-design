/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringClass;

/**
 *
 * @author Christian
 */
public class StringBle {
    private int length;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
    
    public StringBle(String s){
        length = s.length();
    }
    
    String toUpper(String s){
        return s.toUpperCase();
    }
    
    String toLower(String s){
        return s.toLowerCase();
    }
    
}
