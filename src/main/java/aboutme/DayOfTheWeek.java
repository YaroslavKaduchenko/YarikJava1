package aboutme;

import util.DayList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import static util.DayList.*;

public class DayOfTheWeek {
    static Map<DayList,String> weekDayLogic =new HashMap<>();
    static {
        weekDayLogic.put(MONDAY,"пораньше идти спать");
        weekDayLogic.put(TUESDAY,"смореть фильм");
        weekDayLogic.put(WEDNESDAY,"теннис");
        weekDayLogic.put(THURSDAY,"готовить ужин");
        weekDayLogic.put(FRIDAY,"идти в гости");
        weekDayLogic.put(SATURDAY,"смотреть фильм");
        weekDayLogic.put(SUNDAY,"делать дз");
    }

    public static void main(String args[]){
        System.out.println(weekDayLogic.get(MONDAY));
    }
    static List<String>
            workdays = List.of("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Workday"),
            weekends = List.of("Saturday", "Sunday", "Weekend");

    public static String determineDay(String weekDay) {
        String dayType;
        if (workdays.contains(weekDay)) {
            dayType = "Workdays";
        } else if (weekends.contains(weekDay)) {
            dayType = "Weekend";
        } else {
            throw new RuntimeException("Wrong weekday");
        }
        String result = "take a rest";
        switch (dayType) {
            case "Workdays":
                result = "Have lessons";
                break;
            case "Weekend":
                result = "Do homework";
                break;
        }
        return result;
    }
}
