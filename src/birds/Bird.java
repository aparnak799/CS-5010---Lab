package birds;

import java.util.ArrayList;

public abstract class Bird {

    protected static int count = 0;
    protected int birdId;
    protected Birds birdType;
    protected String birdName;
    protected int noOfWings;
    protected boolean extinct;
    protected ArrayList<Characteristics> characteristics;
    protected ArrayList<Foods> preferredFoods;

    public int getFoodRequired() {
        return foodRequired;
    }

    public void setFoodRequired(int foodRequired) {
        this.foodRequired = foodRequired;
    }

    protected int foodRequired;

    public Bird(Birds birdType, String birdName, int noOfWings, boolean extinct, ArrayList<Characteristics> characteristics, ArrayList<Foods> preferredFoods, int foodRequired) {
        this.birdId = ++count;
        this.birdType = birdType;
        this.birdName = birdName;
        this.noOfWings = noOfWings;
        this.extinct = extinct;
        this.characteristics = characteristics;
        this.preferredFoods = preferredFoods;
        this.foodRequired = foodRequired;
    }



    public int getBirdId() {
        return birdId;
    }

    public void setBirdId(int birdId) {
        this.birdId = birdId;
    }

    public Birds getBirdType() {
        return birdType;
    }

    public void setBirdType(Birds birdType) {
        this.birdType = birdType;
    }

    public String getBirdName() {
        return birdName;
    }

    public void setBirdName(String birdName) {
        this.birdName = birdName;
    }

    public int getNoOfWings() {
        return noOfWings;
    }

    public void setNoOfWings(int noOfWings) {
        this.noOfWings = noOfWings;
    }

    public boolean isExtinct() {
        return extinct;
    }

    public void setExtinct(boolean extinct) {
        this.extinct = extinct;
    }

    public ArrayList<Characteristics> getCharacteristics() {
        return characteristics;
    }

    public void setCharacteristics(ArrayList<Characteristics> characteristics) {
        this.characteristics = characteristics;
    }

    public ArrayList<Foods> getPreferredFoods() {
        return preferredFoods;
    }

    public void setPreferredFoods(ArrayList<Foods> preferredFood) {
        this.preferredFoods = preferredFood;
    }

    @Override
    public String toString(){
        return String.format("Bird(id=%s, type=%s, name=%s, noOfWings=%s, isExtinct=%s, preferredFoods=%s, characteristics=%s)", getBirdId(), getBirdType(), getBirdName(), getNoOfWings(), isExtinct(), getPreferredFoods(), getCharacteristics());
    }


}
