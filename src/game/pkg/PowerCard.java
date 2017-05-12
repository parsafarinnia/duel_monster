package game.pkg;

import card.pkg.MonsterCard;
import card.pkg.SpellCard;



/**
 * Created by parsa on 5/12/17.
 */
public  class PowerCard extends SpellCard {


    public PowerCard() {
        super("Power Card", "Increase power of monsters by 100 each turn");

    }

    @Override
    public void turnEffect(Field ownerField, Field enemyField) {

    }

    @Override
    public void instantEffect(Field owner, Field enemy) {
        MonsterCard [] monsterCards =owner.getMonsters();
        for(int i=0;i<=4;i++){
            if(monsterCards[i]!=null)
            {
                monsterCards[i].setPower(monsterCards[i].getPower()+100);
            }
        }
    }

    @Override
    protected void destroyedEffect(Field ownerField, Field enemyField) {
        MonsterCard [] monsterCards =ownerField.getMonsters();
        for(int i=0;i<=4;i++){
            if(monsterCards[i]!=null)
            {
                monsterCards[i].setPower(monsterCards[i].getPower()-300);
            }
        }
    }


    @Override
    public void instantEffect(java.lang.reflect.Field owner, java.lang.reflect.Field enemy) {

    }
}

