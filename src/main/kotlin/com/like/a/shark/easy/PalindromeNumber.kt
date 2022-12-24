package com.like.a.shark.easy

class PalindromeNumber {
    companion object{
        //Link problem: https://leetcode.com/problems/palindrome-number/
        //O(n) time - O(1) space. Where n is the digits number
        fun isPalindrome(x: Int): Boolean {
            val string = x.toString()
            return string.reversed() == string
        }
    }
}