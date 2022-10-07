package birds;

import java.util.ArrayList;
import java.util.Arrays;

public class Owl extends Bird {
    public Owl(String birdName, int noOfWings, boolean extinct, ArrayList<Characteristics> characteristics, ArrayList<Foods> preferredFoods, int foodRequired) {
        super(Birds.OWL, birdName, noOfWings, extinct, characteristics, preferredFoods,foodRequired);
    }

    public Owl(String birdName, int noOfWings, boolean extinct) {
        this(birdName, noOfWings, extinct, new ArrayList<Characteristics>(Arrays.asList(Characteristics.FACIAL_DISKS)), new ArrayList<>(Arrays.asList(Foods.INSECT, Foods.SEEDS, Foods.BUDS)),6);
    }

}
