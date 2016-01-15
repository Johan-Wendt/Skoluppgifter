/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skoluppgifter;

import java.util.Scanner;
import java.util.InputMismatchException;

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


        try {
            int choice = scan.nextInt();


            if(choice == 1) {
                System.out.print("Ange klotets radie: ");
                try {
                    int r = scan.nextInt();
                    double volume = Math.round(volume(r));
                    if(volume == -1) {
                        System.out.println("Radien måste vara positiv");
                    }
                    else {
                        System.out.println("Klotets volym är " + volume + " volymenheter.");
                    }
                }
                catch (InputMismatchException e) {

                    System.out.println("Endast positiva heltal är tillåtna");
                    scan.nextLine();
                }
            }

            else if(choice == 2) {
                System.out.print("Ange cylinderns radie: ");
                int r = scan.nextInt();
                System.out.print("Ange cylinderns höjd: ");
                int h = scan.nextInt();

                double volume = Math.round(volume(r, h));

                if(volume == -1) {
                    System.out.println("Radien och höjden måste vara positiva");
                }
                else {
                    System.out.println("Cylinderns volym är " + volume + " volymenheter.");
                }
            }

            else if(choice == 3) {
                System.out.print("Ange täljare: ");
                int t = scan.nextInt();
                System.out.print("Ange nämnare: ");
                int n = scan.nextInt();

                String fraction = fraction(t, n);
                if(fraction.equals("")) {
                    System.out.println("Nämnaren får ej vara noll");
                }
                else {
                    System.out.println(fraction);
                }
            }

            else if(choice == 4) {
                System.out.print("Ange n: ");
                int n = scan.nextInt();
                System.out.println("Summan av alla heltal upp till " + n + " blir " + sum(n));
            }

            else if(choice == 5) {
                System.out.print("Ange högsta x-värde: ");
                int n = scan.nextInt();
                System.out.print("Ange k-värde: ");
                int k = scan.nextInt();
                System.out.print("Ange m-värde: ");
                int m = scan.nextInt();

                int[] result = calcLine(n, k, m);
                if(result.length == 0) {
                    System.out.print("Värdet på n måste vara positivt");
                }
                else {
                    printLine(calcLine(n, k, m));
                }
            }

            else if(choice == 9) {
                run = false;
            }

            System.out.println("");
            }
            catch (InputMismatchException e) {
                scan.nextLine();
            }
        }
    }
    public static double volume(int r) {
        if(r < 0) {
            return -1;
        }
        return (4 * PI * r * 3) / 3;
    }
    public static double volume(int r, int h) {
        if(r < 0) {
            return -1;
        }
        return PI * r * 2 * h;
    }
    public static String fraction(int numerator, int denominator) {
        if(denominator == 0) {
            return "";
        }
        boolean negative = false;
        if((numerator < 0 && denominator > -1) || (numerator > 0 && denominator < 0)) {
            negative = true;
        }
        numerator = Math.abs(numerator);
        denominator = Math.abs(denominator);
        int whole = numerator / denominator;
        int frac = numerator % denominator;
        String result = "";
        if(negative) {
            result += "-(";
        }
        if(whole != 0) {
            result += whole + " ";
        }
        if(frac != 0) {
            result += frac + "/" + denominator;
        }
        if(negative) {
            result += ")";
        }
        return result;
    }
    public static int sum(int n) {
        if(n < 0) {
            return -1;
        }
        if(n == 1) {
            return 1;
        }
        return n + sum(n - 1);
    }
    
    public static int calcPoint(int x, int k, int m) {
        return k * x + m;
    }
    public static int[] calcLine(int n, int k, int m) {
        if(n < 1) {
            return new int[0];
        }
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
