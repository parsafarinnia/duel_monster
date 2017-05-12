package aut;

/**
 * Created by parsa on 5/12/17.
 */
public class CardDeck extends  ObjectDeck{
    public int number;
    public Card [] cards;

    public CardDeck(Card[] cards) {
        this.cards = cards;
    }

    @Override
    public Card deal(){
    Card card=cards[number];
    number--;
return card;
    }
}
