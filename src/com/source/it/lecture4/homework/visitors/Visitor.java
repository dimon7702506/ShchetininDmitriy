package com.source.it.lecture4.homework.visitors;

import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class Visitor {
    public final static int MAX_VISITORS_PER_DAY = 50;
    public final static int MIN_VISITORS_PER_DAY = 10;
    private long comeTime;
    private long leaveTime;

    public Visitor(long comeTime, long leaveTime) {
        this.comeTime = comeTime;
        this.leaveTime = leaveTime;
    }

    public long getLeaveTime() {
        return leaveTime;
    }

    public long getComeTime() {
        return comeTime;
    }

    public static  Visitor[] createVisitors() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(new Date().getYear(), new Date().getMonth(), new Date().getDate(), 0, 0, 0);
        long startWork = calendar.getTime().getTime() + 9 * 60 * 60 * 1000;
        long endWork = startWork + 8 * 60 * 60 * 1000;
        Random random = new Random();
        Visitor[] result =
                new Visitor[
                        random.nextInt(MAX_VISITORS_PER_DAY - MIN_VISITORS_PER_DAY)
                        + MIN_VISITORS_PER_DAY];
        for(int index = 0; index < result.length; index++) {
            long comeTime = 1000 * (random.nextInt(8 * 60 * 60) + 1) + startWork;
            long leaveTime = 1000 * random.nextInt((int) (endWork / 1000 - comeTime / 1000)) + comeTime;
            result[index] = new Visitor(comeTime,leaveTime);
        }
        return result;
    }
}
