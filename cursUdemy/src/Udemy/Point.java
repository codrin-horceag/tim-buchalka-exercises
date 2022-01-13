package Udemy;

public class Point {

    public static void main(String[] args) {
        Point point = new Point(2,-2);
        System.out.println(point.distance());
    }
    private int x;
    private int y;

    public Point(){

    }

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(){
        return Math.sqrt((0 - this.x) * (0 - this.x) + (0 - this.y) * (0 - this.x));
    }

    public double distance(int x, int y){
        return (double) Math.sqrt((x - this.x) * (x - this.x) + (x - this.y) * (x - this.x));
    }

    public double distance(Point point){
        return (double) Math.sqrt((point.x - this.x) * (point.x - this.x) + (point.y - this.y) * (point.y - this.x));
    }
}
