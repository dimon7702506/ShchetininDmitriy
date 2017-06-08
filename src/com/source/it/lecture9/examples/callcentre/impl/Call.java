package com.source.it.lecture9.examples.callcentre.impl;

public class Call {
    private String operator;
    private int duration;

    public Call(String operator, int duration) {
        this.operator = operator;
        this.duration = duration;
    }

    public String getOperator() {
        return operator;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Call call = (Call) o;

        if (duration != call.duration) return false;
        return !(operator != null ? !operator.equals(call.operator) : call.operator != null);

    }

    @Override
    public int hashCode() {
        int result = operator != null ? operator.hashCode() : 0;
        result = 31 * result + duration;
        return result;
    }

    @Override
    public String toString() {
        return "Call{" +
                "operator='" + operator + '\'' +
                ", duration=" + duration +
                '}';
    }
}
