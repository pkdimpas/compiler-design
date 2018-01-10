/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiler;

import Arrays.ArrayLexicon;
import Arrays.AssocArray1D;
/**
 *
 * @author Cadigal, Dimpas, Gelbolingo, Gimenez, Po
 */
public class compiler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayLexicon lx = new ArrayLexicon();
        AssocArray1D test = new AssocArray1D();
       
        lx.readSource("source.ble");
        
        test.insert(0, 10);
        test.insert(1, 11);
        /*
        test.insert("key", "123");
        test.insert("key2", "456");
        */
        test.displayValues();
        
    }
}
