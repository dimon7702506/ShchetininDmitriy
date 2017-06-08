package com.source.it.lecture9.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnagramSorter {
    public static void main(String[] args) {
        List<String> strings =
                Arrays.asList("done", "none", "node", "neno", "onion", "deno", "gram", "ramg", "nioon");
        List<String> result = Arrays.asList();

        for (int i = 0; i < strings.size(); i++){
            String temp = "";
            if(i == 0){
                System.out.println(strings.get(i));
                temp = strings.get(i);
                strings.remove(i);
            }
            String etalon = getSort(temp);
            System.out.println();
            for (int j = 1; j < strings.size(); j++) {
                if (etalon == getSort(strings.get(j))) {
                    System.out.print(strings.get(j) + ", ");
                    strings.remove(j);
                }
            }
            System.out.println(etalon);
        }
    }

    public static String getSort(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
