package birds;

import java.util.ArrayList;

public class Conservatory {

    private static int count = 0;
    private int aviaryCount;
    private float foodRequired;

    private ArrayList<Aviary> aviaries = new ArrayList<Aviary>(); // TODO: add test to check size
    private int conservatoryId;

    public void calculateFoodRequired() {
        // TODO: calculate value of foodRequired
    }

    public void rescueBird() {
        // TODO: how?
    }

    public void addAviary(Aviary aviary) {
        // TODO: add "aviary" to "aviaries"
    }

    public void removeAviary(Aviary aviary) {
        // TODO: remove "aviary" from "aviaries"
    }

    public Aviary lookUpBirdInAviary(Bird bird) {
        // TODO: check which birds.Aviary "bird" is in
        return new Aviary("Behjnd my house");
    }

    public int printIndex() {
return 0;
    }

    // TODO: sign, map functions
    public int getAviaryCount() {
        return aviaryCount;
    }

    public void setAviaryCount(int aviaryCount) {
        this.aviaryCount = aviaryCount;
    }

    public float getFoodRequired() {
        return foodRequired;
    }

    public void setFoodRequired(float foodRequired) {
        this.foodRequired = foodRequired;
    }

    public int getConservatoryId() {
        return conservatoryId;
    }

    public void setConservatoryId(int conservatoryId) {
        this.conservatoryId = conservatoryId;
    }
}
