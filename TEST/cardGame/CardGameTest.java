package cardGame;

import cardGame.Exceptions.*;
import org.junit.jupiter.api.Test;

import static cardGame.Suit.*;
import static org.junit.jupiter.api.Assertions.*;

class CardGameTest {
    @Test
        void diamondCanBeCreated(){
            CardGame card = new CardGame (DIAMOND, 13);
            assertSame ( DIAMOND, card.getSuit() );
    }

    @Test
    void spadeCanBeCreated(){
        CardGame card = new CardGame ( SPADE, 2);
        assertSame ( SPADE, card.getSuit() );
    }

    @Test
    void heartCanBeCreated(){
        CardGame card = new CardGame ( HEART, 2);
        assertSame ( HEART, card.getSuit() );
    }
    @Test
    void clubsCanBeCreated(){
        CardGame card = new CardGame ( CLUB, 2);
        assertSame ( CLUB, card.getSuit() );
    }
    @Test
    void aceCardsCanBeCreated(){
        CardGame card = new CardGame ( CLUB, 1);
        assertEquals ( "Ace", card.getValue() );
    }

    @Test
    void jackCardsCanBeCreated(){
        CardGame card = new CardGame ( CLUB, 11);
        assertEquals ( "Jack", card.getValue() );
    }

    @Test
    void queenCardsCanBeCreated(){
        CardGame card = new CardGame ( CLUB, 12);
        assertEquals ( "Queen", card.getValue() );
    }

    @Test
    void kingCardsCanBeCreated(){
        CardGame card = new CardGame ( CLUB, 13);
        assertEquals ( "King", card.getValue() );
    }

    @Test
    void numericCardsCanBeCreated(){
        CardGame card = new CardGame ( CLUB, 8);
        assertEquals ( "8", card.getValue() );
    }

    @Test
    void invalidCardExceptionIsThrownWhenValueIsInvalid(){
        assertThrows ( InvalidCardValueException.class, ()-> new CardGame (DIAMOND, 14) );
        assertThrows ( InvalidCardValueException.class, ()-> new CardGame (DIAMOND, 0) );
    }
    @Test
    void displayCard(){
        CardGame diamond = new CardGame(DIAMOND,13);
        assertEquals("King of Diamond", diamond.toString());

        CardGame heart = new CardGame(HEART,12);
        assertEquals("Queen of Heart", heart.toString());

        CardGame spade = new CardGame(SPADE,1);
        assertEquals("Ace of Spade", spade.toString());

        CardGame club = new CardGame(CLUB,11);
        assertEquals("Jack of Club", club.toString());
    }
    @Test
    void testSameCardValueEquals(){
        CardGame kingOfSpade = new CardGame(SPADE, 13);
        CardGame kingOfHeart = new CardGame(HEART, 13);
        assertEquals(kingOfHeart, kingOfSpade);

    }
    @Test
    void testSameCardSuitEquals(){
        CardGame kingOfSpade = new CardGame(SPADE, 4);
        CardGame queenOfSpade = new CardGame(SPADE, 13);
        assertEquals(queenOfSpade, kingOfSpade);
    }
    @Test
    void testNotSameObject(){
        CardGame kingOfSpade = new CardGame(SPADE, 4);
        CardDeck cardDeck = new CardDeck(3);

        assertNotEquals(cardDeck, kingOfSpade);
    }

}