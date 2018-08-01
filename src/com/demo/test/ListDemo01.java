package com.demo.test;

import java.util.*;

public class ListDemo01 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("key1","极客学院");
        map.put("key2","www");
        map.put("key3","com");
        map.put("key4","eoeand");
        map.put("key5","hello");
        Collection<String> collection = map.values();
        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
