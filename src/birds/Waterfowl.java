package birds;

import java.util.ArrayList;

public class Waterfowl extends WaterBird {
    public Waterfowl(String birdName, int noOfWings, boolean extinct, int foodRequired, boolean isNearWaterBody, String waterbody) {
        super(Birds.WATERFOWL, birdName, noOfWings, extinct, foodRequired, isNearWaterBody, waterbody);
    }

    public Waterfowl(String birdName, int noOfWings, boolean extinct, boolean isNearWaterBody, String waterbody) {
        this(birdName, noOfWings, extinct,  2, isNearWaterBody, waterbody);
    }



}
