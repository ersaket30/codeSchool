package com.coding.school.collection;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class CustomComparatorMap implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o1.length()==o2.length()?o1.compareTo(o2): o1.length()-o2.length();
    }

    public static void main(String[] args) {

        //Map<String, String> map = new TreeMap<>(Comparator.comparingInt(String::length).thenComparing(Comparator.naturalOrder()));
        Map<String, String> map = new TreeMap<>(new CustomComparatorMap());
        map.put("IBARAKI", "MitoCity");
        map.put("TOCHIGI", "UtunomiyaCity");
        map.put("GUNMA", "MaehashiCity");
        map.put("SAITAMA", "SaitamaCity");
        map.put("CHIBA", "ChibaCity");
        map.put("TOKYO", "Sinjyuku");
        map.put("KANAGAWA", "YokohamaCity");

        System.out.println(map);
    }
}
