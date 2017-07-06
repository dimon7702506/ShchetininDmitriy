package com.source.it.lecture4.homework.visitors;

public class Visit{
    private long time;
    private boolean come;

    public long getTime() {
        return time;
    }

    @Override
    public String toString() {
        return "Visit{" +
                "time=" + time +
                ", come=" + come +
                '}';
    }

    public void setTime(long time) {
        this.time = time;
    }

    public boolean isCome() {
        return come;
    }

    public void setCome(boolean come) {
        this.come = come;
    }

    public Visit(long time, boolean come) {
        this.time = time;
        this.come = come;
    }
}
