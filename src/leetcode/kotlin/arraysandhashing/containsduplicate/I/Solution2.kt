package leetcode.kotlin.arraysandhashing.containsduplicate.I

class Solution2 {
  fun containsDuplicate(nums: IntArray): Boolean {
    nums.sort()
    for (i in 0 until nums.size - 1) {
      if (nums[i] == nums[i + 1]) {
        return true
      }
    }
    return false
  }
}