package com.itbulls.learnit.javacore.jcf.maps;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class LinkedHashMapDemo extends LinkedHashMap<Integer, String> {

    private final int capacity = 3;

    @Override
    public boolean removeEldestEntry(Entry<Integer, String> eldest) {
        return size() > this.capacity;
    }

    public static void main(String[] args) {
        LinkedHashMapDemo map = new LinkedHashMapDemo();

        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");

        System.out.println(map);
    }
}
