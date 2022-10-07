package birds;

import java.util.ArrayList;

public class Aviary {

    private static int count = 0;
    private int aviaryId;
    private int birdPopulation;
    private String description;
    private ArrayList<Bird> birds = new ArrayList<Bird>();

    public ArrayList<Bird> getBirds() {
        return birds;
    }

    private String location;

    public Aviary(String location) {
        this.aviaryId = ++count;
        this.birdPopulation = 0;
        this.description = "";
        this.location = location;
    }

    public void setBirdPopulation(int birdPopulation) {
        this.birdPopulation = birdPopulation;
    }

    public void setBirds(ArrayList<Bird> birds) {
        this.birds = birds;
    }

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
