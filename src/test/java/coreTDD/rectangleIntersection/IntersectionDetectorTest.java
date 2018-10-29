package coreTDD.rectangleIntersection;

import org.junit.Test;
import coreTDD.rectangleIntersection.helpfulClasses.CoordinateRectangle;
import coreTDD.rectangleIntersection.helpfulClasses.Coordinates;

import static org.assertj.core.api.Assertions.assertThat;

public class IntersectionDetectorTest {

    private IntersectionDetector intersectionDetector = new IntersectionDetector();

    @Test
    public void non_overlapping_rectangles_do_not_intersect() {
        assertThat(intersectionDetector.rectangleIntersection(
                new CoordinateRectangle(
                        new Coordinates(0, 0),
                        new Coordinates(1, 1)
                ),
                new CoordinateRectangle(
                        new Coordinates(2, 2),
                        new Coordinates(3, 3)
                ))
        ).isFalse();
    }
}