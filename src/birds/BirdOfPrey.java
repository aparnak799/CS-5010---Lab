package birds;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Class Represents the BirdsOfPrey classification of Bird
 */
public class BirdOfPrey extends Bird {
  /**
   *
   * Main constructor for this class
   * @param birdName
   * @param noOfWings
   * @param extinct
   * @param characteristics
   * @param preferredFoods
   * @param foodRequired
   */
  public BirdOfPrey(String birdName, int noOfWings, boolean extinct, ArrayList<Characteristics> characteristics,
      ArrayList<Foods> preferredFoods, int foodRequired) {
    super(Birds.BIRD_OF_PREY, birdName, noOfWings, extinct, characteristics, preferredFoods, foodRequired);
  }

  /**
   * Constructor for this class
   * Uses default values to prevent redundancy
   * @param birdName
   * @param noOfWings
   * @param extinct
   */
  public BirdOfPrey(String birdName, int noOfWings, boolean extinct) {
    this(birdName, noOfWings, extinct,
        new ArrayList<Characteristics>(Arrays.asList(Characteristics.SHARP_HOOKED, Characteristics.VISIBLE_NOSTRILS)),
        new ArrayList<Foods>(Arrays.asList(Foods.SMALL_MAMMALS)), 10);
  }
}
