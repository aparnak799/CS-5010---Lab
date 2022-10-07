package birds;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Class representing Bird Of Type: Flightless Bird
 */
public class FlightlessBird extends Bird {
  /**
   * Main Constructor for this class
   * @param birdName
   * @param noOfWings
   * @param extinct
   * @param characteristics
   * @param preferredFoods
   * @param foodRequired
   */
  public FlightlessBird(String birdName, int noOfWings, boolean extinct, ArrayList<Characteristics> characteristics,
      ArrayList<Foods> preferredFoods, int foodRequired) {
    super(Birds.FLIGHTLESS_BIRD, birdName, noOfWings, extinct, characteristics, preferredFoods, foodRequired);
  }

  /**
   * constructor for this class
   * uses default values to prevent redundancy
   * @param birdName
   * @param noOfWings
   * @param extinct
   */
  public FlightlessBird(String birdName, int noOfWings, boolean extinct) {
    this(birdName, noOfWings, extinct,
        new ArrayList<Characteristics>(
            Arrays.asList(Characteristics.LIVE_ON_GROUND, Characteristics.NO_WINGS, Characteristics.UNDER_WINGS)),
        new ArrayList<Foods> (Arrays.asList(Foods.BERRIES, Foods.SEEDS, Foods.FRUIT, Foods.INSECT, Foods.LARVAE,
            Foods.NUTS, Foods.VEGETATION)),
        7);
  }

}
