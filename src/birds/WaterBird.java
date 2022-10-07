package birds;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class WaterBird extends Bird{

    public WaterBird(Birds birdType, String birdName, int noOfWings, boolean extinct,  int foodRequired, boolean isNearWaterBody, String waterbody) {
        super(birdType, birdName, noOfWings, extinct, new ArrayList<Characteristics>(Arrays.asList(Characteristics.LIVE_NEAR_WATER)), new ArrayList<Foods>(Arrays.asList(Foods.FISH, Foods.AQUATIC_INVERTEBRATES)), foodRequired);
        this.isNearWaterBody = isNearWaterBody;
        this.waterbody = waterbody;
    }

    public boolean isNearWaterBody() {
        return isNearWaterBody;
    }

    public void setNearWaterBody(boolean nearWaterBody) {
        isNearWaterBody = nearWaterBody;
    }

    protected boolean isNearWaterBody;
    protected String waterbody;

    public String getWaterbody() {
        return waterbody;
    }

    public void setWaterbody(String waterbody) {
        this.waterbody = waterbody;
    }

    @Override
    public String toString(){
        return String.format("Bird(id=%s, type=%s, name=%s, noOfWings=%s, isExtinct=%s, preferredFoods=%s, characteristics=%s, isNearWaterbody=%s, waterbody=%s)", getBirdId(), getBirdType(), getBirdName(), getNoOfWings(), isExtinct(), getPreferredFoods(), getCharacteristics(), isNearWaterBody(),getWaterbody());
    }

}
