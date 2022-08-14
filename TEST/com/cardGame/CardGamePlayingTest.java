package com.cardGame;

import cardGame.CardGamePlaying;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class CardGamePlayingTest {
    @Test
    void cardGameCanBeCreated() {
        CardGamePlaying cardGame = new CardGamePlaying(2, 5);
        assertNotNull(cardGame);
    }

    @Test
    void gameIsInitializedWithNumberOfPlayerCanBeCreated() {
        CardGamePlaying cardGame = new CardGamePlaying(2, 5);
        assertEquals(2, cardGame.getNumberOfPlayers());
    }
}