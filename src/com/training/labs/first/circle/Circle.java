package com.training.labs.first.circle;

/**
 * Created by USER on 22.09.2016.
 */

import com.training.labs.first.exception.CircleWrongRadiusException;
import com.training.labs.first.point.Point;

public class Circle {

    private Point center;
    private double r;
    
    public Circle(int x, int y, double r) throws CircleWrongRadiusException {
        this.setR(r);
        this.center = new Point(x, y);
    }

    public Circle(Point center, double r) throws CircleWrongRadiusException {
        this.setR(r);
        this.center = center;
    }

    public int getCenterX() {
        return center.getX();
    }

    public int getCenterY() {
        return center.getY();
    }

    public double getR() {
        return r;
    }

    public void setR(double r) throws CircleWrongRadiusException {
        if(r<=0) throw new CircleWrongRadiusException("WRONG RADIUS");
        this.r = r;
    }

    public void setCenterX(int x) {
        center.setX(x);
    }

    public void setCenterY(int y) {
        center.setY(y);
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }
}
