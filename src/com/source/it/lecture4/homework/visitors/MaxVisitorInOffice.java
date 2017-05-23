package com.source.it.lecture4.homework.visitors;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;

public class MaxVisitorInOffice {
    public static void main(String[] args) {

        Visitor[] visitors = Visitor.createVisitors();
        Arrays.sort(visitors, new Comparator<Visitor>() {
            @Override
            public int compare(Visitor o1, Visitor o2) {
                return o1.getComeTime() > o2.getComeTime() ? 1 : -1;
            }
        });
        for (Visitor visitor : visitors) {
            System.out.println("Come " + new Date(visitor.getComeTime()));
            System.out.println("Leave " + new Date(visitor.getLeaveTime()));
        }
        int maxVisitorAtOnce = 0;

        /*Your code here*/
        int counter[] = new int[Visitor.MAX_VISITORS_PER_DAY];

        for (int i = 0; i < visitors.length; i++){
            int count = 0;
            for (int j = 0; j < visitors.length; j++) {
                if (i != j) {
                    if (visitors[i].getComeTime() <= visitors[j].getComeTime() && visitors[j].getComeTime() <= visitors[i].getLeaveTime() && visitors[i].getLeaveTime() <= visitors[j].getLeaveTime()) {
                        count++;
                    }
                    if (visitors[j].getComeTime() <= visitors[i].getComeTime() && visitors[j].getComeTime() < visitors[i].getLeaveTime() && visitors[i].getLeaveTime() <= visitors[j].getLeaveTime()) {
                        count++;
                    }
                    if (visitors[i].getComeTime() < visitors[j].getComeTime() & visitors[j].getLeaveTime() < visitors[i].getLeaveTime()) {
                        count++;
                    }
                    if (visitors[j].getComeTime() < visitors[i].getComeTime() & visitors[i].getLeaveTime() < visitors[j].getLeaveTime()) {
                        count++;
                    }
                    counter[i] = count;
                }
            }
        }
        //System.out.println(Arrays.toString(counter));

        for (int i = 0; i < counter.length; i++){
            if (maxVisitorAtOnce < counter[i]) {
                maxVisitorAtOnce = counter[i];
            }
        }
        System.out.println("Max visitors was " + maxVisitorAtOnce);
    }
}
