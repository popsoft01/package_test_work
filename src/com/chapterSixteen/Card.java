package com.chapterSixteen;

public class Card {
    private final Faces faces;
    private final Suit suit;


    public Card(Faces faces, Suit suit) {
        this.faces = faces;
        this.suit = suit;
    }

    public Faces getFaces() {
        return faces;
    }

    public Suit getSuit() {
        return suit;
    }

    @Override
    public String toString() {
        return String.format("%s of %s", getFaces(), getSuit());
    }
}
