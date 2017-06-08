package com.source.it.lecture9.examples.callcentre.impl;

public class CallsDto {
    private String operator;
    private int summaryCallsDuration;
    private int callsQuantity;

    public CallsDto(String operator, int summaryCallsDuration, int callsQuantity) {
        this.operator = operator;
        this.summaryCallsDuration = summaryCallsDuration;
        this.callsQuantity = callsQuantity;
    }

    public String getOperator() {
        return operator;
    }

    public int getSummaryCallsDuration() {
        return summaryCallsDuration;
    }

    public int getCallsQuantity() {
        return callsQuantity;
    }

    @Override
    public String toString() {
        return "CallsDto{" +
                "operator='" + operator + '\'' +
                ", summaryCallsDuration=" + summaryCallsDuration +
                ", callsQuantity=" + callsQuantity +
                '}';
    }
}
