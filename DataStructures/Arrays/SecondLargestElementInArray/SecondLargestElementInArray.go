/*
* Created on 31 March 2024
* @author Sai Sumanth
 */
package main

import (
	"fmt"
	"math"
	"slices"
)

/*
   Link -
   Topics - arrays
   Solved ? ✅
*/

func main() {
	fmt.Println("Second Largest Element in Array")
	nums := []int{1, 3, 4, 2, 6, 5, 89} // second largest is 6

	// sort the array 🤡
	naive(nums)

	// above naive method will modify the slice, so re-assigning the elements
	nums = []int{12, 35, 1, 10, 34, 1} // second largest is 34

	// linear time but 2 pass
	optimal(nums)

	// 😎 only one pass
	mostOptimal(nums)
}

// sort the given array and find the second largest
// Time Complexity - O(n * log n)
func naive(nums []int) {
	fmt.Println("BRUTE FORCE APPROACH")
	slices.Sort(nums)
	fmt.Println("Second Largest is : ", nums[len(nums)-2])
}

// Linear Time
// 2 Pass
func optimal(nums []int) {
	fmt.Println("OPTIMAL APPROACH")
	// find the largest element first
	largest, secondLargest := math.MinInt, math.MinInt

	for _, v := range nums {
		if v > largest {
			largest = v
		}
	}

	fmt.Println("first largest is : ", largest)

	// Now find the second largest
	for _, v := range nums {
		if (secondLargest < v) && (v != largest) {
			secondLargest = v
		}
	}

	fmt.Println("Second largest is : ", secondLargest)

}

// Linear Time - only one pass
func mostOptimal(nums []int) {
	fmt.Println("Most Optimal Approach - One Pass")
	if len(nums) < 2 {
		fmt.Println("Array must have at least two elements.")
		return
	}
	largest, secondLargest := math.MinInt, math.MinInt

	for _, x := range nums {
		if x > largest {
			secondLargest = largest
			largest = x
		} else if x > secondLargest && x != largest {
			secondLargest = x
		}
	}

	fmt.Println("Second Largest number:", secondLargest)
}
