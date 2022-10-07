package birds;

/**
 * Emulation of Pair data structure
 * Used to store pairs of bird and appropriate location for each
 */
public class BirdLocPair {
        private final Bird bird;
        private final String location;

    /**
     * Constructor for BirdLocPair
     * @param aBird
     * @param aLocation
     */
    public BirdLocPair(Bird aBird, String aLocation)
        {
            this.bird = aBird;
            this.location = aLocation;
        }

    /**
     *
     * @return the bird from the pair
     */
    public Bird getBird() {
            return bird;
        }

    /**
     *
     * @return location from the pair
     */
    public String getLocation() {
            return location;
        }
}
