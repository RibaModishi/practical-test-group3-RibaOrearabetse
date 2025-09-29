/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prog6112_test2025;

/**
 *
 * @author lab_services_student
 */
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("SA CRICKETER APPLICATION");
        System.out.println("----------------------------------------");
        System.out.println();
        
        // Input data for Jacques Kallis
        System.out.print("Enter the number your record by Jacques Kallis as KINGSMEAD: ");
        int kallisKingsmead = scanner.nextInt();
        
        System.out.print("Enter the number your record by Hashim Amla as KINGSMEAD: ");
        int amlaKingsmead = scanner.nextInt();
        
        System.out.print("Enter the number each record by AB de Villiers as KINGSMEAD: ");
        int devilliersKingsmead = scanner.nextInt();
        
        System.out.print("Enter the number each record by Jacques Kallis as ST GEORGES: ");
        int kallisStGeorges = scanner.nextInt();
        
        System.out.print("Enter the number your record by Hashim Amla as ST GEORGES: ");
        int amlaStGeorges = scanner.nextInt();
        
        System.out.print("Enter the number your record by AB de Villiers as ST GEORGES: ");
        int devilliersStGeorges = scanner.nextInt();
        
        System.out.print("Enter the number your record by Jacques Kallis as WANDERERS: ");
        int kallisWanderers = scanner.nextInt();
        
        System.out.print("Enter the number your record by Hashim Amla as WANDERERS: ");
        int amlaWanderers = scanner.nextInt();
        
        System.out.print("Enter the number your record by AB de Villiers as WANDERERS: ");
        int devilliersWanderers = scanner.nextInt();
        
        System.out.println("--------------------------------------------");
        System.out.println("RUNS SCORED REPORT");
        System.out.println("--------------------------------------------");
        System.out.println();
        
        // Display Jacques Kallis records
        System.out.println("Jacques Kallis Runs scored at KINGSMEAD : " + kallisKingsmead);
        System.out.println("Jacques Kallis Runs scored at ST GEORGES: " + kallisStGeorges);
        System.out.println("Jacques Kallis Runs scored at WANDERERS: " + kallisWanderers);
        System.out.println();
        
        // Display Hashim Amla records
        System.out.println("Hashim Amla Runs scored at KINGSMEAD : " + amlaKingsmead);
        System.out.println("Hashim Amla Runs scored at ST GEORGES: " + amlaStGeorges);
        System.out.println("Hashim Amla Runs scored at WANDERERS: " + amlaWanderers);
        System.out.println();
        
        // Display AB de Villiers records
        System.out.println("AB de Villiers Runs scored at KINGSMEAD : " + devilliersKingsmead);
        System.out.println("AB de Villiers Runs scored at ST GEORGES: " + devilliersStGeorges);
        System.out.println("AB de Villiers Runs scored at WANDERERS: " + devilliersWanderers);
        System.out.println();
        
        // Calculate totals for each stadium
        int totalKingsmead = kallisKingsmead + amlaKingsmead + devilliersKingsmead;
        int totalStGeorges = kallisStGeorges + amlaStGeorges + devilliersStGeorges;
        int totalWanderers = kallisWanderers + amlaWanderers + devilliersWanderers;
        
        System.out.println("--------------------------------");
        System.out.println("TOTAL RUNS AT STADIUMS");
        System.out.println("--------------------------------");
        
        System.out.println("KINGSMEAD " + totalKingsmead);
        System.out.println("ST GEORGES " + totalStGeorges);
        System.out.println("WANDERERS " + totalWanderers);
        System.out.println();
        
        // Find stadium with most runs
        String stadiumWithMostRuns;
        if (totalKingsmead >= totalStGeorges && totalKingsmead >= totalWanderers) {
            stadiumWithMostRuns = "KINGSMEAD";
        } else if (totalStGeorges >= totalKingsmead && totalStGeorges >= totalWanderers) {
            stadiumWithMostRuns = "ST GEORGES";
        } else {
            stadiumWithMostRuns = "WANDERERS";
        }
        
        System.out.println("STADIUM WITH THE MOST RUNS: " + stadiumWithMostRuns);
         System.out.println("---------------------------------------");
        
        scanner.close();
    }
}