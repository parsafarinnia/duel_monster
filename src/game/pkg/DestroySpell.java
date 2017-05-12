package game.pkg;

import card.pkg.TrapCard;

/**
 * Created by parsa on 5/12/17.
 */
public abstract class DestroySpell extends TrapCard {
    public DestroySpell(String name, String description) {
        super("Destroy Spell", "Destroys the enemys first spell card");
    }
}
