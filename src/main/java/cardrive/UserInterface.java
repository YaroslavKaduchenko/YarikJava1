package cardrive;

public class UserInterface {
    public static void main(String[] args) {
        Point start = new Point(5, 3);
        Point finish = new Point(7, 9);
        System.out.println("вы хотите добраться из точки " + start.toString() + " в точку " + finish);
    }
}
