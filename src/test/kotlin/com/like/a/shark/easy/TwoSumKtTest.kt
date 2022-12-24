package com.like.a.shark.easy

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class TwoSumKtTest {

    @Test
    fun twoSum() {
        val nums = intArrayOf(2,7,11,15)
        val target = 9
        val expected = intArrayOf(0,1)
        assertTrue(expected.contentEquals(TwoSum.twoSum(nums, target)))
    }
}