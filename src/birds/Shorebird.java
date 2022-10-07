package birds;

import java.util.ArrayList;

public class Shorebird extends WaterBird {
    public Shorebird(String birdName, int noOfWings, boolean extinct,  int foodRequired, boolean isNearWaterBody, String waterbody) {
        super(Birds.SHOREBIRD, birdName, noOfWings, extinct, foodRequired, isNearWaterBody, waterbody);
    }

    public Shorebird(String birdName, int noOfWings, boolean extinct, boolean isNearWaterBody, String waterbody) {
        this(birdName, noOfWings, extinct, 2, isNearWaterBody, waterbody);
    }

}
