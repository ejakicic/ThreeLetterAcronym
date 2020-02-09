/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threeletteracronym;

import java.util.Scanner;

/**
 *
 * @author ejaki
 */
public class ThreeLetterAcronym {
    
    static String word1, word2, word3, acronym;
    
    static void getWords(){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter three words, one at a time.");
        
        word1 = userInput.nextLine();
        word2 = userInput.nextLine();
        word3 = userInput.nextLine();
    }
    
    static void checkLetters(){
        if(Character.isAlphabetic(word1.charAt(0)) && Character.isAlphabetic(word2.charAt(0)) && Character.isAlphabetic(word3.charAt(0))){
            acronym = word1.substring(0,1) + word2.substring(0,1) + word3.substring(0,1);
            System.out.println("Your acronym is " + acronym.toUpperCase());
        }
        else{
            System.out.println("Three valid words were not given.");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        getWords();
        
        checkLetters();
        
    }
    
}
