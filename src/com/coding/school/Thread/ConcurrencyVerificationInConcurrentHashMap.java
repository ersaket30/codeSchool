package com.coding.school.Thread;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrencyVerificationInConcurrentHashMap {
    public static Map<String,String> map = new ConcurrentHashMap<>();

    public static void iteratingMap() {
        map.put("Hello1","ConcurrentWorld");
        map.put("Hello2","ConcurrentWorld");
        map.put("Hello3","ConcurrentWorld");
        map.put("Hello4","ConcurrentWorld");
        map.put("Hello5","ConcurrentWorld");
        Iterator<String> iterate = map.keySet().iterator();
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        while(iterate.hasNext()) {
            String key = iterate.next();
            System.out.println(map.get(key));
        }
    }
    public static void putMap() {
        map.put("Hello9","ConcurrentWorld132");
    }

    public static void main(String[] args) {
        int i=6 ;
        while(i<=10) {
            Thread thread1 = new Thread(ConcurrencyVerificationInConcurrentHashMap::iteratingMap);
            thread1.start();
            Thread thread2 = new Thread(ConcurrencyVerificationInConcurrentHashMap::putMap);
            thread2.start();
            i++;
        }
    }
}
