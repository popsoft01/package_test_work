package cardGame;

import cardGame.Exceptions.StackOverFlowException;
import cardGame.Exceptions.StackUnderFlow;

import java.security.SecureRandom;


public class CardDeck {
    private CardGame[] cards;
    private int lastPushedLocation = -1;

    public CardDeck(int numberOfCard) {
        cards = new CardGame[numberOfCard];

    }

    public int getSize() {
        return cards.length;
    }

    public void push(CardGame card) {
        if (isFull()) throw new StackOverFlowException("Card deck is full");
        lastPushedLocation++;
        cards[lastPushedLocation] = card;

    }

    public CardGame peek() {
        if (isEmpty()) throw new StackUnderFlow("Card deck is empty");
        return cards[lastPushedLocation];
    }


    public CardGame pop() {
        if (isEmpty()) throw new StackUnderFlow("Card deck is empty");

        return cards[lastPushedLocation--];
    }

    public boolean isEmpty() {
        return lastPushedLocation == -1;
    }

    public boolean isFull() {

        return (lastPushedLocation == getSize() - 1);
    }

    public void shuffle() {
        SecureRandom rand = new SecureRandom();
        CardGame temp;
        for (int i = cards.length - 1; i > 0; i--) {

            int randomIndex = rand.nextInt(cards.length - 1);
            temp = cards[randomIndex];
            cards[randomIndex] = cards[i];
            cards[i] = temp;
        }
    }
}
