package birds;

import java.util.ArrayList;
import java.util.Arrays;

public class Pigeon extends Bird {

    public Pigeon(String birdName, int noOfWings, boolean extinct, ArrayList<Characteristics> characteristics, ArrayList<Foods> preferredFoods, int foodRequired, String variety) {
        super(Birds.PIGEON, birdName, noOfWings, extinct, characteristics, preferredFoods, foodRequired);
        this.variety = variety;
    }

    public Pigeon(String birdName, int noOfWings, boolean extinct, String variety) {
        this(birdName, noOfWings, extinct, new ArrayList<Characteristics>(Arrays.asList(Characteristics.MAMMALIAN)), new ArrayList<Foods>(Arrays.asList(Foods.INSECT, Foods.VEGETATION)), 3, variety);
    }

    private String variety;

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    @Override
    public String toString(){
        return String.format("Bird(id=%s, type=%s, name=%s, noOfWings=%s, isExtinct=%s, preferredFoods=%s, characteristics=%s, variety=%s)", getBirdId(), getBirdType(), getBirdName(), getNoOfWings(), isExtinct(), getPreferredFoods(), getCharacteristics(), getVariety());
    }

}

