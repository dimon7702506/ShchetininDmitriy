package com.source.it.lecture9.examples.callcentre;


import com.source.it.lecture9.examples.callcentre.impl.Call;
import com.source.it.lecture9.examples.callcentre.impl.CallCentre;
import com.source.it.lecture9.examples.callcentre.impl.CallsDto;

import java.util.*;

public class CallCentreTest3 {
    private static final int TOTAL_CALLS = 10;
    private static final String OPERATOR = "Operator";

    public static void main(String[] args) {
        List<Call> calls = new LinkedList<>();
        List<CallsDto> callsDtoList = new LinkedList<>();

        for (int i = 0; i < TOTAL_CALLS; i++) {
            calls.add(CallCentre.produceCall());
        }

        System.out.println(Arrays.toString(calls.toArray()));

        Map<String, Integer> callDurations = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String o1Number = o1.substring(OPERATOR.length());
                int o1IntNumber = Integer.parseInt(o1Number) - 1;
                String o2Number = o2.substring(OPERATOR.length());
                int o2IntNumber = Integer.parseInt(o2Number) - 1;
                return o1IntNumber - o2IntNumber;
            }
        });
        for (Call call : calls) {
            if (callDurations.get(call.getOperator()) != null) {
                callDurations.put(call.getOperator(),
                        callDurations.get(call.getOperator()) + call.getDuration());
            } else {
                callDurations.put(call.getOperator(), call.getDuration());
            }
            //CallsDto(call.getOperator(),call.getDuration(),count)
        }

        /*for (String operator : callDurations.keySet()) {
            System.out.println(operator + " helped customers for " + callDurations.get(operator) + " seconds");
        }*/

        for (Map.Entry<String, Integer> entry : callDurations.entrySet()) {
            System.out.println(entry.getKey() + " helped customers for " + entry.getValue() + " minutes");
        }

    }
}
