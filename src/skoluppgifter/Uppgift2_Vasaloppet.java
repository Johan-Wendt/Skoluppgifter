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
public class Uppgift2_Vasaloppet {
    
    public static void main(String[] args) {
        //rekordtiden i sekunder
        int recordSeconds = 3 * 60 * 60 + 38 * 60 + 41;
        
        //scanner för att låta användaren mata in värden
        Scanner input = new Scanner(System.in);
        input.useDelimiter("\\n");
        
        //skapa början på "gränssnittet"
        System.out.println("Vasaloppet - Mata in målgångstid");
        System.out.println("---------------------------------------------------");

        //Låt användaren mata in antal timmar
        System.out.print("Timme: ");
        int hour = input.nextInt();
        
        //Låt användaren mata in antal minuter
        System.out.print("Minut: ");
        int minute = input.nextInt();
        
        //Låt användaren mata in antal sekunder
        System.out.print("Sekund: ");
        int second = input.nextInt();
        
        //beräkna totaltiden i sekunder
        int totalSeconds = hour * 60 * 60 + minute * 60 + second;
        
        //Beräkna tidsskillnaden mellan rekordet och användaren och omvandla  
        //tillbaka till timmar, sekunder och minuter
        int diffTotal = totalSeconds - recordSeconds;
        int bareSeconds = diffTotal % 3600;
        int diffHour = (diffTotal - bareSeconds) / 3600;
        int diffMinute = (bareSeconds - bareSeconds % 60) / 60;
        int diffSecond = bareSeconds - diffMinute * 60;
        
        //Presentera resultatet
        System.out.println("Din tid var:\t\t" + hour + " timmar " + minute + " minuter och " + second + " sekunder");
        System.out.println("Rekordtiden 2012 var:\t3 timmar 38 minuter och 41 sekunder");
        System.out.println("Skillnad i tid är:\t" + diffHour + " timmar " + diffMinute + " minuter och " + diffSecond + " sekunder");
        
    }
}
