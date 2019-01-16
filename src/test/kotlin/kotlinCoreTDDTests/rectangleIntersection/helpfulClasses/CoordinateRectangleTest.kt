package kotlinCoreTDDTests.rectangleIntersection.helpfulClasses

import kotlinCoreTDD.rectangleIntersection.helpfulClasses.InvalidRectangle
import kotlinCoreTDD.rectangleIntersection.helpfulClasses.Coordinate
import kotlinCoreTDD.rectangleIntersection.helpfulClasses.CoordinateRectangle
import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class CoordinateRectangleTest {

    @Test(expected = InvalidRectangle::class)
    fun error_if_thereIsNoSpaceBetweenXs() {
        CoordinateRectangle(
                Coordinate(x = 0, y = 1),
                Coordinate(x = 0, y = 2)
        )
    }

    @Test(expected = InvalidRectangle::class)
    fun error_if_thereIsNoSpaceBetweenYs() {
        CoordinateRectangle(
                Coordinate(x = 0, y = 1),
                Coordinate(x = 1, y = 1)
        )
    }

    @Test
    fun smallXSmallYCoordinateHasTheSmallestXandY() {
        listOf(
                Pair(
                        CoordinateRectangle(
                                Coordinate(x = 0, y = 1),
                                Coordinate(x = 1, y = 7)
                        ),
                        Coordinate(x = 0, y = 1)
                ),
                Pair(
                        CoordinateRectangle(
                                Coordinate(x = 1, y = 7),
                                Coordinate(x = 2, y = 1)
                        ),
                        Coordinate(x = 1, y = 1)
                ),
                Pair(
                        CoordinateRectangle(
                                Coordinate(x = 2, y = 7),
                                Coordinate(x = 1, y = 1)
                        ),
                        Coordinate(x = 1, y = 1)
                ),
                Pair(
                        CoordinateRectangle(
                                Coordinate(x = 3, y = 2),
                                Coordinate(x = 2, y = 7)
                        ),
                        Coordinate(x = 2, y = 2)
                )
        ).forEach { pair ->
            assertThat(pair.first.smallXSmallY()).isEqualTo(pair.second)
        }
    }

    @Test
    fun bigXBigYCoordinateHasTheLargestXandY() {
        listOf(
                Pair(
                        CoordinateRectangle(
                                Coordinate(x = 0, y = 1),
                                Coordinate(x = 1, y = 7)
                        ),
                        Coordinate(x = 1, y = 7)
                ),
                Pair(
                        CoordinateRectangle(
                                Coordinate(x = 1, y = 7),
                                Coordinate(x = 2, y = 1)
                        ),
                        Coordinate(x = 2, y = 7)
                ),
                Pair(
                        CoordinateRectangle(
                                Coordinate(x = 2, y = 9),
                                Coordinate(x = 1, y = 1)
                        ),
                        Coordinate(x = 2, y = 9)
                ),
                Pair(
                        CoordinateRectangle(
                                Coordinate(x = 3, y = 2),
                                Coordinate(x = 2, y = 7)
                        ),
                        Coordinate(x = 3, y = 7)
                )
        ).forEach { pair ->
            assertThat(pair.first.bigXBigY()).isEqualTo(pair.second)
        }
    }
}