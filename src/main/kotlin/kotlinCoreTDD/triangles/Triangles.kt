package kotlinCoreTDD.triangles

sealed class TriangleType
object Equilateral : TriangleType()
object Scalene : TriangleType()
object Isosceles : TriangleType()
object Invalid : TriangleType()

class Triangles {
    fun identify(s1: Int, s2: Int, s3: Int): TriangleType = error("Implement the functionality here")
}
