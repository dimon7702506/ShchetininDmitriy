package com.source.it.lecture7.examples.enumExamples;

public class Card {
    private String number;
    private String pin;
    private CardType cardType;

    public Card(String number, String pin, CardType cardType) {
        if (!cardType.validate(number)) {
            throw new IllegalArgumentException("VALIDATION failed");
        }
        this.number = number;
        this.pin = pin;
        this.cardType = cardType;
    }

    public String getNumber() {
        return number;
    }

    public String getPin() {
        return pin;
    }

    public CardType getCardType() {
        return cardType;
    }
}
