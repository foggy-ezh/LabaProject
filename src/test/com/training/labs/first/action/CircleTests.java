package test.com.training.labs.first.action;

import com.training.labs.first.calculation.CirclePerimetr;
import com.training.labs.first.calculation.CircleSquare;
import com.training.labs.first.cheker.AxisCrossingCheker;
import com.training.labs.first.circle.Circle;
import com.training.labs.first.exception.CircleWrongRadiusException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by USER on 24.09.2016.
 */
public class CircleTests {
/*    @Before
    Circle circle;*/

    @Test(expectedExceptions = CircleWrongRadiusException.class)
    public void circleInitWrongRadiusTesting() throws CircleWrongRadiusException {
        Circle circle;
        Assert.assertEquals("WRONG RADIUS",circle = new Circle(10,10,-10));
    }

    @Test(expectedExceptions = CircleWrongRadiusException.class)
    public void circleSetWrongRadiusTesting() throws CircleWrongRadiusException {
        Circle circle = new Circle(5,8,4);
        circle.setR(0);
    }

    @Test
    public void circleCalculatePerimetrTesting() throws CircleWrongRadiusException {
        Circle circle = new Circle(6,6,7);
        CirclePerimetr perimetr = new CirclePerimetr();
        Double result = perimetr.calculatePerimetr(circle);
        Assert.assertEquals(43.98, result, 0.01);
    }

    @Test
    public void circleCalculateSquareTesting() throws CircleWrongRadiusException {
        Circle circle = new Circle(6,6,7);
        CircleSquare square = new CircleSquare();
        Double result = square.calculateSquare(circle);
        Assert.assertEquals(153.93, result, 0.01);
    }

    @DataProvider(name = "circleCrossingAxisTestingData")
    public static Object[][] circleDataForTest() {
        return new Object[][] {{5,8,6,1,1}, {3,-5,9,5,0}, {-3,-4,6,2,1}, {-7,2,8,1,1}};
    }


    @Test(dataProvider = "circleCrossingAxisTestingData")
    public void circleAxisCrossingTesting(int x, int y, double r,double distance,int expectedResult) throws CircleWrongRadiusException {
        Circle circle = new Circle(5,8,6);
        AxisCrossingCheker cheker = new AxisCrossingCheker();
        int result = cheker.checkCircleForAxisCrossing(circle,1);
        Assert.assertEquals(1, result, 0.01);
    }
}
