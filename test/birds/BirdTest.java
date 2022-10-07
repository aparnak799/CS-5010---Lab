package birds;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class BirdTest {

    @Test
    public void testBirdOfPreyType(){
        Bird eagle = new BirdOfPrey("Eagle", 2, false);
        assertEquals(true, eagle instanceof Bird);
    }

    @Test
    public void testOwlBirdType(){
        Bird owl = new Owl("Owl", 2, false);
        assertEquals(true, owl instanceof Bird);
    }

    @Test
    public void testParrotBirdType(){
        Bird parrot = new Parrot("Parrot", 2, false, new ArrayList<String>(Arrays.asList("Hi", "Bro", "Banana")), "Bro");
        assertEquals(true, parrot instanceof Bird);
    }


    @Test
    public void testFlightlessBirdType(){
        Bird chicken = new FlightlessBird("chicken", 2, false);
        assertEquals(true, chicken instanceof Bird);
    }

    @Test
    public void testWaterFowlBirdType(){
        Bird waterfowl = new Waterfowl("waterfowl", 1, false,  "Salt Lake");
        assertEquals(true, waterfowl instanceof Bird);
    }

    @Test
    public void testShoreBirdBirdType(){
        Bird shorebird = new Shorebird("Shorebird", 1, false,  "Salt Lake");
        assertEquals(true, shorebird instanceof Bird);
    }


    @Test
    public void testPigeonBirdType() {
        Bird pigeon = new Pigeon("Pigeon", 2,false, "Spotted");
        assertEquals(true, pigeon instanceof Bird);
    }

    @Test
    public void testParrotVocabList(){
        Bird parrot = new Parrot("Parrot", 2, false, new ArrayList<String>(Arrays.asList("Hi", "Bro", "Banana")), "Bro");
        assertEquals(new ArrayList<String>(Arrays.asList("Hi", "Bro", "Banana")), ((Parrot) parrot).getVocabulary());

    }

    @Test
    public void testParrotFavoritePhrase() {
        Bird parrot = new Parrot("Parrot", 2, false, new ArrayList<String>(Arrays.asList("Hi", "Bro", "Banana")), "Bro");
        assertEquals("Bro", ((Parrot) parrot).getFavoritePhrase());
    }

    @Test
    public void parrotShouldThrowIllegalArgumentWhenFavoriteWordIsNotInDictionary() {
        assertThrows(IllegalArgumentException.class, () -> {
        Bird parrot = new Parrot("Parrot", 2, false, new ArrayList<String>(Arrays.asList("Hi", "Bro", "Banana")), "Apple");
        });
    }


    @Test
    public void testPigeonBirdVarietyAttribute() {
        Bird pigeon = new Pigeon("Pigeon", 2,false, "Spotted");
        assertEquals("Spotted", ((Pigeon) pigeon).getVariety());
    }

    @Test
    public void testWaterFowlBirdIsNearWaterBodyEvaluation(){
        Bird waterfowl = new Waterfowl("waterfowl", 1, false,  "Salt Lake");
        assertEquals(true, ((Waterfowl) waterfowl).isNearWaterBody());
    }

    @Test
    public void testShoreBirdIsNearWaterBodyEvaluation(){
        Bird shorebird = new Shorebird("shorebird", 1, false,  "Salt Lake");
        assertEquals(true, ((Shorebird) shorebird).isNearWaterBody());
    }

    @Test
    public void testWaterFowlBirdWaterBodyEvaluation(){
        Bird waterfowl = new Waterfowl("waterfowl", 1, false,  "Salt Lake");
        assertEquals("Salt Lake", ((Waterfowl) waterfowl).getWaterbody());
    }

    @Test
    public void testShoreBirdWaterBodyEvaluation(){
        Bird shorebird = new Shorebird("shorebird", 1, false,  "Donner Lake");
        assertEquals("Donner Lake", ((Shorebird) shorebird).getWaterbody());
    }

    @Test
    public void testIfPreferredFoodContentIsAPartOfFoodsEnums() {
        Bird eagle = new BirdOfPrey("Eagle", 2, false);
        assertEquals(true, Arrays.asList(Foods.values()).contains(eagle.getPreferredFoods().get(0)));
    }

    @Test
    public void shouldThrowIllegalArgumentExceptionWhenExtinctBirdIsRescued() {
        Conservatory conservatory = new Conservatory();
        Bird blueEagle = new BirdOfPrey("Blue Eagle", 2, true);

        assertThrows(
                IllegalArgumentException.class, () -> {
                    conservatory.rescueBird(blueEagle);
                }
        );

    }

    @Test
    public void shouldNotAddMoreThanFiveBirdsToAnAviary() {
        Conservatory conservatory = new Conservatory();
        Bird eagle1 = new BirdOfPrey("Eagle", 2, false);
        Bird eagle2 = new BirdOfPrey("Eagle", 2, false);
        Bird eagle3 = new BirdOfPrey("Eagle", 2, false);
        Bird eagle4 = new BirdOfPrey("Eagle", 2, false);
        Bird eagle5 = new BirdOfPrey("Eagle", 2, false);
        Bird eagle6 = new BirdOfPrey("Eagle", 2, false);

        conservatory.rescueBird(eagle1);
        conservatory.rescueBird(eagle2);
        conservatory.rescueBird(eagle3);
        conservatory.rescueBird(eagle4);
        conservatory.rescueBird(eagle5);
        conservatory.rescueBird(eagle6);

        assertEquals(5, conservatory.getAviaries().get(0).getBirds().size());
    }

    @Test
    public void shouldNotAddMoreThanTwentyAviariesToAConservatory() {
        Conservatory conservatory = new Conservatory();
        Aviary aviary1 = new Aviary("NC");
        assertThrows(IllegalStateException.class, () -> {
            conservatory.addAviary(aviary1);
        });
    }

    @Test
    public void cannotMixSomeTypesWithOthers() {
        Conservatory conservatory = new Conservatory();

        Bird eagle1 = new BirdOfPrey("Eagle", 2, false);
        Bird eagle2 = new BirdOfPrey("Eagle", 2, false);
        Bird eagle3 = new BirdOfPrey("Eagle", 2, false);

        conservatory.rescueBird(eagle1);
        conservatory.rescueBird(eagle2);
        conservatory.rescueBird(eagle3);

        Bird parrot = new Parrot("Parrot", 2, false, new ArrayList<String>(Arrays.asList("Hi", "Bro", "Banana")), "Bro");

        conservatory.rescueBird(parrot);

        assertEquals(3, conservatory.getAviaries().get(0).getBirds().size());

    }

    @Test
    public void isAviarySignValid() {
        Conservatory c = new Conservatory();

        Bird eagle = new BirdOfPrey("Eagle", 2, false);
        Bird eagle1 = new BirdOfPrey("Eagle", 2, false);
        Bird parrot = new Parrot("Titli", 2, false, new ArrayList<>(Arrays.asList("Hello", "Bro")),"Bro");
        Bird parrot1 = new Parrot("Titli1", 2, false, new ArrayList<>(Arrays.asList("Hello", "Bro")),"Bro");
        Bird shoreBird = new Shorebird("Gurren", 0, false,  "Salt lake");

        c.rescueBird(parrot1);
        c.rescueBird(parrot);
        c.rescueBird(eagle);
        c.rescueBird(eagle1);
        c.rescueBird(shoreBird);
        assertEquals("""
Location: Los Angeles
Bird(id=4, type=PARROT, name=Titli1, noOfWings=2, isExtinct=false, preferredFoods=[fruit, insect, nuts], characteristics=[short, curved beak, intelligence, mimicry], vocabulary=[Hello, Bro], favouritePhrase=Bro)
Bird(id=3, type=PARROT, name=Titli, noOfWings=2, isExtinct=false, preferredFoods=[fruit, insect, nuts], characteristics=[short, curved beak, intelligence, mimicry], vocabulary=[Hello, Bro], favouritePhrase=Bro)
Bird(id=5, type=SHOREBIRD, name=Gurren, noOfWings=0, isExtinct=false, preferredFoods=[fish, aquatic invertebrates], characteristics=[live near water], isNearWaterbody=true, waterbody=Salt lake)
                """, c.getAviaries().get(0).printAviarySign());
    }

    @Test
    public void isMapValid() {
        Conservatory c = new Conservatory();

        Bird eagle = new BirdOfPrey("Eagle", 2, false);
        Bird eagle1 = new BirdOfPrey("Eagle", 2, false);
        Bird parrot = new Parrot("Titli", 2, false, new ArrayList<>(Arrays.asList("Hello", "Bro")),"Bro");
        Bird parrot1 = new Parrot("Titli1", 2, false, new ArrayList<>(Arrays.asList("Hello", "Bro")),"Bro");
        Bird shoreBird = new Shorebird("Gurren", 0, false,  "Salt lake");

        c.rescueBird(parrot1);
        c.rescueBird(parrot);
        c.rescueBird(eagle);
        c.rescueBird(eagle1);
        c.rescueBird(shoreBird);

        assertEquals("""
                Location: Los Angeles
                	Bird(id=4, type=PARROT, name=Titli1, noOfWings=2, isExtinct=false, preferredFoods=[fruit, insect, nuts], characteristics=[short, curved beak, intelligence, mimicry], vocabulary=[Hello, Bro], favouritePhrase=Bro)
                	Bird(id=3, type=PARROT, name=Titli, noOfWings=2, isExtinct=false, preferredFoods=[fruit, insect, nuts], characteristics=[short, curved beak, intelligence, mimicry], vocabulary=[Hello, Bro], favouritePhrase=Bro)
                	Bird(id=5, type=SHOREBIRD, name=Gurren, noOfWings=0, isExtinct=false, preferredFoods=[fish, aquatic invertebrates], characteristics=[live near water], isNearWaterbody=true, waterbody=Salt lake)
                Location: San Diego
                	Bird(id=1, type=BIRD_OF_PREY, name=Eagle, noOfWings=2, isExtinct=false, preferredFoods=[small mammals], characteristics=[sharp, hooked beaks, visible nostrils])
                	Bird(id=2, type=BIRD_OF_PREY, name=Eagle, noOfWings=2, isExtinct=false, preferredFoods=[small mammals], characteristics=[sharp, hooked beaks, visible nostrils])
                """, c.printMap());

    }

    @Test
    public void isIndexValid() {
        Conservatory c = new Conservatory();

        Bird eagle = new BirdOfPrey("Eagle", 2, false);
        Bird eagle1 = new BirdOfPrey("Eagle", 2, false);
        Bird parrot = new Parrot("Titli", 2, false, new ArrayList<>(Arrays.asList("Hello", "Bro")),"Bro");
        Bird parrot1 = new Parrot("Titli1", 2, false, new ArrayList<>(Arrays.asList("Hello", "Bro")),"Bro");
        Bird shoreBird = new Shorebird("Gurren", 0, false,  "Salt lake");

        c.rescueBird(parrot1);
        c.rescueBird(parrot);
        c.rescueBird(eagle);
        c.rescueBird(eagle1);
        c.rescueBird(shoreBird);

        assertEquals("""
                Bird Name=Eagle, Bird Type=BIRD_OF_PREY, Location = San Diego
                Bird Name=Eagle, Bird Type=BIRD_OF_PREY, Location = San Diego
                Bird Name=Gurren, Bird Type=SHOREBIRD, Location = Los Angeles
                Bird Name=Titli, Bird Type=PARROT, Location = Los Angeles
                Bird Name=Titli1, Bird Type=PARROT, Location = Los Angeles
                """, c.printIndex());

    }

    @Test
    public void isLookUpValid() {
        Conservatory c = new Conservatory();

        Bird eagle = new BirdOfPrey("Eagle", 2, false);
        Bird eagle1 = new BirdOfPrey("Eagle", 2, false);
        Bird parrot = new Parrot("Titli", 2, false, new ArrayList<>(Arrays.asList("Hello", "Bro")),"Bro");
        Bird parrot1 = new Parrot("Titli1", 2, false, new ArrayList<>(Arrays.asList("Hello", "Bro")),"Bro");
        Bird shoreBird = new Shorebird("Gurren", 0, false,  "Salt lake");

        c.rescueBird(parrot1);
        c.rescueBird(parrot);
        c.rescueBird(eagle);
        c.rescueBird(eagle1);
        c.rescueBird(shoreBird);

        assertEquals(c.getAviaries().get(1), c.lookUpBirdInAviary("Eagle"));
    }

    @Test
    public void calculateFoodRequiredByConservatory() {
        Conservatory c = new Conservatory();

        Bird eagle = new BirdOfPrey("Eagle", 2, false);
        Bird eagle1 = new BirdOfPrey("Eagle", 2, false);
        Bird parrot = new Parrot("Titli", 2, false, new ArrayList<>(Arrays.asList("Hello", "Bro")),"Bro");
        Bird parrot1 = new Parrot("Titli1", 2, false, new ArrayList<>(Arrays.asList("Hello", "Bro")),"Bro");
        Bird shoreBird = new Shorebird("Gurren", 0, false,  "Salt lake");

        c.rescueBird(parrot1);
        c.rescueBird(parrot);
        c.rescueBird(eagle);
        c.rescueBird(eagle1);
        c.rescueBird(shoreBird);

        assertEquals(26, c.calculateFoodRequired());
    }

    @Test
    public void throwExceptionIfAllAviariesAreFull() {
        Conservatory c = new Conservatory();
        for(int  i=0; i<100; i++) {
            Bird eagle = new BirdOfPrey("Eagle", 2, false);
            c.rescueBird(eagle);
        }

       Bird baldEagle = new BirdOfPrey("Eagle", 2, false);

        assertThrows(IllegalStateException.class, () -> {
            c.rescueBird(baldEagle);
        });
    }


}