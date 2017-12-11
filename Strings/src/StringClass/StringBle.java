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
    String val;
    
    public StringBle(String s){
        val = s;
    }
    
    public int getLength() {
        return val.length();
    }
    
    String toUpper(){
        return val.toUpperCase();
    }
    
    String toLower(){
        return val.toLowerCase();
    }
    
}
