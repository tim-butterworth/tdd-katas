package coreTDD.rectangleIntersection.helpfulClasses;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class CoordinateRectangle {

    private final Coordinates bottomLeft;
    private final Coordinates topRight;

    public CoordinateRectangle(Coordinates coordinates1, Coordinates coordinates2) {
        Integer x1 = coordinates1.getX();
        Integer x2 = coordinates2.getX();

        Integer y1 = coordinates1.getY();
        Integer y2 = coordinates2.getY();

        validateNotEqual(x1, x2);
        validateNotEqual(y1, y2);

        List<Integer> xs = Arrays.asList(x1, x2);
        List<Integer> ys = Arrays.asList(y1, y2);

        xs.sort(Comparator.naturalOrder());
        ys.sort(Comparator.naturalOrder());

        this.bottomLeft = new Coordinates(
                xs.get(0),
                ys.get(0)
        );
        this.topRight = new Coordinates(
                xs.get(1),
                ys.get(1)
        );
    }

    public Coordinates getBottomLeft() {
        return bottomLeft;
    }

    public Coordinates getTopRight() {
        return topRight;
    }

    private void validateNotEqual(Integer value1, Integer value2) {
        if (value1 == value2) {
            throw new InvalidRectangle();
        }
    }
}
