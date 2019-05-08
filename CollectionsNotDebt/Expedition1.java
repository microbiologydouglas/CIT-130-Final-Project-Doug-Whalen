/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollectionsNotDebt;

import java.util.Map;

/**
 *
 * @author douglas.whalen554
 */
public class Expedition1 {
    // static members can be accessed without 
    static Map<String, String> expeditionMap = new HashMap<>();
    
    public static void main(String[] args) {
        generateExpedMapData(); 
        
        // allow for user edits of individual values in the map
        // complete displays of all key:value pairs
        
    }
    
    /* creates our map object and puts key/ value pairs
    
    */
    public static void generateExpedMapData() {
        expeditionMap = new HashMap<>();
        expeditionMap.put("location", "Mozambique");
        expeditionMap.put("length", "1 year");
        expeditionMap.put("company", "Medecin Sans Frontieres");
        expeditionMap.put("airline", "JAL");
        expeditionMap.put("price", "46789 yen");
        
    }
    
    public static void viewContentsOfExpedMap() {
        
    }
    
    
}
