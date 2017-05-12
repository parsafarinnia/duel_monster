package aut;

/**
 * Created by parsa on 5/12/17.
 */
public class CardDeck extends  ObjectDeck{


    public CardDeck(Card[] cards) {
        super(cards);
    }

    @Override
    public Card deal(){
    Card card= (Card) deck[super.index];
    super.index--;
return card;
    }
}
