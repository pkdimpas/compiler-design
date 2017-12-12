/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import StringClass.StringBle;
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
            StringBle sb;
            Pattern p;
            Matcher m;
            
            
            input = new File("source.ble");
            sc = new Scanner(input);
            
            while(sc.hasNextLine()){
                s = sc.nextLine();   
                //Getting the string
                String regex = "Let(?:\\s+)[a-zA-Z]*(?:\\s*)=(?:\\s*)(\"|\')([\\w.,\\/#!$%\\^&\\*;:{}=\\-_`~()\\[\\]]+(?:\\s*))+\\1";
                String str = searchRegex(s, regex);
                if(str != null){
                    System.out.println(str);
                    regex = "(\\\"|\\')([\\w.,\\/#!$%\\^&\\*;:{}=\\-_`~()\\[\\]]+(?:\\s*))+\\1";
                    str = searchRegex(s, regex);
                    System.out.println(str);
                    if(str != null){
                        regex = "([\\w.,\\/#!$%\\^&\\*;:{}=\\-_`~()\\[\\]]+(?:\\s*))+";
                        //System.out.println(str);
                        str = searchRegex(str, regex);
                        //System.out.println(str);
                        if(str != null){
                            System.out.println(str);
                        }
                    }
                }
            }
        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        
    }
    
    public static String searchRegex(String str, String regex){
        Pattern p;
        Matcher m;
        String ret = null;
        p = Pattern.compile(regex);
        m = p.matcher(str);
        if(m.find()){
            ret = m.group();
        }
        return ret;
    }
    
}
