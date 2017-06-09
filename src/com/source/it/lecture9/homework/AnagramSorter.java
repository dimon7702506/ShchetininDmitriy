package com.source.it.lecture9.homework;

import java.util.Arrays;
import java.util.List;

public class AnagramSorter {
    public static void main(String[] args) {
        List<String> strings =
                Arrays.asList("done", "none", "node", "neno", "onion", "deno", "gram", "ramg", "nioon");

        for (int i = 0; i < strings.size(); i++){
            String temp = strings.get(i);
            strings.set(i, "");
            String etalon = getSort(temp);
            System.out.print(temp);
            for (int j = 0; j < strings.size(); j++) {
                if (etalon.equals(getSort(strings.get(j)))) {
                    if (!strings.get(j).isEmpty()) {
                        System.out.print(", " + strings.get(j));
                        strings.set(j, "");
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
