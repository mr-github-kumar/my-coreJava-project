package com.learning.practice.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DemoHashMap {

    public static void main(String[] args){

        Map<Integer, Integer> myData = new HashMap<Integer, Integer>();

        myData.put(2,3);
        myData.put(3,2);
        myData.put(null,3);
        myData.put(null,null);
        myData.put(4,null);

        Iterator it = myData.entrySet().iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }



    }
}
