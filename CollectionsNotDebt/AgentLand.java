/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollectionsNotDebt;

import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

/**
 *
 * @author douglas.whalen554
 */
public class AgentLand {
    /*
    if you never make a class AgentLand, you can only access a static (not in-
    stantiated) member variable and/ or method
    */
    

    /*
    allowed to instantiate object in class-space, but das ist sehr verboten(!!!)
    to manipulate it outside of a method (meaning class-space)
    */
    static Map<String, Double> CountryMap = new HashMap<>();
        
    
    Map<String, Agent> agentMap;
    
    
        
        AgentLand() {
        // list = new List<>();
        
        agentMap = new HashMap<>();
    } // close AgentLand
    
    public Agent getAgentByID (String id) {
        Agent a = agentMap.get(id);
        return a;
    } // close getAgentByID
    
    /*
    1. Int randIndex = random.nextInt(list.size());
    2. Country chosenC = list.get(randIndex);
    3. return ChosenCountry.risk;
    4. liste.get()

    */
    
    public static void generateCountryMap() {
        // CountryMap object instantiated in class-space, but manipulated here
        CountryMap.put("Northeast USA", 0.75);
        CountryMap.put("CONUS", 0.65);
        CountryMap.put("Any 'Hood USA", 0.85);
        CountryMap.put("Baltimore WestSide", 0.99);
        CountryMap.put("Africa", 0.79);
        CountryMap.put("Eurasia", 0.49);
        
    }
    public static void main(String[] args) {
        // populate agent data using a List
        /*public interface MyList<E> extends java.lang.Iterable<E> {
            // add a new element at the end of this list
            public void add <Agent, idNumber)>();
            < */
        List<Agent> listNOCDelta = new ArrayList<Agent>();
        Agent RZA = new Agent();
        listNOCDelta.add(RZA);
        Agent GZA = new Agent();
        listNOCDelta.add(GZA);
        Agent ODB = new Agent();
        listNOCDelta.add(ODB);
        Agent MM = new Agent();
        listNOCDelta.add(MM);
        Agent GK = new Agent();
        listNOCDelta.add(GK);
        Agent ID = new Agent();
        listNOCDelta.add(ID);
        
        RZA.setIDNumber(0);
        RZA.setCodeName("Prince Rakeem");
        RZA.setAreaOfFocus("Northeast USA");
        RZA.setRealName("Robert Fitzgerald Diggs");
        RZA.setAssStatus(true);
        RZA.setContactInfo(1234567890l);
        GZA.setIDNumber(1);
        GZA.setCodeName("The Genius");
        GZA.setAreaOfFocus("CONUS");
        GZA.setRealName("Gary Grice");
        GZA.setAssStatus(true);
        GZA.setContactInfo(2345678901l);
        ODB.setIDNumber(2);
        ODB.setCodeName("Ol' Dirty Bastard");
        ODB.setAreaOfFocus("Any 'Hood USA");
        ODB.setRealName("Russell Tyrone Jones");
        ODB.setAssStatus(false);
        ODB.setContactInfo(3456789012l);
        MM.setIDNumber(3);
        MM.setCodeName("Method Man");
        MM.setAreaOfFocus("Baltimore WestSide");
        MM.setRealName("Clifford Smith");
        MM.setAssStatus(false);
        MM.setContactInfo(3456789012l);
        GK.setIDNumber(4);
        GK.setCodeName("Ghostface Killah");
        GK.setAreaOfFocus("Africa");
        GK.setRealName("Dennis Coles");
        GK.setAssStatus(true);
        GK.setContactInfo(4567890123l);
        ID.setIDNumber(5);
        ID.setCodeName("Inspectah Deck");
        ID.setAreaOfFocus("Eurasia");
        ID.setRealName("Jason Hunter");
        ID.setAssStatus(true);
        ID.setContactInfo(567890123l);
        
        /* ONLY WANT TO PUT AGENT COUNTRY DATA IN THE MAP-
        create a NOC List HashMap with actual agents
        */ 
        Map<String, Agent> NOCListDelta = new HashMap<String, Agent>();
        NOCListDelta.put("Northeast USA", RZA);
        NOCListDelta.put("CONUS", GZA);
        NOCListDelta.put("Any 'Hood USA", ODB);
        NOCListDelta.put("Baltimore WestSide", MM);
        NOCListDelta.put("Africa", GK);
        NOCListDelta.put("Eurasia", ID);
        
        // System.out.println(NOCListDelta + "\n");
        
        Iterator <String> agentInfo = NOCListDelta.keySet().iterator();
            while (agentInfo.hasNext()) {
                String a = (String)agentInfo.next();
            //  for (String a: NOCListDelta) {
                System.out.println(NOCListDelta.get(a).getIDNumber());
                System.out.println(NOCListDelta.get(a).getCodeName());
                System.out.println(NOCListDelta.get(a).getAreaOfFocus());
                System.out.println(NOCListDelta.get(a).getRealName());
                System.out.println(NOCListDelta.get(a).isAssStatus());
                System.out.println(NOCListDelta.get(a).getContactInfo());
            }
        
            
            
        
        } // close main method
        
    }
    

