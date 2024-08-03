package com.Vino.mymap

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }
    @Test
    fun subtraction_isCorrect() {
        assertEquals(2, 4 - 2)
    }
    @Test
    fun multiplication_isCorrect() {
        assertEquals(2, 4 - 2)
    }
}
class MathUtilsTest {
    @Test
    fun testAdd() {
        val result = MathUtils.add(2, 3)
        assertEquals(5, result)
    }

    @Test
    fun testAdd_negativeNumbers() {
        val result = MathUtils.add(-2, -3)
        assertEquals(-5, result)
    }

    @Test
    fun testAdd_zero() {
        val result = MathUtils.add(0, 0)
        assertEquals(0, result)
    }
}