/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Cadigal, Dimpas, Gelbolingo, Gimenez, Po
 */
public class Strings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            File input;
            Scanner sc;
            String s;

            input = new File("source.ble");
            sc = new Scanner(input);
            
            while(sc.hasNextLine()){
                s = sc.nextLine();
                System.out.println(s);
            }
        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        
    }
    
}
