/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringofwords;

import java.util.*;

/**
 *Prints a string of three letter words
 * @author Meeth
 * @version 1
 */
public class StringOfWords {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String word="";// intialise a string word to accept a five letter string
        while(word.length()!=5)
        {System.out.println("Please enter a five letter word");
        word = sc.nextLine();
        }
        

        for (int i = 0; i < word.length(); i++) {             // position of 1st letter in the string
            for (int j = 0; j < word.length(); j++) {         // position of 2nd letter in the string
                for (int k = 0; k < word.length(); k++) {     // position of 3rd letter in the string
                    if (i == j || i == k || j == k) {
                        continue;  
                    }
                    System.out.printf("%c%c%c\n", word.charAt(i), word.charAt(j), word.charAt(k));
                    

                }
            }
        }
     
    }

}
