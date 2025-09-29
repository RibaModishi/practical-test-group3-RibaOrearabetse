/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog6112_test2025;

/**
 *
 * @author lab_services_student
 */
import java.util.HashMap;
import java.util.Scanner;

public class Question2 {
    private static HashMap<String, HashMap<String, Integer>> playersData;
    
    static {
        // Initialize players data
        playersData = new HashMap<>();
        
        // Jacques Kallis data
        HashMap<String, Integer> kallisData = new HashMap<>();
        kallisData.put("Kingsmead", 5000);
        kallisData.put("St Georges", 3500);
        kallisData.put("Wanderers", 6200);
        playersData.put("Jacques Kallis", kallisData);
        
        // Hashim Amla data
        HashMap<String, Integer> amlaData = new HashMap<>();
        amlaData.put("Kingsmead", 3800);
        amlaData.put("St Georges", 3700);
        amlaData.put("Wanderers", 6200);
        playersData.put("Hashim Amla", amlaData);
        
        // AB De Villiers data
        HashMap<String, Integer> devilliersData = new HashMap<>();
        devilliersData.put("Kingsmead", 4200);
        devilliersData.put("St Georges", 3900);
        devilliersData.put("Wanderers", 5200);
        playersData.put("AB De Villiers", devilliersData);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get cricketer name input
        System.out.print("The Cricketer name: ");
        String cricketerName = scanner.nextLine();
        
        // Get stadium name input
        System.out.print("Enter the stadium: ");
        String stadiumName = scanner.nextLine();
        
        // Validate if player exists
        if (!playersData.containsKey(cricketerName)) {
            System.out.println("Error: Cricketer not found in records!");
            scanner.close();
            return;
        }
        
        // Validate if stadium exists for the player
        HashMap<String, Integer> playerData = playersData.get(cricketerName);
        if (!playerData.containsKey(stadiumName)) {
            System.out.println("Error: Stadium not found for this cricketer!");
            scanner.close();
            return;
        }
        
        // Get the runs scored
        int runsScored = playerData.get(stadiumName);
        
        // Display the report
        System.out.println("\nBATSMAN RUNS SCORED REPORT");
        System.out.println("************************");
        System.out.println("CRICKET PLAYER: " + cricketerName);
        System.out.println("STADIUM: " + stadiumName);
        System.out.println("TOTAL RUNS SCORED: " + runsScored);
        
        scanner.close();
    }
    
    // Method to get runs scored by a player at a specific stadium
    public static int getRunsScored(String cricketerName, String stadiumName) {
        if (playersData.containsKey(cricketerName)) {
            HashMap<String, Integer> playerData = playersData.get(cricketerName);
            if (playerData.containsKey(stadiumName)) {
                return playerData.get(stadiumName);
            }
        }
        return -1; // Return -1 if not found
    }
    
    // Method to display all players and their data
    public static void displayAllPlayersData() {
        System.out.println("ALL PLAYERS DATA:");
        System.out.println("=================");
        for (String player : playersData.keySet()) {
            System.out.println(player + ":");
            HashMap<String, Integer> stadiums = playersData.get(player);
            for (String stadium : stadiums.keySet()) {
                System.out.println("  " + stadium + ": " + stadiums.get(stadium) + " runs");
            }
            System.out.println();
        }
    }
}
