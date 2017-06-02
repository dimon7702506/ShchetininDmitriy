package com.source.it.lecture7.examples.enumExamples;


import java.util.Arrays;

import static com.source.it.lecture7.examples.enumExamples.CardType.*;

public class EnumExamples {
    public static void main(String[] args) {
        Card master = new Card("4888888111", "123", MASTERCARD);


        System.out.println(MASTERCARD == master.getCardType());
        System.out.println(Arrays.toString(CardType.values()));
        System.out.println(MASTERCARD.validate("fqsfaf"));
        System.out.println(AMEX.validate("fqsfaf"));
    }
}
