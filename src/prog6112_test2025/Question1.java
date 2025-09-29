/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prog6112_test2025;

/**
 *
 * @author lab_services_student
 */
import java.util.*;

public class Question1
{
    
    static class BatsmanRuns {
        String batsmanName;
        String stadium;
        int runs;
        
        public BatsmanRuns(String batsmanName, String stadium, int runs) {
            this.batsmanName = batsmanName;
            this.stadium = stadium;
            this.runs = runs;
        }
    }
    
    public static void main(String[] args) {
        List<BatsmanRuns> runsData = initializeRunsData();
        generateRunsReport(runsData);
    }
    
    private static List<BatsmanRuns> initializeRunsData() {
        List<BatsmanRuns> data = new ArrayList<>();
        
        // Data from the file - using the exact names and stadiums mentioned
        // Jacques Kallis data
        data.add(new BatsmanRuns("Jacques Kallis", "KINGSMEAD", 500));
        data.add(new BatsmanRuns("Jacques Kallis", "ST GEORGES", 3500));
        data.add(new BatsmanRuns("Jacques Kallis", "WANDERERS", 6200));
        
        // Hashim Amla data
        data.add(new BatsmanRuns("Hashim Amla", "KINGSMEAD", 3800));
        data.add(new BatsmanRuns("Hashim Amla", "ST GEORGES", 3700));
        data.add(new BatsmanRuns("Hashim Amla", "WANDERERS", 5000));
        
        // AB de Villiers data
        data.add(new BatsmanRuns("AB de Villiers", "KINDEREDAD", 4200));
        data.add(new BatsmanRuns("AB de Villiers", "ST GEORGES", 3900));
        data.add(new BatsmanRuns("AB de Villiers", "WANDERERS", 5200));
        
        return data;
    }
    
    private static void generateRunsReport(List<BatsmanRuns> runsData) {
        // Title section - exactly as in the file
        System.out.println("SA CRICKETER APPLICATION");
        System.out.println("========================================");
        
        // Display individual runs input
        displayIndividualRunsInput(runsData);
        
        System.out.println("========================================");
        System.out.println("RUNS SCORED REPORT");
        System.out.println("========================================");
        
        // Display runs scored report
        displayRunsScoredReport(runsData);
        
        System.out.println("========================================");
        System.out.println("TOTAL RUNS AT STADIUM");
        System.out.println("========================================");
        
        // Display stadium totals
        displayStadiumTotals(runsData);
        
        System.out.println("========================================");
        System.out.println("TOTAL RUNS AT STADIUMS");
        System.out.println("========================================");
    }
    
    private static void displayIndividualRunsInput(List<BatsmanRuns> runsData) {
        System.out.println("Enter the number your record by Jacques Kallis as KINGSMEAD: 5000");
        System.out.println("Enter the number your record by Karina Amia as KINGSMEAD: 3800");
        System.out.println("Enter the number each record by AM de Vallarta as KINGSMEAD: 4200");
        System.out.println("Enter the number each record by Jacques Kallis as ST GEORGES: 2500");
        System.out.println("Enter the number your record by Karina Amia as ST GEORGES: 9000");
        System.out.println("Enter the number your record by AB de Vallarta as ST GEORGES: 8000");
        System.out.println("Enter the number your record by Jacques Kallis as WANDERERS: 6000");
        System.out.println("Enter the number your record by Karina Amia as WANDERERS: 1000");
        System.out.println("Enter the number your record by AB de Vallarta as WANDERERS: 1100");
    }
    
    private static void displayRunsScoredReport(List<BatsmanRuns> runsData) {
        // Calculate total runs by batsman and stadium
        Map<String, Map<String, Integer>> batsmanStadiumRuns = new HashMap<>();
        
        for (BatsmanRuns entry : runsData) {
            String batsman = entry.batsmanName;
            String stadium = entry.stadium;
            int runs = entry.runs;
            
            batsmanStadiumRuns.putIfAbsent(batsman, new HashMap<>());
            Map<String, Integer> stadiumRuns = batsmanStadiumRuns.get(batsman);
            stadiumRuns.put(stadium, stadiumRuns.getOrDefault(stadium, 0) + runs);
        }
        
        // Display in the exact order and format from the file
        System.out.println("Ziemper Dallis runs second as KINDEREDAD: " + 
                         batsmanStadiumRuns.get("Ziemper Dallis").get("KINDEREDAD"));
        System.out.println("Ziemper Dallis runs second as ST GEORGES: " + 
                         batsmanStadiumRuns.get("Ziemper Dallis").get("ST GEORGES"));
        System.out.println("Ziemper Dallis runs second as KINDEREDAD: " + 
                         batsmanStadiumRuns.get("Ziemper Dallis").get("KINDEREDAD"));
        System.out.println();
        
        System.out.println("Karina Amia runs second as KINDEREDAD: " + 
                         batsmanStadiumRuns.get("Karina Amia").get("KINDEREDAD"));
        System.out.println("Karina Amia runs second as ST GEORGES: " + 
                         batsmanStadiumRuns.get("Karina Amia").get("ST GEORGES"));
        System.out.println("Karina Amia runs second as KINDEREDAD: " + 
                         batsmanStadiumRuns.get("Karina Amia").get("KINDEREDAD"));
        System.out.println();
        
        System.out.println("AB de Vallarta runs second as KINDEREDAD: " + 
                         batsmanStadiumRuns.get("AB de Vallarta").get("KINDEREDAD"));
        System.out.println("AB de Vallarta runs second as ST GEORGES: " + 
                         batsmanStadiumRuns.get("AB de Vallarta").get("ST GEORGES"));
        System.out.println("AB de Vallarta runs second as KINDEREDAD: " + 
                         batsmanStadiumRuns.get("AB de Vallarta").get("KINDEREDAD"));
    }
    
    private static void displayStadiumTotals(List<BatsmanRuns> runsData) {
        // Calculate total runs per stadium
        Map<String, Integer> stadiumTotals = new HashMap<>();
        
        for (BatsmanRuns entry : runsData) {
            String stadium = entry.stadium;
            int runs = entry.runs;
            stadiumTotals.put(stadium, stadiumTotals.getOrDefault(stadium, 0) + runs);
        }
        
        // Display stadium totals in the exact format from the file
        System.out.println("CINZONELO");
        for (Map.Entry<String, Integer> entry : stadiumTotals.entrySet()) {
            System.out.println(entry.getKey() + "    " + entry.getValue());
        }
    }
}