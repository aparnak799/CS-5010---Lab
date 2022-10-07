package birds;

import java.util.ArrayList;

/**
 * Class represents an Aviary as described in the problem statement
 */
public class Aviary {

    private static int count = 0;
    private int aviaryId;
    private int birdPopulation;
    private ArrayList<Bird> birds = new ArrayList<Bird>();
    private String location;

    /**
     * Constructor for Aviary class
     * Takes in location and sets default value to rest of the attributes
     * @param location
     */
    public Aviary(String location) {
        this.aviaryId = ++count;
        this.birdPopulation = 0;
        this.location = location;
    }

    /**
     *
     * @return list of all birds in the aviary
     */
    public ArrayList<Bird> getBirds() {
        return birds;
    }

    /**
     * Increments or decrements the Bird Population Count for this Aviary
     * @param birdPopulation
     */
    public void setBirdPopulation(int birdPopulation) {
        this.birdPopulation = birdPopulation;
    }

    /**
     * Sets a Bird Array to the birds member variable
     * @param birds
     */
    public void setBirds(ArrayList<Bird> birds) {
        this.birds = birds;
    }

    /**
     * Method to take in a bird and insert into Aviary
     * if conditions are not met, returns false
     * else returns true
     * @param bird
     * @return boolean
     */
    public boolean insertBird(Bird bird) {
        if(this.birdPopulation >= 5) return false;
        if(bird.isExtinct()) return false;

        if(this.birdPopulation == 0) {
            this.birds.add(bird);
        }
        else if((bird.getBirdType() == Birds.BIRD_OF_PREY) || (bird.getBirdType() == Birds.FLIGHTLESS_BIRD) || (bird.getBirdType() == Birds.WATERFOWL)) {
            if(this.birds.get(0).getBirdType() == bird.getBirdType()) {
                this.birds.add(bird);
            }
            else return false;
        } else {
           if((this.birds.get(0).getBirdType() != Birds.BIRD_OF_PREY) && (this.birds.get(0).getBirdType() != Birds.FLIGHTLESS_BIRD) && (this.birds.get(0).getBirdType() != Birds.WATERFOWL)) {

              this.birds.add(bird) ;
           }
           else return false;
        }

        setBirdPopulation(birds.size());
        return true;
    }

    /**
     * @return the total number of Birds in the Aviary
     */
    public int getBirdPopulation() {
        return birdPopulation;
    }

    /**
     *
     * @return the unique ID of aviary
     */
    public int getAviaryId() {
        return aviaryId;
    }


    /**
     * @return location of Aviary
     */
    public String getLocation() {
        return location;
    }

    /**
     * Method to set or update the location of an aviary
     * @param location
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     *
     * @return a sign for any given aviary that gives a description of the birds it houses and any interesting information that it may have about that animal.
     */
    public String printAviarySign(){
        String returnString = String.format("Location: %s\n", getLocation());
        if(birdPopulation == 0) return returnString + "There are no birds in this aviary.";
        for (Bird b: birds){
            returnString += b.toString() + '\n';
        }
        return returnString;
    }

    @Override
    public String toString() {
        String returnString = String.format("Aviary(id=%s, location=%s, population=%s, birds=%s)", getAviaryId(), getLocation(), getBirdPopulation(), getBirds());
        return returnString;
    }
}
