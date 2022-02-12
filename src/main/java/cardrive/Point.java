package cardrive;

public class Point {
    int x;
    int y;
    public Point(int myX, int myY){
        this.x = myX;
        this.y = myY;
    }
    @Override
    public String toString(){
        return "(" + this.x + "," + " " + this.y + ")";
    }

}
