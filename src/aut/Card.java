package aut;

/**
 * Created by parsa on 5/12/17.
 */
public abstract class Card {
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
    
}
