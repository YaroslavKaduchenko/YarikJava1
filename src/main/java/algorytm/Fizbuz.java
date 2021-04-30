package algorytm;

public class Fizbuz {

    public static final String FIZ = "fiz";
    public static final String BUZ = "buz";
    public static final String FIZBUZ = FIZ + BUZ;



    public static String fizbuzAlgorithm(int number){
        String result;
        if(number % 15 == 0){
            result = FIZBUZ;
        }

        else if(number % 3 == 0){
            result = FIZ;
        }

        else if(number % 5 == 0){
            result = BUZ;
        }
        else{
            result = "";
        }
        return result;
    }
    public static String fizbuzAlgorithmOptimal(int number){
        String result = "";
        if(number % 3 == 0){
            result = FIZ;
        }
        if(number % 5 == 0){
            result = result + BUZ;
        }
        return result;
    }
}
