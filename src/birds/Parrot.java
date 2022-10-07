package birds;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Class Representing the Parrot Classification of Bird
 */
public class Parrot extends Bird{
    private ArrayList<String> vocabulary;

    private String favoritePhrase;

    /**
     * Main Constructor for this class
     *
     * Takes in Vocabulary and favoritePhrase as exra params
     * @param birdName
     * @param noOfWings
     * @param extinct
     * @param characteristics
     * @param preferredFoods
     * @param foodRequired
     * @param vocabulary
     * @param favoritePhrase
     */
    public Parrot(String birdName, int noOfWings, boolean extinct, ArrayList<Characteristics> characteristics, ArrayList<Foods> preferredFoods, int foodRequired, ArrayList<String> vocabulary, String favoritePhrase) {
        super(Birds.PARROT, birdName, noOfWings, extinct, characteristics, preferredFoods, foodRequired);
        this.vocabulary = vocabulary;
        this.favoritePhrase = favoritePhrase;
    }

    /**
     *
     * Constructor for this class
     * Uses default values to prevent redundancy
     *
     * @param birdName
     * @param noOfWings
     * @param extinct
     * @param vocabulary
     * @param favoritePhrase
     */
    public Parrot(String birdName, int noOfWings, boolean extinct, ArrayList<String> vocabulary, String favoritePhrase) {
        this(birdName, noOfWings, extinct, new ArrayList<Characteristics>(Arrays.asList(Characteristics.SHORT_CURVED, Characteristics.INTELLIGENCE, Characteristics.MIMICRY)), new ArrayList<Foods>(Arrays.asList(Foods.FRUIT, Foods.INSECT, Foods.NUTS)), 2, vocabulary, favoritePhrase);
    }


    /**
     *
     * @return parrot's vocabulary
     */
    public ArrayList<String> getVocabulary() {
        return vocabulary;
    }

    /**
     * Sets the parrot's vocabulary
     * @param vocabulary
     */
    public void setVocabulary(ArrayList<String> vocabulary) {
        this.vocabulary = vocabulary;
    }

    /**
     *
     * @return the parrot's favorite phrase
     */
    public String getFavoritePhrase() {
        return favoritePhrase;
    }

    /**
     * sets the parrot's favorite phrase
     * @param favoritePhrase
     */
    public void setFavoritePhrase(String favoritePhrase) {
        if(!vocabulary.contains(favoritePhrase)) throw new IllegalArgumentException("favoritePhrase should exist in vocabulary");
        this.favoritePhrase = favoritePhrase;
    }

    @Override
    public String toString(){
        return String.format("Bird(id=%s, type=%s, name=%s, noOfWings=%s, isExtinct=%s, preferredFoods=%s, characteristics=%s, vocabulary=%s, favouritePhrase=%s)", getBirdId(), getBirdType(), getBirdName(), getNoOfWings(), isExtinct(), getPreferredFoods(), getCharacteristics(), getVocabulary(), getFavoritePhrase());
    }

}
