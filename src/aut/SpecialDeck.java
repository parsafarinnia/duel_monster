package aut;

/**
 * Created by parsa on 5/12/17.
 */
public class SpecialDeck extends ObjectDeck{
public SpecialDeck(Special []specials){
    super(specials);
}
public Special deal(){
    return (Special)super.deal();
}
}
