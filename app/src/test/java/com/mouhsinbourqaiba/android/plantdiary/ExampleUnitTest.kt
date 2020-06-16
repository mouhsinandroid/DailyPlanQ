package com.mouhsinbourqaiba.android.plantdiary

import com.mouhsinbourqaiba.android.plantdiary.dto.Plant
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

    fun addTwoAndThree_equalsFive(){
        assertEquals(5, 2 + 3)
    }

    fun addThreeAndThree_equalsSix(){
        assertEquals(6, 3 + 3)
    }

    fun addFourAndThree_equalsSix(){
        assertEquals(7, 4 + 3)
    }

    fun addFiveAndThree_equalsEight(){
        assertEquals(8, 4 + 4)
    }

    @Test
    fun confrimEasternRedbud_outputsEasternRedbud() {
        var plant: Plant = Plant("Cercis", "canadesis", "Eastern Redbud")
        assertEquals("Eastern Redbud", plant.toString())
    }

    @Test
    fun addtion_isNotCorrect(){
        assertEquals(4, 1+2)
    }
}
