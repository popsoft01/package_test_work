package com.WhotGame;

import cardGame.Exceptions.InvalidCardValueException;


public class CardGame {
    private final int value;
    private final Suit suit;

    private CardGame(Suit suit, int value) {
//        if (value < 1 || value > 13){
//            throw new InvalidCardValueException(value + " Is Not a Valid Card Value");
//        }
        this.value = value;
        this.suit = suit;
    }

    public static CardGame canCreateTriangleCard(int value){
        return new CardGame(Suit.TRIANGLE,2);
    }

    public static CardGame canCreateCircleCard(int value){
        return new CardGame(Suit.CIRCLE,2);
    }
    public static CardGame canCreateSqureCard(int value){
        return new CardGame(Suit.SQUARES,2);
    }
    public static CardGame canCreateStarCard(int value){
        return new CardGame(Suit.STAR,2);
    }
    public static CardGame canCreateCrossCard(int value){
        return new CardGame(Suit.CROSSES,2);
    }
    public static CardGame canCreateWhotrCard(int value){
        return new CardGame(Suit.WHOT,2);
    }

    public Suit getSuit() {
        return suit;
    }

//    public String getValue() {
//
////        return switch (this.value) {
////            case 1 -> "Ace";
////            case 11 -> "Jack";
////            case 12 -> "Queen";
////            case 13 -> "King";
////            default -> ""+value;
////        };
//    }

}
