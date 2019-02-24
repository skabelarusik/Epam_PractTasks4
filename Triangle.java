package PractTasks5;

import java.util.Objects;

public class Triangle {
    public static void main(String[] args) {
        System.out.println(CheckTriangle.isTriangle(new Point(3,4), new Point(7,4), new Point(5,4)));
        System.out.println(CheckTriangle.isRectangTriangle(new Point(2,2), new Point(3,2), new Point(3,4 )));
        System.out.println(CheckTriangle.length(new Point(2,3), new Point(3,9)));
    }
}

class Point{
    private int x;
    private int y;

    public Point(int x,int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x &&
                y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}

class CheckTriangle{
    public static boolean isTriangle(Point p1, Point p2, Point p3) {
        boolean status = true;

        if(p1.equals(p2) || p1.equals(p3) || p2.equals(p3)){
            status = false;
        }

        if((p1.getX() == p2.getX() && p1.getX() == p3.getX()) ||
                p1.getY() == p2.getY() && p1.getY() == p3.getY()){
            status = false;
        }

        return status;
    }

    public static boolean isRectangTriangle(Point p1, Point p2, Point p3){
        boolean status = false;

        if(isTriangle(p1, p2, p3)){
           double a = length(p1, p2);
           double b = length(p1, p3);
           double c = length(p2, p3);

           if(isRectHelp(a,b,c) || isRectHelp(a,c,b) || isRectHelp(c,b,a)){
               status = true;
           }
        }

        return status;
    }

    public static double length(Point p1, Point p2){
        return Math.sqrt(Math.pow(p1.getX() - p2.getX(), 2)+Math.pow(p1.getY() - p2.getY(),2));
    }

    public static boolean isRectHelp(double a, double b, double c){
        boolean status = false;

        if(Math.sqrt(a * a + b * b) == c){
            status = true;
        }

        return status;
    }
}
