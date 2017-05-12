package game.pkg;

import card.pkg.Card;
import card.pkg.MonsterCard;


/**
 * Created by parsa on 5/12/17.
 */
public  class BlueEyesWhiteDragon extends MonsterCard {
    public BlueEyesWhiteDragon() {
        super("Blue Eyes White Dragon", "Thebest card",3000,true );

    }

    @Override
    public void instantEffect(Field owner, Field enemy) {
        int j=0;
        for(int i=0;i<=4&&j<2;i++){
            if(owner.getMonsters()[i]==null){
                owner.getMonsters()[i]=new BlueEyesWhiteDragon();
                j++;
            }
        }
    }
}
