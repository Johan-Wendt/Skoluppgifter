/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skoluppgifter;

import java.util.Scanner;

/**
 *
 * @author johanwendt
 */
public class Uppgift5_Matematikmetoder {
    public static double PI = 3.1415;
    public static void main(String[] args) {
        boolean run = true;
        Scanner scan = new Scanner(System.in);
        
        while(run) {
            System.out.println("MENY");
            System.out.println("____________________________________");
            System.out.println("1: beräkna volymen för ett klot");
            System.out.println("2: beräkna volymen för en cylinder");
            System.out.println("3: Omvandla ett bråk till blandad form");
            System.out.println("4: beräkna summan av 1 + 2 +...+ n");
            System.out.println("5: beräkna en punkt på en linje");
            System.out.println("6: lista  punkter på en linje\n");
            System.out.print("Välj ett alternativ: ");
            int choice = scan.nextInt();
            
            if(choice == 1) {
                
            }
            
            if(choice == 2) {
                
            }
            
            if(choice == 3) {
                
            }
            
            if(choice == 4) {
                
            }
            
            if(choice == 5) {
                
            }
            
            if(choice == 6) {
                
            }

        }
        
        
        
        
    }
    public static double volume(int r) {
        return (4 * PI * r * 3) / 3;
    }
    public static double volume(int r, int h) {
        return PI * r * 2 * h;
    }
    public static String fraction(int numerator, int denominator) {
        int whole = numerator / denominator;
        int frac = numerator % denominator;
        String result = "";
        if(whole != 0) {
            result += whole + " ";
        }
        if(frac != 0) {
            result += frac + "/" + denominator;
        }
        return result;
    }
    public static double sum(int n) {
        if(n == 1) {
            return 1;
        }
        return n + sum(n - 1);
    }
    
    public static int calcPoint(int x, int k, int m) {
        return k * x + m;
    }
    public static int[] calcLine(int n, int k, int m) {
        int[] result = new int[n];
        for(int a = 1; a <= n; a++) {
            result[a] = calcPoint(a, k, m);
        }
        return result;
    }
    public static void printLine(int[] print) {
        for(int n = 1; n < print.length; n++) {
            System.out.println("y(" + n + ")=" + print[n]);
        }
    }
}
