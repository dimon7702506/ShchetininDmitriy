package com.source.it.lecture4.homework.visitors;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;

public class MaxVisitorInOfficeNew {
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

        Visit[] visit = new Visit[visitors.length * 2];

        int j = 0;
        for (int i = 0; i < visitors.length * 2; i++){
            visit[i] = new Visit(visitors[j].getComeTime(),true);
            i++;
            visit[i] = new Visit(visitors[j].getLeaveTime(),false);
            j++;
        }

        Arrays.sort(visit, new Comparator<Visit>() {
            @Override
            public int compare(Visit o1, Visit o2) {
                return o1.getTime() > o2.getTime() ? 1 : -1;
            }
        });

        int current = 0;
        maxVisitorAtOnce = 1;

        for (int i = 0; i < visit.length; i++) {
            if (visit[i].isCome()){
                current += 1;
            } else {
                current -= 1;
            }
            if (maxVisitorAtOnce < current) {
                maxVisitorAtOnce = current;
            }
        }
        System.out.println("Max visitors was " + maxVisitorAtOnce);
    }
}
