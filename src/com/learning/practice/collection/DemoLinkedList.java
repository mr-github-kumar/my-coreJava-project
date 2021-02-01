package com.learning.practice.collection;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class DemoLinkedList {

    public static void main(String args[]) {

        List<Integer> linkedList = new LinkedList<Integer>();

        linkedList.add(34);
        linkedList.add(4);
        linkedList.add(3);
        linkedList.add(134);
        linkedList.add(null);
        linkedList.add(344);
        linkedList.add(304);
        linkedList.add(234);
        linkedList.add(734);
        linkedList.add(349);
        linkedList.add(314);
        linkedList.add(340);

        Collections.synchronizedList(linkedList);

        for(int i = 0; i < linkedList.size(); i++ ) {
            System.out.println(linkedList.get(i));
        }
    }
}
