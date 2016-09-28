package com.training.labs.first.action;

import com.training.labs.first.circle.Circle;
import com.training.labs.first.exception.CircleWrongRadiusException;
import com.training.labs.first.point.Point;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by USER on 22.09.2016.
 */
public class Runner {

    public static Logger logger = LogManager.getLogger();
    public static void main(String[]args){
        logger.info("Program started");
        Point centerPoint = new Point(6,2);
        try {
            Circle circle = new Circle(centerPoint, -25);
        } catch (CircleWrongRadiusException e) {
            logger.error(e.getMessage());
        }
        logger.info("Program ended");
    }
}
