// COMP2850 Portfolio: Week 3
// Tests for median()

import io.kotest.core.spec.style.FreeSpec
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.matchers.shouldBe
import io.kotest.matchers.floats.plusOrMinus

const val tolerance = 0.000001f

@Suppress("Unused")
class MedianTest : FreeSpec(
    {
    "Exception when size=0" 
    {
        shouldThrow<IllegalArgumentException> 
        {
            median(listOf())
        }
    }

    "Median of a single element is that element" 
    {
        median(listOf(7f)) shouldBe (7f plusOrMinus tolerance)
    }

    "Median of two elements is their mean" 
    {
        median(listOf(2f, 4f)) shouldBe (3f plusOrMinus tolerance)
    }

    "Median of three unsorted elements is the middle value once sorted" 
    {
        median(listOf(9f, 1f, 2f)) shouldBe (2f plusOrMinus tolerance)
    }

    "Median of four unsorted elements is the mean of the two middle values" 
    {
        median(listOf(8f, 1f, 4f, 2f)) shouldBe (3f plusOrMinus tolerance)
    }
})