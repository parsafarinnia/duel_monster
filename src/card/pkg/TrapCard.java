package card.pkg;

/**
 * Created by parsa on 5/12/17.
 */
public abstract class TrapCard extends Card {
    public TrapCard(String name, String description) {
        super(name, description);
        cardType="trap card";
    }
    public boolean equals(SpellCard card1,SpellCard card2){

        if((super.equals(card1,card2))&&(card1.cardType.equals(card2.cardType))){
            return true;
        }
        else return false;

    }


}
