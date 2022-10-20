package com.example.diceroller

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

     fun multiply_test_1()
     {
         assertEquals(100,11*10)
     }

    @Test
     fun dice_roll_test()
    {
        val dice=Dice(6)
        val result=dice.roll()
        assertNotEquals(0,result)
    }
}