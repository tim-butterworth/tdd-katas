package kotlinCoreTDDTests.triangles

import kotlinCoreTDD.triangles.Equilateral
import kotlinCoreTDD.triangles.Triangles
import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class TrianglesTest {

    @Test
    fun canIdentify_1_1_1_asEquilateral() {
        assertThat(Triangles().identify(1, 1, 1)).isEqualTo(Equilateral)
    }
}