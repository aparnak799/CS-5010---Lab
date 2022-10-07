package birds;

import java.util.ArrayList;

/**
 * Class representing Birds of Type Waterfowl
 */
public class Waterfowl extends WaterBird {
    /**
     * Main Constructor for this class
     * @param birdName
     * @param noOfWings
     * @param extinct
     * @param foodRequired
     * @param isNearWaterBody
     * @param waterbody
     */
    public Waterfowl(String birdName, int noOfWings, boolean extinct, int foodRequired, boolean isNearWaterBody, String waterbody) {
        super(Birds.WATERFOWL, birdName, noOfWings, extinct, foodRequired, isNearWaterBody, waterbody);
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
    public Waterfowl(String birdName, int noOfWings, boolean extinct, boolean isNearWaterBody, String waterbody) {
        this(birdName, noOfWings, extinct,  2, isNearWaterBody, waterbody);
    }



}
