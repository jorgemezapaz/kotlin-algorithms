package com.like.a.shark.easy

class TwoSum {
    companion object{
        //problem link: https://leetcode.com/problems/two-sum/description/
        //O(n) time - O(n) space. Where n is the number of element that has the array
        fun twoSum(nums: IntArray, target: Int): IntArray {
            val diffMap = mutableMapOf<Int, Int>()
            nums.forEachIndexed { index, num ->
                diffMap[num]?.let { return intArrayOf(it, index) }
                diffMap[target - num] = index
            }
            return intArrayOf()
        }
    }
}