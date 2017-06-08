package com.source.it.lecture9.examples.callcentre;



import com.source.it.lecture9.examples.callcentre.impl.Call;
import com.source.it.lecture9.examples.callcentre.impl.CallCentre;

import java.util.Arrays;

public class CallCentreTest1 {
    public static void main(String[] args) {
        Call[] calls = new Call[10];
        /*for (Call call : calls) { //WRONG!!!!
            call = CallCentre.produceCall();
        }*/

        for (int index = 0; index < calls.length; index++) {
            calls[index] = CallCentre.produceCall();
        }
        System.out.println(Arrays.toString(calls));
    }
}
