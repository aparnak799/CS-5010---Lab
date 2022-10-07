package birds;

public class Helper {
    public static Foods findByName(String name) {
        Foods result = null;
        for (Foods foods: Foods.values()) {
            if (foods.name().equalsIgnoreCase(name)) {
                result = foods;
                break;
            }
        }
        return result;
    }
}
