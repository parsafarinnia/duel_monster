package aut;

/**
 * Created by parsa on 5/12/17.
 */
public abstract class Card implements Special{
    private String name;
    private String description;

    public Card(String name,String description) {
        this.name = name;
        this.description=description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    //@Override
public boolean equals(Card card1,Card card2){
        if((card1.getName().equals(card2.getName()))&&(card1.getDescription().equals(card2.getDescription()))){
            return true;
        }
        else return false;
    }
    //@Override
    public String toString(Card card){

return card.getName()+":  "+card.getDescription();
    }


}
