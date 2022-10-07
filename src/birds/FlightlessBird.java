package birds;

import java.util.ArrayList;
import java.util.Arrays;

public class FlightlessBird extends Bird {
  public FlightlessBird(String birdName, int noOfWings, boolean extinct, ArrayList<Characteristics> characteristics,
      ArrayList<Foods> preferredFoods, int foodRequired) {
    super(Birds.FLIGHTLESS_BIRD, birdName, noOfWings, extinct, characteristics, preferredFoods, foodRequired);
  }

  public FlightlessBird(String birdName, int noOfWings, boolean extinct) {
    this(birdName, noOfWings, extinct,
        new ArrayList<Characteristics>(
            Arrays.asList(Characteristics.LIVE_ON_GROUND, Characteristics.NO_WINGS, Characteristics.UNDER_WINGS)),
        new ArrayList<Foods> (Arrays.asList(Foods.BERRIES, Foods.SEEDS, Foods.FRUIT, Foods.INSECT, Foods.LARVAE,
            Foods.NUTS, Foods.VEGETATION)),
        7);
  }

}
