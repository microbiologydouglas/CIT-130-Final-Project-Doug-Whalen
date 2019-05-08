/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollectionsNotDebt;

import java.util.*;

/**
 *
 * @author douglas.whalen554
 */
public class ObRefPrac1 {
    public static void main(String[] args) {
        String hunt = "Hunt";
        String phelps = "Phelps";
        String claire = "Claire";
        List<String> list = new LinkedList<>();
        list.add(hunt);
        list.add(phelps);
        list.add(claire);
        Iterator<String> iter = list.iterator();
        int c = 0;
        String storage = null;
        while (iter.hasNext()) {
            storage = iter.next();
            System.out.println(storage);
            if(storage.length()<5) {
                storage = storage.toUpperCase();
            }
            list.set(c, storage);
            c++;
        } // end while loop
        
        System.out.println("****");
        for(String item: list) {
            System.out.println(item);
        } // end for loop
        
        System.out.println("****");
        Map<Integer, String> m = new HashMap<>();
        m.put(4, hunt);
        m.put(5, phelps);
        m.put(6, claire);
        Set<Integer> s = m.keySet();
        System.out.println(m.get(4));
        System.out.println(s.contains(5));
        System.out.println(m.put(6, "NOT CLAIRE"));
        System.out.println(m.get(6));
        
    } // end main
    
}
