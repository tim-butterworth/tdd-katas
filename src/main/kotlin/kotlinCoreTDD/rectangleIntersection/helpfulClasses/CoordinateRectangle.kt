package kotlinCoreTDD.rectangleIntersection.helpfulClasses

class CoordinateRectangle(
        coordinateOne: Coordinate,
        coordinateTwo: Coordinate
) {

    private val smallXSmallY: Coordinate
    private val bigXBigY: Coordinate

    init {
        val xOne = coordinateOne.x
        val xTwo = coordinateTwo.x

        val yOne = coordinateOne.y
        val yTwo = coordinateTwo.y

        if (xOne == xTwo) throw InvalidRectangle()
        if (yOne == yTwo) throw InvalidRectangle()

        val xs = listOf(xOne, xTwo).sortedWith(Comparator.naturalOrder())
        val ys = listOf(yOne, yTwo).sortedWith(Comparator.naturalOrder())

        smallXSmallY = Coordinate(x = xs[0], y = ys[0])
        bigXBigY = Coordinate(x = xs[1], y = ys[1])
    }

    fun bigXBigY(): Coordinate = bigXBigY
    fun smallXSmallY(): Coordinate = smallXSmallY
}

data class Coordinate(val x: Int, val y: Int)
