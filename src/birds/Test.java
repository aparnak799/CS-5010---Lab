package birds;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
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

//        System.out.println(c.lookUpBirdInAviary("Eagle"));
        System.out.println(c.printIndex());
    }

}
