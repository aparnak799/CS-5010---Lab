package birds;

import java.util.ArrayList;
import java.util.Arrays;

public class BirdOfPrey extends Bird {
  public BirdOfPrey(String birdName, int noOfWings, boolean extinct, ArrayList<Characteristics> characteristics,
      ArrayList<Foods> preferredFoods, int foodRequired) {
    super(Birds.BIRD_OF_PREY, birdName, noOfWings, extinct, characteristics, preferredFoods, foodRequired);
  }

  public BirdOfPrey(String birdName, int noOfWings, boolean extinct) {
    this(birdName, noOfWings, extinct,
        new ArrayList<Characteristics>(Arrays.asList(Characteristics.SHARP_HOOKED, Characteristics.VISIBLE_NOSTRILS)),
        new ArrayList<Foods>(Arrays.asList(Foods.SMALL_MAMMALS)), 10);
  }
}
