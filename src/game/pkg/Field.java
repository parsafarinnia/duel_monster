package game.pkg;

import card.pkg.MonsterCard;
import card.pkg.Special;
import card.pkg.SpellCard;

/**
 * Created by parsa on 5/12/17.
 */
public class Field {
   private MonsterCard monsters[] = new MonsterCard[5];
     private SpellCard spells[] = new SpellCard[5];



    public MonsterCard[] getMonsters() {
        return monsters;
    }

    public SpellCard[] getSpells() {
        return spells;
    }

    public void destroyFirstSpell() {
        for(int i =0 ; i < 5 ; i ++){
            if (spells[i] != null) {
                spells[i] = null;
                return;
            }
        }
    }

    public void setMonsters(MonsterCard[] monsters) {

        this.monsters = monsters;
    }

    public void cardTurnEffects(Field enemyField) {
        //TODO
for(int i=0 ;i<5;i++)
    if(monsters[i]!=null){
        monsters[i].setCanAttack(true);
    }
    for(int i=0 ;i<5;i++)
        if(spells[i]!=null){
         //   spells[i].turnEffect
        }}

    public boolean addMonsterCard(MonsterCard card) {
        for (int i=0;i<5;i++){
            if(monsters[i]==null){
                monsters[i]=card;
                return true;
            }
        }
        return false;
    }

    public boolean addSpellCard(SpellCard card) {
        for (int i=0;i<5;i++){
            if(monsters[i]==null){
                spells[i]=card;
                return true;
            }
        }
        return false;
    }


}
