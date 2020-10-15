package models;

import java.util.List;

public class Triangle implements Shape {

  private Point pointA;
  private Point pointB;
  private Point pointC;

    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    public void draw()
    {
        System.out.println("Drawing a triangle");
        System.out.println("Point a = " + pointA.getX());
        System.out.println("Point b = " + pointB.getX());
        System.out.println("Point c = " + pointC.getX());
    }
}
