/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skoluppgifter;

/**
 *
 * @author johanwendt
 */
public class Uppgift1_tabellutskrift {
    
    public static void main(String[] args) {
        int agMass = (int) Math.round(107.8682 - 47);
        int auMass = (int) Math.round(196.96654 - 79);
        int cMass = (int) Math.round(12.01 - 6);
        
        
        System.out.println("Tecken\tGrundämne\tAtomnummer\tAtommassa\tMasstal");
        System.out.println("================================================================");
        System.out.println("Ag\tSilver\t\t47\t\t107.8682\t" + agMass);
        System.out.println("Au\tGuld\t\t79\t\t196.96654\t" + auMass);
        System.out.println("C\tKol\t\t6\t\t12.01\t\t" + cMass);
    }
    
}
