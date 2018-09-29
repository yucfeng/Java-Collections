package com.yucfeng;

import java.util.HashMap;

public class HashMapInfiniteLoop {

    private static HashMap<Integer,String> map = new HashMap<Integer,String>(2, 0.75f);
    public static void main(String[] args) {
        map.put(5, "C");

        new Thread("Thread1") {
            public void run() {
                map.put(7, "B");
                System.out.println(map);
            }
        }.start();
        new Thread("Thread2") {
            public void run() {
                map.put(3, "A");
                System.out.println(map);
            }
        }.start();

        new Thread("Thread3") {
            public void run() {
                System.out.println(map);
                System.out.println(map.get(11));
            }
        }.start();
    }
}
