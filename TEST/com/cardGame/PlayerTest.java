package com.cardGame;

import cardGame.CardGame;
import cardGame.Player;
import org.junit.jupiter.api.Test;

import static cardGame.Suit.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PlayerTest {
    @Test
        void playerHasanId(){
        Player player = new Player ("Michael");
        assertEquals ( "Michael", player.getName() );
    }

    @Test
    void playerHasCards(){
        Player player = new Player ("Michael");
        player.addCard(new CardGame ( DIAMOND,4 ));
        player.addCard(new CardGame ( SPADE,2 ));
        player.addCard(new CardGame ( CLUB,5));


        assertEquals ( 3, player.getNumberOfCards() );
    }
    @Test
    void teste() {
        int a = 10;
        int b = 20;
        a += (a = 4);
        b = b + (b = 5);
        System.out.println(a+ ",  "+b);
    }

}