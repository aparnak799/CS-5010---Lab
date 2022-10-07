package birds;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Conservatory {

    private static int count = 0;
    private int conservatoryId;
    private int aviaryCount;
    public ArrayList<Aviary> getAviaries() {
        return aviaries;
    }

    private ArrayList<Aviary> aviaries = new ArrayList<Aviary>(); // TODO: add test to check size

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

    public void addAviary(Aviary aviary) {
        if(aviaries.size() >= 20) throw new IllegalStateException("Each Conservatory can only have upto 20 Aviaries");
        this.aviaries.add(aviary);
        this.aviaryCount += 1;
    }

    public void removeAviary(int idx) {
        if(aviaries.size() == 0) throw new IllegalStateException("A Conservatory has to have atleast one aviary to remove");
        aviaries.remove(idx);
        this.aviaryCount -= 1;
    }

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

    public int getAviaryCount() {
        return aviaryCount;
    }

    public void setAviaryCount(int aviaryCount) {
        this.aviaryCount = aviaryCount;
    }

    public int getConservatoryId() {
        return conservatoryId;
    }

    public void setConservatoryId(int conservatoryId) {
        this.conservatoryId = conservatoryId;
    }

    @Override
    public String toString(){
        return String.format("Conservatory(id=%s, aviaryCount=%s, aviaries=%s)",getConservatoryId(), getAviaryCount(), getAviaries());
    }
}
