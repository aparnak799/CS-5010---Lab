package birds;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Abstract class to represent birds that need an aquatic habitat
 */
public abstract class WaterBird extends Bird{

    protected boolean isNearWaterBody;
    protected String waterbody;
    /**
     * Main constructor for this class
     * @param birdType
     * @param birdName
     * @param noOfWings
     * @param extinct
     * @param foodRequired
     * @param isNearWaterBody
     * @param waterbody
     */
    public WaterBird(Birds birdType, String birdName, int noOfWings, boolean extinct,  int foodRequired, boolean isNearWaterBody, String waterbody) {
        super(birdType, birdName, noOfWings, extinct, new ArrayList<Characteristics>(Arrays.asList(Characteristics.LIVE_NEAR_WATER)), new ArrayList<Foods>(Arrays.asList(Foods.FISH, Foods.AQUATIC_INVERTEBRATES)), foodRequired);
        this.isNearWaterBody = isNearWaterBody;
        this.waterbody = waterbody;
    }

    /**
     *
     * @return if bird is near water body
     */
    public boolean isNearWaterBody() {
        return isNearWaterBody;
    }

    /**
     * sets the appropriate waterbody associated to bird
     * @param nearWaterBody
     */
    public void setNearWaterBody(boolean nearWaterBody) {
        isNearWaterBody = nearWaterBody;
    }


    /**
     *
     * @returns the name of waterbody associated to the bird
     */
    public String getWaterbody() {
        return waterbody;
    }

    /**
     * Sets waterbody associated with bird
     * @param waterbody
     */
    public void setWaterbody(String waterbody) {
        this.waterbody = waterbody;
    }

    @Override
    public String toString(){
        return String.format("Bird(id=%s, type=%s, name=%s, noOfWings=%s, isExtinct=%s, preferredFoods=%s, characteristics=%s, isNearWaterbody=%s, waterbody=%s)", getBirdId(), getBirdType(), getBirdName(), getNoOfWings(), isExtinct(), getPreferredFoods(), getCharacteristics(), isNearWaterBody(),getWaterbody());
    }

}
