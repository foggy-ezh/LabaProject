package com.training.labs.first.calculation;

/**
 * Created by USER on 22.09.2016.
 */

import com.training.labs.first.circle.Circle;

public class CircleSquare {

    public double calculateSquare(Circle crcl) {
        return Math.pow(crcl.getR(),2)*Math.PI;
    }

}
