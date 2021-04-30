package run;

import aboutme.FoodPreferences;

public class RunFoodPreferences {

    public static void main(String[] args) {
        String event = "birthday";
        System.out.println(FoodPreferences.determineFood(event));
    }
}
