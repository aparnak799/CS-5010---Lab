package birds;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Class representing Pigeon classifcation of Bird
 */
public class Pigeon extends Bird {

    /**
     * Main constructor for this class
     * @param birdName
     * @param noOfWings
     * @param extinct
     * @param characteristics
     * @param preferredFoods
     * @param foodRequired
     * @param variety
     */
    public Pigeon(String birdName, int noOfWings, boolean extinct, ArrayList<Characteristics> characteristics, ArrayList<Foods> preferredFoods, int foodRequired, String variety) {
        super(Birds.PIGEON, birdName, noOfWings, extinct, characteristics, preferredFoods, foodRequired);
        this.variety = variety;
    }

    /**
     *
     * @param birdName
     * @param noOfWings
     * @param extinct
     * @param variety
     */
    public Pigeon(String birdName, int noOfWings, boolean extinct, String variety) {
        this(birdName, noOfWings, extinct, new ArrayList<Characteristics>(Arrays.asList(Characteristics.MAMMALIAN)), new ArrayList<Foods>(Arrays.asList(Foods.INSECT, Foods.VEGETATION)), 3, variety);
    }

    private String variety;

    /**
     *
     * @return get variety of pigeon
     */
    public String getVariety() {
        return variety;
    }

    /**
     * sets variety of pigeon
     * @param variety
     */
    public void setVariety(String variety) {
        this.variety = variety;
    }

    @Override
    public String toString(){
        return String.format("Bird(id=%s, type=%s, name=%s, noOfWings=%s, isExtinct=%s, preferredFoods=%s, characteristics=%s, variety=%s)", getBirdId(), getBirdType(), getBirdName(), getNoOfWings(), isExtinct(), getPreferredFoods(), getCharacteristics(), getVariety());
    }

}

