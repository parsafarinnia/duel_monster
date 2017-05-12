package game.pkg;


import card.pkg.*;

/**
 * Created by parsa on 5/12/17.
 */
public class Player {
    private CardDeck mainDeck;
    private SpecialDeck specialDeck;
    private Card hand[] = new Card[5];
    private Special nextSpecial;
    private int lifePoints;

    public void setLifepoints(int lifepoints) {
        this.lifePoints = lifepoints;
    }

    public void setNextSpecial(Special nextSpecial) {

        this.nextSpecial = nextSpecial;
    }

    public void setHand(Card[] hand) {

        this.hand = hand;
    }

    public void setSpecialDeck(SpecialDeck specialDeck) {

        this.specialDeck = specialDeck;
    }

    public void setMainDeck(CardDeck mainDeck) {

        this.mainDeck = mainDeck;
    }

    public int getLifePoints() {

        return lifePoints;
    }

    public Special getNextSpecial() {

        return nextSpecial;
    }

    public Card[] getHand() {

        return hand;
    }

    public SpecialDeck getSpecialDeck() {

        return specialDeck;
    }

    public CardDeck getMainDeck() {

        return mainDeck;
    }

    public Player(CardDeck normalDeck, SpecialDeck specialDeck, int lifepoints) {
        mainDeck = normalDeck;
        this.specialDeck = specialDeck;
        this.lifePoints = lifepoints;
    }

    public Player(CardDeck normalDeck, SpecialDeck specialDeck) {
        mainDeck = normalDeck;
        this.specialDeck = specialDeck;
        this.lifePoints = 5000;
    }

    public boolean draw(int count) {
        int j = 0;
        int k = count;
        if (k > mainDeck.size()) {
            return false;
        }

        for (int i = 0; i <= 4; i++) {

            if ((hand[i] == null) && (count > 0)) {
                hand[i] = mainDeck.deal();
                j++;
                count--;
            }


        }
        return true;


    }

    public void drawSpecialCard() {
        if (nextSpecial == null) {
            nextSpecial = specialDeck.deal();
        }
    }

    public void nextTurnPrep() {
        if (draw(1) == false) {
            lifePoints = lifePoints - 500;
        } else {
            draw(1);
        }
        drawSpecialCard();

    }

    public boolean playCardFromHand(int whichCard, Field myField) {
        if (whichCard >= 0 && whichCard < 5) {
            if (hand[whichCard] != null) {
                if (hand[whichCard].cardType.equals("monster card")) {
                    myField.addMonsterCard((MonsterCard) hand[whichCard]);
                    hand[whichCard] = null;


                }
                if (hand[whichCard].cardType.equals("spell card")) {
                    myField.addSpellCard((SpellCard) hand[whichCard]);
                    hand[whichCard] = null;


                }
            }
            return true;

        }


        return false;
    }
    public boolean playSpecial(Field myField){

return true;
        }
        public void changeLifePoints(int change){
        lifePoints=lifePoints+change;
        }
        public boolean isDefeated(){
            if (lifePoints<0)return true;
            else  return false;
        }

    }



