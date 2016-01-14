/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skoluppgifter;

import java.util.Scanner;

/**
 *
 * @author Johan Wendt, wenjoh-5.
 */
public class Uppgift3_Triangel {
    public static void main(String[] args) {
        boolean run = true;
        Scanner scan = new Scanner(System.in);

        //Kör tills användaren avslutar
        while(run) {
            //Be användaren om längden
            System.out.print("Ange längden på de två lika långa sidorna "
                    + "(avsluta med -1)");
            int length = scan.nextInt();

            //Avsluta om längden är -1
            if(length == -1) {
                run = false;
            }
            
            //Utför endast beräkningar ifall användaren anger ett tillåtet värde.
            //I annat fall börjar bara loopen om.
            else if (length > 0 && length < 10) {

                //Be användaren att välja riktning för den räta vinkeln
                System.out.print("Ska den räta vinkeln vara nedåt (0) eller uppåt(1)");
                int downOrUp = scan.nextInt();

                //Ifall användaren väljer ner
                if(downOrUp == 0) {
                    //Yttre loopen går från första siffran och uppåt. 
                    //Dess funktion är att byta utskriftsrad och hålla
                    //räkning på nuvarande rad.
                    for(int n = 1; n <= length; n++) {
                        System.out.println("");
                        //Den inre loopen skriver ut siffran n, n gånger
                        for(int m = n; m > 0; m--) {
                            System.out.print("" + n);
                        }
                    }
                }
                //Ifall användaren väljer ner. Ifall inget av dessa valts
                //börjar loopen om från början. Denna loop är samma som ovan men
                //låter n börja på högsta värdet.
                else if(downOrUp == 1) {
                    for(int n = length; n >= 1; n--) {
                        System.out.println("");
                        for(int m = n; m > 0; m--) {
                            System.out.print("" + n);
                        }
                    }
                }
            }
             //Se till så att det blir lite luft till när nästa inmatning
            //efterfrågas av användaren.
            System.out.println("\n");
        }
    }
}
