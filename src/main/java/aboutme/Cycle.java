package aboutme;

import exeption.TooMuchOfCO2Exception;
import util.Countries;
import util.DayList;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

import static aboutme.DayOfTheWeek.weekDayLogic;
import static util.Countries.*;

public class Cycle {
    private static final String CLEAN_TEETH = "clean teeth,";
    private static final String WAKE_UP = "wake up, " + CLEAN_TEETH;
    private static final String FALL_ASLEEP = CLEAN_TEETH + " fall asleep.";


    static Map<Countries, Integer> countryCO2Map = new TreeMap<>();

    static {
        countryCO2Map.put(USA, 5334000);
        countryCO2Map.put(KNR, 10540000);
        countryCO2Map.put(EU, 3415000);
        countryCO2Map.put(INDIA, 2341000);
        countryCO2Map.put(RUSSIA, 1766000);
        countryCO2Map.put(JAPAN, 1270000);
        countryCO2Map.put(GERMANY, 767000);
    }

    /*
     * 1) разобраться, что здесь?
     * 2) посчитать сумму все выбрасов
     * 3) проследить, чтоб сумма была в кт
     * 4) вывести сумму
     * 5) понять, почему выпадает ексепщин вместо суммы
     * 6) добавить услоие череp ИЛИ (||), чтоб предотвратить ексепшин и таки вывести сумму
     * */
/*Табл Растрат
            №(0) День недели (1) Грн (2)
            0    Понедельник -      132
            1    Вторник -          34
            2    Среда -            200
            3    Четверн -          30

        Грн
           132
           34
           200
           30
    Грн[0]   + Грн[0] = 132+132*/

    public static void co2Control() {
        int co2Sum = 0;
        int i = 1;
        //10540000 , 5334000...
        Object[] co2 = countryCO2Map.values().toArray();
        while (co2Sum < 30000 || co2Sum < 20000000) {

            // co2[1] + co2[0] + co2[2]
            co2Sum = (int) co2[0] + (int) co2[i];

            i = i + 1;
        }
        System.out.println(co2Sum);
    }

    /*
    0 - 111
    1 - 222
     */

    public static void co2Control1() {
        int co2Sum = 0;
        int i = 0;
        Object[] co2 = countryCO2Map.values().toArray();

        do {
            co2Sum = co2Sum + (int) co2[i];
            System.out.println(i + ". " + co2Sum + " " + co2[i]);
            i = i + 1;
        }
        while (i < co2.length
                && (int) co2[i - 1] != 767000);

        System.out.println(co2Sum / 1000 + " kt");
    }


    public static void main(String[] args) {
        sumUntil();
    }


    public static void englishLessons() {

        int number = 1;
        for (int dayNumber = 0; dayNumber <= 4; dayNumber = dayNumber + 2) {
            DayList day = DayList.values()[dayNumber];


            String lessonTime = " с 18 до 19 уроки";

            if (day == DayList.WEDNESDAY) {
                lessonTime = " с 20 до 21 уроки ";
            }
            System.out.println(++number + " в " + day + lessonTime);
        }
    }

    public static void weekLogic() {
        for (DayList day : DayList.values()) {
            //MONDAY: I wake up, clean teeth, do smth, clean teeth, fall asleep.
            //TUESDAY: I wake up, clean teeth, do smth, clean teeth, fall asleep.
            //...
            System.out.println(day + ": " + WAKE_UP + weekDayLogic.get(day) + ", " + FALL_ASLEEP);
        }
    }

    private static void co2() {
        for (Map.Entry<Countries, Integer> entry : countryCO2Map.entrySet()) {

            int kt = (entry.getValue()) / 1000;

            System.out.println(entry.getKey() + " - " + kt + "kt");
        }
    }

    public static void rhyme() {
        for (int iterator = 2; iterator <= 9; iterator = iterator + 1) {
            String result;

            if (iterator % 2 != 0) {
                result = "дайте до пары чтобы не съели татары";
            } else {
                switch (iterator) {
                    case (2) -> result = "Бог любит троицу";
                    case (4) -> result = "дайте пять чтобы учиться на 5";
                    default -> {
                        int nextNumber = iterator + 1;
                        result = "а " + nextNumber + " число полноты";
                    }
                }
            }
            System.out.println(iterator + " - " + result);
        }


    }

    public static void sumUntil() {
        Iterator<Map.Entry<Countries, Integer>> iterator = countryCO2Map.entrySet().iterator();
        int co2Sum = 0;
        while (iterator.hasNext() || co2Sum < 20000000) {
            Map.Entry<Countries, Integer> next = iterator.next();
            if(co2Sum + next.getValue() > 20000000){
                co2Sum = co2Sum + next.getValue();
              /*  usa KNR =)
                U K =) U> M? =) KNR

               */
                System.out.println((next.getKey().toString().substring(0, 1).compareTo("M")));
              //  throw new TooMuchOfCO2Exception(next.getKey(), co2Sum - next.getValue());
            }
        }
        System.out.println(co2Sum / 1000 + "kt");
    }
    //итератор от енама Стран и вывести те, которые начинаются на буквы, стоящие перед М
    /*
    1
    2
    3
    4

    while (co2Sum<=20k && i < co2.length)
    ?
    if(co2Sum>20k)



     */





}


