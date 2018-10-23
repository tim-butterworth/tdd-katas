package rectangleIntersection.helpfulClasses;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CoordinateRectangleTest {

    @Test
    public void bottom_left_and_top_right_results_in_a_valid_rectangle() {
        CoordinateRectangle coordinateRectangle = new CoordinateRectangle(
                new Coordinates(0, 0),
                new Coordinates(1, 1)
        );

        assertThat(coordinateRectangle.getBottomLeft().getX()).isEqualTo(0);
        assertThat(coordinateRectangle.getBottomLeft().getY()).isEqualTo(0);

        assertThat(coordinateRectangle.getTopRight().getX()).isEqualTo(1);
        assertThat(coordinateRectangle.getTopRight().getY()).isEqualTo(1);
    }

    @Test
    public void bottom_right_and_top_left_results_in_a_valid_rectangle() {
        CoordinateRectangle coordinateRectangle = new CoordinateRectangle(
                new Coordinates(1, 0),
                new Coordinates(0, 1)
        );

        assertThat(coordinateRectangle.getBottomLeft().getX()).isEqualTo(0);
        assertThat(coordinateRectangle.getBottomLeft().getY()).isEqualTo(0);

        assertThat(coordinateRectangle.getTopRight().getX()).isEqualTo(1);
        assertThat(coordinateRectangle.getTopRight().getY()).isEqualTo(1);
    }

    @Test(expected = InvalidRectangle.class)
    public void if_the_rectangle_is_a_vertical_line_throws_an_exception() {
        Integer x = 0;

        new CoordinateRectangle(
                new Coordinates(x, 0),
                new Coordinates(x, 100)
        );
    }

    @Test(expected = InvalidRectangle.class)
    public void if_the_rectangle_is_a_horizontal_line_throws_an_exception() {
        Integer y = 0;

        new CoordinateRectangle(
                new Coordinates(0, y),
                new Coordinates(100, y)
        );
    }
}