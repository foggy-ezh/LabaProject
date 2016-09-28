package com.training.labs.first.calculation;

/**
 * Created by USER on 22.09.2016.
 */

import com.training.labs.first.circle.Circle;

public class CirclePerimetr {

    public double calculatePerimetr(Circle crcl) {
        return 2 * crcl.getR() * Math.PI;
    }

}
