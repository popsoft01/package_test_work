package com.chapterSixteen;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DeckOfCard {
    private List<Card> list;

    public DeckOfCard() {
        Card[] card = new Card[52];
        int count = 0;
        for (Suit suit : Suit.values()) {
            for (Faces face : Faces.values()) {
                card[count] = new Card(face, suit);
                ++count;
            }
        }
        list = Arrays.asList(card);
        Collections.shuffle(list);
    }

    public void printCards() {
        for (int i = 0; i < list.size(); i++)
            System.out.printf("%-19s%s", list.get(i), ((i + 1) % 4 == 0) ? "%n" : "");
    }

    public static void main(String[] args) {
        DeckOfCard card = new DeckOfCard();
        card.printCards();
    }
}
