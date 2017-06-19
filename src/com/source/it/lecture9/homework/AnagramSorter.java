package com.source.it.lecture9.homework;

import java.util.Arrays;
import java.util.List;

public class AnagramSorter {
    public static void main(String[] args) {
        List<String> strings =
                Arrays.asList("done", "none", "node", "neno", "onion", "deno", "gram", "ramg", "nioon");
        List<String> strings1 = strings;
        for (int i = 0; i < strings1.size(); i++){
            String temp = strings1.get(i);
            strings1.set(i, "");
            String etalon = getSort(temp);
            System.out.print(temp);
            for (int j = 0; j < strings1.size(); j++) {
                if (etalon.equals(getSort(strings1.get(j)))) {
                    if (!strings1.get(j).isEmpty()) {
                        System.out.print(", " + strings1.get(j));
                        strings1.set(j, "");
                    }
                }
            }
            if (!temp.isEmpty()) {
                System.out.println();
            }
        }
    }

    public static String getSort(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}