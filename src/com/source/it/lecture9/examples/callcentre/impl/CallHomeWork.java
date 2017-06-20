package com.source.it.lecture9.examples.callcentre.impl;

import java.util.*;

public class CallHomeWork {
    private static final int TOTAL_CALLS = 10;
    private static final String OPERATOR = "Operator";

    public static void main(String[] args) {
        List<Call> calls = new ArrayList<>(/*TOTAL_CALLS*/);// ToDo : choose collection impl
        List<CallsDto> calls_Dto = new ArrayList<>();

        for (int i = 0; i < TOTAL_CALLS; i++) {
            calls.add(CallCentre.produceCall());

        }
        System.out.println(Arrays.toString(calls.toArray()));
        List<Integer> durations = Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
        Set<String> operators = new HashSet<>();


        for (Call call : calls) {
            int current = call.getDuration();
            String operator = call.getOperator();
            operators.add(operator);
            String operatorNumber = operator.substring(OPERATOR.length());
            int durationIndex = Integer.parseInt(operatorNumber) - 1;
            durations.set(durationIndex, current + durations.get(durationIndex));
            calls_Dto.add(new CallsDto(operator, durations.get(durationIndex), 1));
        }

        System.out.println("---------------------");
        System.out.println(calls_Dto);
        System.out.println("---------------------");

        for (CallsDto callDto : calls_Dto) {

        }

        for (String operator : operators) {
            String operatorNumber = operator.substring(OPERATOR.length());
            int durationIndex = Integer.parseInt(operatorNumber) - 1;
            System.out.println("Operator " + operator + " talked for " + durations.get(durationIndex));
        }
    }
}
