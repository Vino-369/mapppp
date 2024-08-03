package com.Vino.mymap
// File: src/test/kotlin/com/example/yourapp/MathUtilsTest.kt
// File: src/main/kotlin/com/example/myapp/MathUtils.kt

object MathUtils {
    fun add(a: Int, b: Int): Int {
        return a + b
    }


import org.junit.Test
import org.junit.Assert.*

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

