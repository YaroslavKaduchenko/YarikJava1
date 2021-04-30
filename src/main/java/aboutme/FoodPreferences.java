package aboutme;

public class FoodPreferences {


   public static String determineFood(String event) {
        String result = "sandwich";
        switch (event) {
            case "birthday" :
                result = "cake";
                break;
            case "date" :
                result = "cookie";
                break;
        }
        return result;
    }
}