/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CollectionsNotDebt;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Iterator;

/**
 *
 * @author douglas.whalen554
 */
public class LinkedListPLs {
    
    public static void main(String [] args) {
        LinkedList<String> pl = new LinkedList<>();
        pl.add("Ruby");
        pl.add("JavaScript");
        pl.add("Visual Basic");
        pl.add("Kotlin");
        pl.add("Basic");
        pl.add("C++");
        pl.add("Swift");
        pl.add("C#");
        pl.add("Objective-C");
        pl.add("Java");
        pl.add("C");
        pl.add("Python");
        System.out.println(pl);
        
        //swap basic and java
        //swap Obj C ad Java
        String lang1 = pl.get(4);
        pl.add(8,pl.remove(4));
        pl.add(4,pl.remove(9));
        
        System.out.println(pl);
    

        
        
        
        
        ListIterator li = pl.listIterator(5);
        while(li.hasNext()) {
            System.out.println(li.next());
        }
        System.out.println(li);
        
        
        
        
    }
    
}
