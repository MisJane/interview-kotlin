package app.intech


import org.junit.jupiter.api.Test
import strikt.api.expectThat
import strikt.assertions.containsExactly

class UniqueAppWordsTest {
    @Test
    fun `replace a and A with 4, uppercase, unique values`() {
        val input = listOf("ANNA", "ann4", "-1", null, "test")
        val result = UniqueAppWords.process(input)
        expectThat(result).containsExactly("4NN4", "-1", "TEST")
    }

    @Test
    fun `duplicates removed after processing`() {
        val input = listOf("apple", "APPLE", "aPPle")
        val result = UniqueAppWords.process(input)
        expectThat(result).containsExactly("4PPLE")
    }

}