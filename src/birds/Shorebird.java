package birds;

import java.util.ArrayList;

/**
 * Claas Representing ShoreBird
 */
public class Shorebird extends WaterBird {
    /**
     * Main Constructor for this class
     * @param birdName
     * @param noOfWings
     * @param extinct
     * @param foodRequired
     * @param isNearWaterBody
     * @param waterbody
     */
    public Shorebird(String birdName, int noOfWings, boolean extinct,  int foodRequired, boolean isNearWaterBody, String waterbody) {
        super(Birds.SHOREBIRD, birdName, noOfWings, extinct, foodRequired, isNearWaterBody, waterbody);
    }

    /**
     * Constructor for this class
     * Uses default values to prevent redundancy
     * @param birdName
     * @param noOfWings
     * @param extinct
     * @param isNearWaterBody
     * @param waterbody
     */
    public Shorebird(String birdName, int noOfWings, boolean extinct, boolean isNearWaterBody, String waterbody) {
        this(birdName, noOfWings, extinct, 2, isNearWaterBody, waterbody);
    }

}
