public class Aviary {

    protected int birdPopulation; // this can just be population, not population count
    protected String description;
    protected Bird[] birds = new Bird[5]; // TODO: add test to check size
    protected int aviaryId;
    protected String location;

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
