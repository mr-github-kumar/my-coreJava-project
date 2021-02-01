package com.learning.practice.collection;

 import java.util.HashSet;
 import java.util.Iterator;
 import java.util.Set;

public class DemoHashSet {
    public static void main(String[] args){

        Set<Integer> hashSet = new HashSet<Integer>();

        hashSet.add(34);
        hashSet.add(4);
        hashSet.add(3);
        hashSet.add(34);
        hashSet.add(null);

        Iterator it = hashSet.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }




    }

}
