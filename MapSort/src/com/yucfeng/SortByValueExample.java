package com.yucfeng;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class SortByValueExample {

    public static void main(String[] argv) {

        Map<String, Integer> unsortMap = new HashMap<>();
        unsortMap.put("z", 10);
        unsortMap.put("b", 5);
        unsortMap.put("a", 6);
        unsortMap.put("c", 20);
        unsortMap.put("0", 1);
        unsortMap.put("e", 7);
        unsortMap.put("y", 8);
        unsortMap.put("1", 99);
        unsortMap.put("j", 50);
        unsortMap.put("m", 2);
        unsortMap.put("f", 9);

        System.out.println("Original...");
        System.out.println(unsortMap);

        Map<String, Integer> result = new LinkedHashMap<>();

        //sort by value, and reserve, 10,9,8,7,6...
        unsortMap.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())  // reversed倒序，不指定类型，会默认为<java.util.Map.Entry<java.lang.Object,V>>
                .forEachOrdered(x -> result.put(x.getKey(), x.getValue()));

        System.out.println("Sorted...");
        System.out.println(result);

    }

}
