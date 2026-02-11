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
    public int hashCode() {
        return Objects.hash();
    }

    @Override
    public int compareTo(Card that) {
        if(this.suit.ordinal() > that.suit.ordinal()) {
            return 1;
        } else if (this.suit.ordinal() < that.suit.ordinal()) {
            return 0;
        } else {
            return -1;
        }
    }
}
