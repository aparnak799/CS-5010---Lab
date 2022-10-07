package birds;

import java.util.ArrayList;
import java.util.Arrays;

public class Parrot extends Bird{
    public Parrot(String birdName, int noOfWings, boolean extinct, ArrayList<Characteristics> characteristics, ArrayList<Foods> preferredFoods, int foodRequired, ArrayList<String> vocabulary, String favoritePhrase) {
        super(Birds.PARROT, birdName, noOfWings, extinct, characteristics, preferredFoods, foodRequired);
        this.vocabulary = vocabulary;
        this.favoritePhrase = favoritePhrase;
    }

    public Parrot(String birdName, int noOfWings, boolean extinct, ArrayList<String> vocabulary, String favoritePhrase) {
        this(birdName, noOfWings, extinct, new ArrayList<Characteristics>(Arrays.asList(Characteristics.SHORT_CURVED, Characteristics.INTELLIGENCE, Characteristics.MIMICRY)), new ArrayList<Foods>(Arrays.asList(Foods.FRUIT, Foods.INSECT, Foods.NUTS)), 2, vocabulary, favoritePhrase);
    }

    private ArrayList<String> vocabulary;

    private String favoritePhrase;

    public ArrayList<String> getVocabulary() {
        return vocabulary;
    }

    public void setVocabulary(ArrayList<String> vocabulary) {
        this.vocabulary = vocabulary;
    }

    public String getFavoritePhrase() {
        return favoritePhrase;
    }

    public void setFavoritePhrase(String favoritePhrase) {
        this.favoritePhrase = favoritePhrase;
    }

    @Override
    public String toString(){
        return String.format("Bird(id=%s, type=%s, name=%s, noOfWings=%s, isExtinct=%s, preferredFoods=%s, characteristics=%s, vocabulary=%s, favouritePhrase=%s)", getBirdId(), getBirdType(), getBirdName(), getNoOfWings(), isExtinct(), getPreferredFoods(), getCharacteristics(), getVocabulary(), getFavoritePhrase());
    }

}
