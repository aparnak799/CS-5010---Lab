package birds;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Class to represent Conservatory as mentioned in the Problem Statement
 */
public class Conservatory {

    private static int count = 0;
    private int conservatoryId;
    private int aviaryCount;

    private ArrayList<Aviary> aviaries = new ArrayList<Aviary>(); // TODO: add test to check size

    /**
     * Constructor for creating a Conservatory
     * Currently creates 20 aviaries in different locations
     */
    public Conservatory() {
        this.conservatoryId = ++count;
        this.aviaryCount = 0;

        for (int i = 0; i < 5; i++){
            aviaries.add(new Aviary("Los Angeles"));
            aviaries.add(new Aviary("San Diego"));
            aviaries.add(new Aviary("San Marcos"));
            aviaries.add(new Aviary("Santa Cruz"));
            aviaries.add(new Aviary("Las Vegas"));
        }
    }

    /**
     *
     * @return list of all aviaries
     */
    public ArrayList<Aviary> getAviaries() {
        return aviaries;
    }

    /**
     *
     * @return the food required by all the birds in the conservatory
     */
    public int calculateFoodRequired() {
        int foodRequired = 0;
        for (Aviary a: getAviaries()){
            if(a.getBirdPopulation() > 0){
                for (Bird b: a.getBirds()) {
                    foodRequired += b.getFoodRequired();
                }
            }
        }
        return foodRequired;
    }

    /**
     * "Rescue" and add a bird to any one of the aviaries
     * @param bird
     */
    public void rescueBird(Bird bird) {
        if(bird.isExtinct()) throw new IllegalArgumentException("Bird cannot be extinct");
        int i = 0;
        boolean successfullyRescued = false;
        while (i < 20) {
           if(aviaries.get(i).insertBird(bird)) {
               successfullyRescued = true;
               break;
           }
           i+=1;
        }
        if(!successfullyRescued) throw new IllegalStateException("All aviaries are at capacity");
    }

    /**
     * Adds aviary to conservatory
     * @param aviary
     */
    public void addAviary(Aviary aviary) {
        if(aviaries.size() >= 20) throw new IllegalStateException("Each Conservatory can only have upto 20 Aviaries");
        this.aviaries.add(aviary);
        this.aviaryCount += 1;
    }

    /**
     * Removes aviary from conservatory
     * @param idx
     */
    public void removeAviary(int idx) {
        if(aviaries.size() == 0) throw new IllegalStateException("A Conservatory has to have atleast one aviary to remove");
        aviaries.remove(idx);
        this.aviaryCount -= 1;
    }

    /**
     * @return a map of all the Aviaries by location and all the birds inside the aviary
     */
    public String printMap() {
       String map = "";
       for (Aviary a: aviaries) {
           if(a.getBirdPopulation() > 0) {
               map += String.format("Location: %s\n", a.getLocation());
               for (Bird b : a.getBirds()) {
                   map += String.format("\t%s\n", b.toString());
               }
           }
       }
       return map;
    }


    /**
     * method to return which aviary a specific bird is in
     * @param birdName
     * @return Aviary in which bird is in
     */
    public Aviary lookUpBirdInAviary(String birdName) {
        for(Aviary a: aviaries) {
             if(a.getBirdPopulation() > 0 ){
                for (Bird b: a.getBirds()){
                    if(b.getBirdName() == birdName) return a;
                }
            }
        }
        return null;
    }

    /**
     * @return an index of Birds sorted in alphabetical order (by names)  and also lists location along with it
     */
    public String printIndex() {
        ArrayList<BirdLocPair> allBirds = new ArrayList<BirdLocPair>();
        for (Aviary a: aviaries){
            if(a.getBirdPopulation() > 0 ){
                for (Bird b: a.getBirds()){
                    allBirds.add(new BirdLocPair(b, a.getLocation()));
                }
            }
        }

        Comparator<BirdLocPair> compareByName = (BirdLocPair b1, BirdLocPair b2) -> b1.getBird().getBirdName().compareTo(b2.getBird().getBirdName());
        Collections.sort(allBirds, compareByName);

        String returnString = "";

        for (BirdLocPair birdLocPair: allBirds) {
            returnString += String.format("Bird Name=%s, Bird Type=%s, Location = %s\n", birdLocPair.getBird().getBirdName(), birdLocPair.getBird().getBirdType(), birdLocPair.getLocation());
        }
        return returnString;
    }

    /**
     *
     * @return no of aviaries in the conservatory
     */
    public int getAviaryCount() {
        return aviaryCount;
    }

    /**
     *
     * increment/decrement the aviaryCount
     * @param aviaryCount
     */
    public void setAviaryCount(int aviaryCount) {
        this.aviaryCount = aviaryCount;
    }

    /**
     *
     * @return id of conservatory
     */
    public int getConservatoryId() {
        return conservatoryId;
    }

    /**
     *
     * Sets the id of the conservatory
     * @param conservatoryId
     */
    public void setConservatoryId(int conservatoryId) {
        this.conservatoryId = conservatoryId;
    }

    @Override
    public String toString(){
        return String.format("Conservatory(id=%s, aviaryCount=%s, aviaries=%s)",getConservatoryId(), getAviaryCount(), getAviaries());
    }
}
