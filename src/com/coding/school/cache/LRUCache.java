package com.coding.school.cache;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class LRUCache {
    public static void main(String[] args) {
        Set<String> myCache = new HashSet<>();
        int cacheSize= 3;

        Queue<String> myQueue = new LinkedList<>();
        LRUCache cache = new LRUCache();
        cache.add(myCache,myQueue,"Saket",cacheSize);
        cache.add(myCache,myQueue,"John",cacheSize);
        cache.add(myCache,myQueue,"Gowtham",cacheSize);
        cache.add(myCache,myQueue,"Saket",cacheSize);

        myQueue.forEach(e->System.out.println("Saket queue.."+e));
        cache.add(myCache,myQueue,"BatMan",cacheSize);
        myQueue.forEach(e->System.out.println("BatMan queue.."+e));
        myCache.forEach(e->System.out.println("value in map .."+e));
    }

    public void add(Set<String> myCache,Queue<String> myQueue, String value,int size){
        if(myCache.contains(value)){
            myQueue.remove(value);
            myQueue.add(value);
        }else {
            if (myCache.size() == size) {
                String valueNeedsToBeRemoved = myQueue.remove();
                myCache.remove(valueNeedsToBeRemoved);
            }
            myQueue.add(value);
            myCache.add(value);
        }
    }
}
