package com.training.labs.first.cheker;

import com.training.labs.first.circle.Circle;

/**
 * Created by USER on 27.09.2016.
 */
public class AxisCrossingCheker {

    public int checkCircleForAxisCrossing(Circle circle, double distance){
        int crossingCounts=0;
        int x = Math.abs(circle.getCenterX());
        int y = Math.abs(circle.getCenterY());
        double radius = circle.getR();
        if( x< radius && radius - x == distance ) crossingCounts++;
        if( y< radius && radius - y == distance ) crossingCounts++;
        return crossingCounts;
    }
}
