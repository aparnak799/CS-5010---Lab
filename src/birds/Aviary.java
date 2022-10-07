package birds;

import java.util.ArrayList;

public class Aviary {

    private static int count = 0;
    private int aviaryId;
    private int birdPopulation; // this can just be population, not population count
    private String description;
    private ArrayList<Bird> birds = new ArrayList<Bird>(); // TODO: add test to check size
    private String location;

    public Aviary(String location) {
        this.aviaryId = ++count;
        this.birdPopulation = 0;
        this.description = "";
        this.location = location;
    }

    public void insertBird(Bird bird) {
        // TODO: Add "bird" to "birds";
    }
    public int getBirdPopulation() {
        return birdPopulation;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAviaryId() {
        return aviaryId;
    }

    public void setAviaryId(int aviaryId) {
        this.aviaryId = aviaryId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
