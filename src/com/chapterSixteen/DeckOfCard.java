package com.chapterSixteen;

import java.util.List;

public class DeckOfCard {
    private List<Card> list;

    public DeckOfCard() {
        Card[] card = new Card[52];
        int count = 0;
        for (Suit suit :Suit.values()){
            for (Faces face : Faces.values()){
                card[count] = new Card(face,suit);
            }
        }
    }
    public void printCards(){
        for (int i = 0; i < list.size(); i++)
            System.out.printf("%-19s%s", list.get(i),
                    ((i + 1) % 4 == 0) ? "%n" : "");
    }
}
