package birds;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Class Representing the Owl Classification
 */
public class Owl extends Bird {

    /**
     * Main Constructor for this class
     * @param birdName
     * @param noOfWings
     * @param extinct
     * @param characteristics
     * @param preferredFoods
     * @param foodRequired
     */

    public Owl(String birdName, int noOfWings, boolean extinct, ArrayList<Characteristics> characteristics, ArrayList<Foods> preferredFoods, int foodRequired) {
        super(Birds.OWL, birdName, noOfWings, extinct, characteristics, preferredFoods,foodRequired);
    }

  /**
   * constructor for this class
   * uses default values to prevent redundancy
   * @param birdName
   * @param noOfWings
   * @param extinct
   */
    public Owl(String birdName, int noOfWings, boolean extinct) {
        this(birdName, noOfWings, extinct, new ArrayList<Characteristics>(Arrays.asList(Characteristics.FACIAL_DISKS)), new ArrayList<>(Arrays.asList(Foods.INSECT, Foods.SEEDS, Foods.BUDS)),6);
    }

}
