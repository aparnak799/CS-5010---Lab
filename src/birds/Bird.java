package birds;

import java.util.ArrayList;

/**
 * This class represents a bird with all its inherent properties.
 */
public abstract class Bird {

    protected static int count = 0;
    protected int birdId;
    protected Birds birdType;
    protected String birdName;
    protected int noOfWings;
    protected boolean extinct;
    protected int foodRequired;

    protected ArrayList<Characteristics> characteristics;
    protected ArrayList<Foods> preferredFoods;

    /**
     *
     * @return the amount of food required for each bird
     */
    public int getFoodRequired() {
        return foodRequired;
    }

    /**
     * Sets the amount of food required for each bird
     * @param foodRequired
     */
    public void setFoodRequired(int foodRequired) {
        this.foodRequired = foodRequired;
    }


    /**
     * Constructor for the Bird class
     * @param birdType
     * @param birdName
     * @param noOfWings
     * @param extinct
     * @param characteristics
     * @param preferredFoods
     * @param foodRequired
     */
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

    /**
     *
     * @return birdId
     */
    public int getBirdId() {
        return birdId;
    }

    /**
     * Sets the BirdId
     * @param birdId
     */
    public void setBirdId(int birdId) {
        this.birdId = birdId;
    }

    /**
     *
     * @return the type of bird
     */
    public Birds getBirdType() {
        return birdType;
    }

    /**
     * Sets the type of bird, i.e., classification
     * @param birdType
     */
    public void setBirdType(Birds birdType) {
        this.birdType = birdType;
    }

    /**
     *
     * @return name of bird (Example: "Eagle", "Vulture")
     */
    public String getBirdName() {
        return birdName;
    }

    /**
     * sets the name of bird (Example: "Eagle", "Vulture")
     * @param birdName
     */
    public void setBirdName(String birdName) {
        this.birdName = birdName;
    }

    /**
     * @return No of Wings possessed by each bird
     */
    public int getNoOfWings() {
        return noOfWings;
    }

    /**
     * sets the no of wings possessed by each bird
     * @param noOfWings
     */
    public void setNoOfWings(int noOfWings) {
        this.noOfWings = noOfWings;
    }

    /**
     *
     * @return true if bird is extinct otherwise false
     */
    public boolean isExtinct() {
        return extinct;
    }

    /**
     * Set to true if bird is extinct otherwise false
     * @param extinct
     */
    public void setExtinct(boolean extinct) {
        this.extinct = extinct;
    }

    /**
     *
     * @return Characteristics Array of Each Bird
     */
    public ArrayList<Characteristics> getCharacteristics() {
        return characteristics;
    }

    /**
     * Sets the Characteristics Array of Each Bird
     * @param characteristics
     */
    public void setCharacteristics(ArrayList<Characteristics> characteristics) {
        this.characteristics = characteristics;
    }

    /**
     *
     * @return the food preference of each bird
     */
    public ArrayList<Foods> getPreferredFoods() {
        return preferredFoods;
    }

    /**
     * sets the food preference of each bird
     * @param preferredFood
     */
    public void setPreferredFoods(ArrayList<Foods> preferredFood) {
        this.preferredFoods = preferredFood;
    }

    @Override
    public String toString(){
        return String.format("Bird(id=%s, type=%s, name=%s, noOfWings=%s, isExtinct=%s, preferredFoods=%s, characteristics=%s)", getBirdId(), getBirdType(), getBirdName(), getNoOfWings(), isExtinct(), getPreferredFoods(), getCharacteristics());
    }


}
