package aboutme;

import java.util.List;

/**
 * Деление на 3 -> fiz
 * Деление на 5 -> buz
 * Деление на 15 -> fizbuz
 *
 */


public class MyWeek {
    static List<String> Workdays = List.of("Monday","Tuesday","Wednesday","Thursday","Friday");
    public static void main(String[] args) {
        String day = "Pie";
        System.out.println(weekAlgorythmShort(day));
    }

    protected String weekAlgorythm(String day) {
        String result = " ";
        if (day == "Monday") {
            result = "GoToSchool";
        } else if (day == "Tuesday") {
            result = "GoToSchool";
        } else if (day == "Wednesday") {
            result = "GoToSchool";
        } else if (day == "Thursday") {
            result = "GoToSchool";
        } else if (day == "Friday") {
            result = "GoToSchool";
        } else {
            result = "StayAtHome";
        }
        return result;
    }

    public static String weekAlgorythmShort(String day) {
        if (day == "Sunday" || day == "Saturaday") {
            return "StayAtHome";
        }

        else if(Workdays.contains(day)){
            return "GoToSchool";
        }

        else{
            return "Error";
        }
    }

}



