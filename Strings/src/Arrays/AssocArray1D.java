/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author christian
 */
public class AssocArray1D {
    private Map<Object, Object> vars;
    private Object basis;
    public AssocArray1D(){
        vars = new HashMap<>();
        basis = null;
    }
    public void insert(Object Key, Object val){
        if(vars.isEmpty()){
            vars.put(Key, val);
            basis = Key;
        }else{
            if(Key.getClass().equals(basis.getClass())){
                vars.put(Key, val);
            }else{
                System.out.println("Type mismatch. Array indices must be of same type");            
            }
        }
        
    }
    
    public Object retrieve(Object Key){
        return vars.get(Key);   
    }
    
    public void displayValues(){
        vars.forEach((k,v)->System.out.println("Key : " + k + " Value : " + v));
    }
}
