# [137. Single Number II](https://leetcode.com/problems/single-number-ii/description/)

Given an integer array `nums` whereevery element appears **three times**  except for one, which appears **exactly once** . Find the single element and return it.

You mustimplement a solution with a linear runtime complexity and useonly constantextra space.

**Example 1:** 

```
Input: nums = [2,2,3,2]
Output: 3
```

**Example 2:** 

```
Input: nums = [0,1,0,1,0,1,99]
Output: 99
```

**Constraints:** 

- `1 <= nums.length <= 3 * 10^4`
- `-2^31 <= nums[i] <= 2^31 - 1`
- Each element in `nums` appears exactly **three times**  except for one element which appears **once** .