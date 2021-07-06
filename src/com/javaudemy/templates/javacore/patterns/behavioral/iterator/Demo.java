package com.itbulls.learnit.javacore.patterns.behavioral.iterator;

import java.util.*;

public class Demo {

    public static void main(String[] args) {
        List<String> arrList = new ArrayList<>();
        List<String> linkList = new LinkedList<>();
        Set<String> hashSet = new HashSet<>();

        Iterator<String> iterator1 = arrList.iterator();
        Iterator<String> iterator2 = linkList.iterator();
        Iterator<String> iterator3 = hashSet.iterator();

        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }

    }

}
