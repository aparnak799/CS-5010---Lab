package birds;

/**
 * Enum to handle all types of characteristics
 */
public enum Characteristics {
    SHARP_HOOKED("sharp, hooked beaks"),
    VISIBLE_NOSTRILS("visible nostrils"),
    LIVE_ON_GROUND("live on ground"),
    NO_WINGS("no wings"),
    UNDER_WINGS("underdeveloped wings"),
    FACIAL_DISKS("facial disks"),
    SHORT_CURVED("short, curved beak"),
    INTELLIGENCE("intelligence"),
    MIMICRY("mimicry"),
    MAMMALIAN("mammalian feeding"),
    LIVE_NEAR_WATER("live near water");

    private final String characteristics;

    Characteristics(final String characteristics) {
        this.characteristics = characteristics;
    }

    @Override
    public String toString() {
        return characteristics;
    }
}
