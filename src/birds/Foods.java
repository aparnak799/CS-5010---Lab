package birds;

public enum Foods {
    BERRIES("berries"),
    SEEDS("seeds"),
    FRUIT("fruit"),
    INSECT("insect"),
    OTHER_BIRDS("other birds"),
    SMALL_MAMMALS("small mammals"),
    FISH("fish"),
    BUDS("buds"),
    LARVAE("larvae"),
    AQUATIC_INVERTEBRATES("aquatic invertebrates"),
    NUTS("nuts"),
    VEGETATION("vegetation");

    private final String food;

    Foods(final String food) {
        this.food = food;
    }

    @Override
    public String toString() {
        return food;
    }
}