public class Conservatory {

    protected int aviaryCount;
    protected float foodRequired;
    protected Aviary[] aviaries = new Aviary[20]; // TODO: add test to check size
    protected int conservatoryId;

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
        // TODO: check which Aviary "bird" is in
    }

    public int printIndex() {

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
