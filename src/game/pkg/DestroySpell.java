package game.pkg;

import card.pkg.Special;
import card.pkg.SpellCard;
import card.pkg.TrapCard;

/**
 * Created by parsa on 5/12/17.
 */
public class DestroySpell extends TrapCard implements Special {
    public DestroySpell() {
        super("Destroy Spell", "Destroys the enemys first spell card");
    }


    @Override
    public void instantEffect(Field owner, Field enemy) {

        enemy.destroyFirstSpell();

    }
}
