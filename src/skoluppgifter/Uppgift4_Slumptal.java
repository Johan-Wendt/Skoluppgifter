/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skoluppgifter;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author johanwendt
 */
public class Uppgift4_Slumptal {
    public static void main(String[] args) {
        boolean run = true;
        Scanner scan = new Scanner(System.in);


        //Be användaren om antal tal
        System.out.print("Hur många slumptal i intervallet 0 - 999 önskas? ");
        int amount = scan.nextInt();
        
        //Skapa en tom aray med samma storlek som antal tal. 
        int[] randomNumbers = new int[amount]; 
        int evenNumbers = 0;
        
        //Fylla arrayen med slumpade tal.
        //Passa även på att beräkna hur många av dessa som är jämna.
        for(int n = 0; n < amount; n++) {
            randomNumbers[n] = (int) (Math.random() * 1000);
            if(randomNumbers[n] % 2 == 0) {
                evenNumbers ++;
            }
        }
        
        //Skapa tomma arrayer för antal jämna och udda tal. Storleken beräknas
        //utifrån antal jämna tal.
        int[] even = new int[evenNumbers];
        int[] uneven = new int[amount - evenNumbers]; 
        
        //Vi behöver siffror som håller reda på vari arrayerna vi ska knuffa in 
        //våra tal
        int evenPointer = 0;
        int unevenPointer = 0;
        
        //Fyll de båda arrayerna med jämna respektive udda tal.
        for(int n = 0; n < amount; n++) {
            if(randomNumbers[n] % 2 == 0) {
                even[evenPointer] = randomNumbers[n];
                evenPointer++;
            }
            else {
                uneven[unevenPointer] = randomNumbers[n];
                unevenPointer++;
            }
        }
        
        //För att kunna presentera resultatet görs arrayerna om till strings
        //och [ respektive ] rensas bort.
        String randomResult = Arrays.toString(randomNumbers);
        randomResult = randomResult.replace("[", "");
        randomResult = randomResult.replace("]", "");
        
        String evenResult = Arrays.toString(even);
        evenResult = evenResult.replace("[", "");
        evenResult = evenResult.replace("]", "");
        
        String unevenResult = Arrays.toString(uneven);
        unevenResult = unevenResult.replace("[", "");
        unevenResult = unevenResult.replace("]", "");
        
        //Presentera resultaten
        System.out.println("Här är de slumpade talen:");
        System.out.println(randomResult);
        
        System.out.println("Dessa " + evenNumbers + " tal är jämna:");
        System.out.println(evenResult);
        
        System.out.println("Dessa " + (amount - evenNumbers) + " tal är udda:");
        System.out.println(unevenResult);
    }
}
