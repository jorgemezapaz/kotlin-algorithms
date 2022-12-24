package com.like.a.shark.easy

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class PalindromeNumberTest{

    @Test
    fun isPalindromeTest(){
        val input1 = 121
        assertTrue(PalindromeNumber.isPalindrome(input1))

        val input2 = -121
        assertFalse(PalindromeNumber.isPalindrome(input2))

        val input3 = 10
        assertFalse(PalindromeNumber.isPalindrome(input3))
    }
}