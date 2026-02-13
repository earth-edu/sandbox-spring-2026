package org.example.sandbox.cards;

public class DeckDriver {
    public static void main(String[] args) {
        Deck cards = new StandardDeck();
        displayDeck(cards);

        cards.shuffle();
        System.out.println("Shuffled: ");
        displayDeck(cards);

        Card card = cards.deal();
        System.out.println("Top card dealt: " + card);
        displayDeck(cards);

        System.out.print("\nTop card displayed: ");
        System.out.println(cards.turnOver());
        displayDeck(cards);

        cards.cut(cards.size() / 2);
        System.out.print("\nCut deck: ");
        displayDeck(cards);
    }

    private static void displayDeck(Deck cards){
        System.out.println(cards);
    }
}
