package com.learning.practice.collection;

import java.util.ArrayList;
import java.util.List;

public class DemoArrayList {
    public static void main(String args[]) {

        List<Integer> arrayList = new ArrayList<Integer>();

        arrayList.add(34);
        arrayList.add(4);
        arrayList.add(3);
        arrayList.add(134);
        arrayList.add(null);
        arrayList.add(344);
        arrayList.add(304);
        arrayList.add(234);
        arrayList.add(734);
        arrayList.add(349);
        arrayList.add(314);
        arrayList.add(340);

        for(int i = 0; i < arrayList.size(); i++ ) {
            System.out.println(arrayList.get(i));
        }
    }
}
