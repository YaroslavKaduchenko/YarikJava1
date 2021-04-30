package algorytm;

public  class BooleanExamples {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c = a && b;

        /*
        a | b | a||b
        f | f | f
        f | t | t
        t | f | t
        t | t | t

        a | b | a&&b
        f | f | f
        f | t | f
        t | f | f
        t | t | t
         */

        System.out.println(c);
    }
}
