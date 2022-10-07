package birds;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class BirdTest {

    @Test
    public void test() {
        Conservatory c = new Conservatory();

        Bird eagle = new BirdOfPrey("Eagle", 2, false);
        Bird eagle1 = new BirdOfPrey("Eagle", 2, false);
        Bird parrot = new Parrot("Titli", 2, false, new ArrayList<>(Arrays.asList("Hello", "Bro")),"Bro");

        c.rescueBird(eagle);
        c.rescueBird(eagle1);
        c.rescueBird(eagle1);
        c.rescueBird(eagle1);
        c.rescueBird(eagle1);
        c.rescueBird(eagle1);
        c.rescueBird(parrot);

        assertEquals(1, c.getAviaries().get(1).getBirdPopulation());
    }

//    @Test
//    public void testIncrementingBirdIds(){
//        ArrayList<String> characteristics = new ArrayList<String>();
//        characteristics.add("Sharp Beak");
//        characteristics.add("Predator");
//        ArrayList<Foods> preferredFoods = new ArrayList<Foods>();
//        preferredFoods.add(Foods.FISH);
//        preferredFoods.add(Foods.BERRIES);
//        Bird eagle = new BirdOfPrey("Eagle", 100, false, characteristics,  preferredFoods);
//        Bird eagle2 = new BirdOfPrey("Eagle", 100, false, characteristics,  preferredFoods);
//        Bird parrot = new Parrot("Parrot", 213, false, characteristics, preferredFoods, new ArrayList<String>(Arrays.asList("Hello","No")), "BRO" );
//        assertEquals("DF", eagle);
//    }

//    @Test
//    public void testParrotObj() {
//        ArrayList<String> characteristics = new ArrayList<String>();
//        characteristics.add("Sharp Beak");
//        characteristics.add("Predator");
//        ArrayList<Foods> preferredFoods = new ArrayList<Foods>();
//        preferredFoods.add(Foods.FISH);
//        preferredFoods.add(Foods.BERRIES);
//        Bird parrot = new Parrot(Birds.PARROT, "Titli", 2, false, characteristics, preferredFoods, new ArrayList<String>(Arrays.asList("Bro", "No")), "Bro");
////        assertEquals("Bro", ((Parrot) parrot).getFavoritePhrase());
//        ArrayList<Bird> b = new ArrayList<Bird>();
//        b.add(parrot);
//        assertEquals("21", parrot.toString());
//
//    }

//    @Test
//    public void testFoodRequiredForBird(){
//        ArrayList<String> characteristics = new ArrayList<String>();
//        characteristics.add("Sharp Beak");
//        characteristics.add("Predator");
//        ArrayList<Foods> preferredFoods = new ArrayList<Foods>();
//        preferredFoods.add(Foods.FISH);
//        preferredFoods.add(Foods.BERRIES);
//        Bird eagle = new BirdOfPrey(Birds.BIRD_OF_PREY, "Eagle", 100, false, characteristics,  preferredFoods);
//        Bird eagle2 = new FlightlessBird(Birds.BIRD_OF_PREY, "Eagle", 100, false, characteristics,  preferredFoods);
//        assertEquals(7, eagle2.getFoodRequired());
//    }

}