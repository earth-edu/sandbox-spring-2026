package org.example.sandbox.cards;

import java.util.Objects;

public class Card implements Comparable<Card>{

    private final Suit suit;
    private final Rank rank;

    public Card(Suit suit, Rank rank){
        this.suit = suit;
        this.rank = rank;
    }

    public Suit getSuit(){
        return suit;
    }

    public Rank getRank(){
        return rank;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return suit == card.suit && rank == card.rank;
    }

    @Override
    public int hashCode() {
        return Objects.hash(suit, rank);
    }

    @Override
    public int compareTo(Card that) {
        if(this.suit.ordinal() > that.suit.ordinal()) {
            return 1;
        } else if (this.suit.ordinal() < that.suit.ordinal()) {
            return -1;
        } else {
            return Integer.compare(this.rank.ordinal(), that.rank.ordinal());
        }
    }

    @Override
    public String toString() {
        return rank + " of " + suit;
    }
}
