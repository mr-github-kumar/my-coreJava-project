package com.learning.practice.collection;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class DemoTreeMap {

    public static void main(String[] args){

        Map<Integer, Integer> myData = new TreeMap<Integer, Integer>();

        myData.put(2,3);
        myData.put(3,2);
        myData.put(3,4);
        myData.put(4,null);

        Iterator it = myData.entrySet().iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
