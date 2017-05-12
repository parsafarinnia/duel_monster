package card.pkg;

import game.pkg.Field;

/**
 * Created by parsa on 5/12/17.
 */
public abstract  class SpellCard extends Card {

    public SpellCard(String name, String description) {
        super(name, description);
        cardType="spell card";
    }
    public abstract void turnEffect(Field ownerField, Field enemyField);

    public abstract void instantEffect(Field owner, Field enemy);

    protected abstract void destroyedEffect(Field ownerField, Field enemyField);
    public boolean equals(SpellCard card1,SpellCard card2){

         if((super.equals(card1,card2))&&(card1.cardType.equals(card2.cardType))){
             return true;
         }
         else return false;

    }
}
