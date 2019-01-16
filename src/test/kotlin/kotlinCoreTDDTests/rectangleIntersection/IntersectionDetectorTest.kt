package kotlinCoreTDDTests.rectangleIntersection

import kotlinCoreTDD.rectangleIntersection.IntersectionDetector
import kotlinCoreTDD.rectangleIntersection.helpfulClasses.Coordinate
import kotlinCoreTDD.rectangleIntersection.helpfulClasses.CoordinateRectangle
import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class IntersectionDetectorTest {

    @Test
    fun rectangles__ZeroZero_OneOne__TwoTwo_ThreeThree__doNotIntersect() {
        val rectangleIntersection = IntersectionDetector().rectangleIntersection(
                CoordinateRectangle(
                        Coordinate(x = 0, y = 0),
                        Coordinate(x = 1, y = 1)
                ),
                CoordinateRectangle(
                        Coordinate(x = 2, y = 2),
                        Coordinate(x = 3, y = 3)
                )
        )

        assertThat(rectangleIntersection).isFalse()
    }
}