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
            System.out.println("5: lista  punkter på en linje");
            System.out.println("9: Avlsuta\n");
            System.out.print("Välj ett alternativ: ");
            int choice = scan.nextInt();
            
            if(choice == 1) {
                System.out.print("Ange klotets radie: ");
                int r = scan.nextInt();
                double volume = Math.round(volume(r));
                System.out.println("Klotets volym är " + volume + " volymenheter.");
            }
            
            else if(choice == 2) {
                System.out.print("Ange cylinderns radie: ");
                int r = scan.nextInt();
                System.out.print("Ange cylinderns höjd: ");
                int h = scan.nextInt();
                double volume = Math.round(volume(r, h));
                System.out.println("Cylinderns volym är " + volume + " volymenheter.");
            }
            
            else if(choice == 3) {
                
            }
            
            else if(choice == 4) {
                
            }
            
            else if(choice == 5) {
                System.out.print("Ange högsta x-värde: ");
                int n = scan.nextInt();
                System.out.print("Ange k-värde: ");
                int k = scan.nextInt();
                System.out.print("Ange m-värde: ");
                int m = scan.nextInt();
                printLine(calcLine(n, k, m));
            }

            else if(choice == 9) {
                run = false;
            }

            System.out.println("");
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
        int[] result = new int[n + 1];
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
