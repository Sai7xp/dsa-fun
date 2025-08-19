### Collections in Java

![Collections](Collections.png)

### Tags/Topics

`arrays`, `sorting`, `two-pointers`, `sliding-window`, `hashing`, `hash-table`, `kadens`, `cyclic-sort`

🧬 → Algorithm Problem <br/>
💎 → Gem

### Basic Concepts

- [Imp Code Snippets/Logics](imp_logics.md)
- [Java Cheat Sheet Notion Link ↗][def34]
- [👑 Java Fundamentals & OOPs Concepts(Inheritance, Polymorphism, Abstraction, Encapsulation)][def149]
- [👑 Writing a Custom Comparator in Java][def157]
- [Var Args - Java][def51]
- [Strings & StringBuilder - Java][def53]
- [Boxing, Unboxing, Auto-boxing - Java][def54]
- [Patterns][def59]
- [Second Largest Element][def86]

<!-- Popular Algorithms  -->

### Popular Algorithms

| Algorithm                                                                                | Description                                                                                                                                                                                                                                                                                                               |
| ---------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [🧬 💎 Find the Duplicate Number - Floyd's Cycle Detection Algo - Tortoise & Hare][def9] |                                                                                                                                                                                                                                                                                                                           |
| [Linear Search Algorithm + Recursion Version LS][def16]                                  |                                                                                                                                                                                                                                                                                                                           |
| [Binary Search Algorithm + Order-Agnostic BS][def19]                                     |                                                                                                                                                                                                                                                                                                                           |
| [Bubble Sort Algorithm][def28]                                                           | Compare every two adjacent elements and swap them if the first is > than second element. Largest element will be kept at the end after each pass                                                                                                                                                                          |
| [Selection Sort Algorithm][def29]                                                        | Pick the ith smallest element in each iteration and put it at correct index. Idea is to find the min/max element in an unsorted array and then put it at correct position                                                                                                                                                 |
| [Insertion Sort Algorithm][def31]                                                        |                                                                                                                                                                                                                                                                                                                           |
| [Merge Sort - Two Way Iterative Approach][def78]                                         |                                                                                                                                                                                                                                                                                                                           |
| [How to merge 3 lists at a time using 3-way merging approach][def82]                     | Merge 3 sorted lists using 3 pointers. But in general we will be using only 2-way merging method to merge n lists. let's suppose n is 3. first merge the lists A,B and then merge C with A,B result. So in this way two lists will be merged in each step. The same approach will be used in merge sort algorithm as well |
| [Merge Sort - Recursive Approach][def79]                                                 |                                                                                                                                                                                                                                                                                                                           |
| [53. Maximum Subarray][def193] `Kadens Algorithm`                                        | Keep counting the sum and update maxSum. But when sum goes -ve (sum < 0) It doesn't makes sense to carry that sum moving forward. so start sum again from 0.                                                                                                                                                              |
| [HashMaps & Hashing Concept][def41]                                                      |                                                                                                                                                                                                                                                                                                                           |
| [Sieve Of Eratosthenes - Prime Numbers][def71]                                           | Find all the primes in a given range                                                                                                                                                                                                                                                                                      |
| [SQRT of a Number][def72]                                                                | Find the SQRT of a Number using Binary Search. Even if number is not a perfect square                                                                                                                                                                                                                                     |
| [Euclidean Algorithm - GCD of Two Nums][def73]                                           | Find GCD of two nums. Brute force, Eculidean Algorithm (Repeated Subtraction & Repeated Division)                                                                                                                                                                                                                         |

<!-- Arrays -->

### Arrays

| Problem Details                                                              | Description                                                                                                                                                                                                                                                                                                                                                                                                                     |
| ---------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [Valid Mountain Array][def10] `Easy`                                         | left start from 0, and right start from len-1. both try to climb and see if they meet at same peak then arr is mountain array                                                                                                                                                                                                                                                                                                   |
| [Rotate Array][def6] `Medium` `Two Pointers`                                 |                                                                                                                                                                                                                                                                                                                                                                                                                                 |
| 💎 [Product of Array Except Itself][def5] `Medium` `Prefix Sum` `Suffix Sum` |                                                                                                                                                                                                                                                                                                                                                                                                                                 |
| [Minimum Size Subarray Sum][def4] `Medium` `Two Pointers` `Sliding Window`   |                                                                                                                                                                                                                                                                                                                                                                                                                                 |
| [LC 349. Intersection of Two Arrays][def3] `Easy`                            |                                                                                                                                                                                                                                                                                                                                                                                                                                 |
| [Check If arrays is sorted & Rotated][def] `Easy`                            |                                                                                                                                                                                                                                                                                                                                                                                                                                 |
| [Remove Duplicates From Sorted Array][def2] `Easy`                           |                                                                                                                                                                                                                                                                                                                                                                                                                                 |
| 💎 [Move Zeroes][move_zeros] `Easy`                                          |                                                                                                                                                                                                                                                                                                                                                                                                                                 |
| 🧬 [Majority Element - Moore's Voting Algorithm][def12] `Easy`               | hint: `MayBeMajority`. Assume that first as majority element and increment count if nums[i] is MayBeMajority otherwise count--. when count reaches 0 we can say that what ever we have assumed as majority is not majority element till that i(in that subarray) so assume next element as majority element.                                                                                                                    |
| 💎 [Majority Element II][def142]                                             | max two majority elements will be there(greater than n/3). keep two counters and do inc, dec according to moore voting algorithm. at last check the each element count again if the count is > n/3. Then add them to result list.                                                                                                                                                                                               |
| 💎 [Number of Arithmetic Triplets][def18] `Easy`                             | `j - i = diff` & `k - j = diff` from 1st equation find `i` and from 2nd equation find `j` now substitute `j` in first equation.                                                                                                                                                                                                                                                                                                 |
| 💎 [2874. Maximum Value of an Ordered Triplet II][def159]                    | Maintain `maxSoFar`, `maxDiff` and find out the max res.                                                                                                                                                                                                                                                                                                                                                                        |
| 💎 [Remove Duplicates From Sorted Array II][def20] `Medium`                  |                                                                                                                                                                                                                                                                                                                                                                                                                                 |
| 💎💎 [ 442. Find all Duplicates in an Array][def49] `Medium`                 |                                                                                                                                                                                                                                                                                                                                                                                                                                 |
| 💎 [41. First Missing Positive][def55] `Hard`                                | Get rid of 0s and negatives in array, replace them with 1. now consider every element as index (nums[i] - 1) and if it's a valid index go to that index and turn that number as -ve. finally loop through the array if there any number > 0 then we can say that we didn't visit that index. if we did not visit that index. it mean that (index+1) nums is not found in the given array and that is the first missing positive |
| 💎 [2028. Find missing observations][def84] `Medium`                         | Nice Math Problem. It's all about dividing `missingRollSum` into n parts. Each roll min val will be `missingRollSum/n` and consider quotient as well                                                                                                                                                                                                                                                                            |
| [2148. Count Elements With Strictly Smaller and Greater Elements][def141]    | Optimal way is to find the smallest and largest in array. We can solve it by sorting the array as well, quite interesting approach. try once                                                                                                                                                                                                                                                                                    |
| [75. Sort Colors][def195]                                                    | Assume sorted array has 3 parts (divide it using three pointers - low, mid, high) from 0 to low - 1: **0s**, from low to mid - 1: **1s**, from (mid or high + 1) to len-1: **2s**. So start low, mid at 0 and high at len - 1. If a[mid] == 0 then swap with low and low++; mid++, if a[mid] == 1 simply mid++, if a[mid] == 2 then swap with high and only high--                                                              |
| [Transpose Matrix][def196]                                                   | If the matrix is m _ n we need to create another matrix of size n _ m and move the elements. if the matrix is n \* n then we can do it inplace.                                                                                                                                                                                                                                                                                 |
| [Rotate Image][def197]                                                       | **1.** Transpose the Matrix & **2.** Exchange the columns                                                                                                                                                                                                                                                                                                                                                                       |
| [73. Set Matrix Zeroes][def198]                                              | **Brute force:** create two separate arrays of size m, n respectively and use them as markers, when matrix[i][j] == 0 then mark 1 in those two arrays at positions i and j. **Optimal:** Use top row and first column as marker arrays (no extra arrays needed)                                                                                                                                                                 |
| [Count Special Triplets][def243]                                             | maintain leftFreq and rightFreq maps                                                                                                                                                                                                                                                                                                                                                                                            |

<!-- 2D Arrays  -->

### 2D Arrays

| Problem Details                                       | Description                                                                        |
| ----------------------------------------------------- | ---------------------------------------------------------------------------------- |
| [289. Game of Life][def74] `Medium`                   |                                                                                    |
| [2570. Merge Two 2D Arrays by Summing Values][def154] | given arrays are already sorted. so use two pointers and merge them. `List<int[]>` |

<!-- Strings  -->

### Strings

| Problem Details                                                                  | Description                                                                                                                                                                                                              |
| -------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| [Valid Anagram][def7] `Easy`                                                     |                                                                                                                                                                                                                          |
| [796. Rotate String - Find if s can become g after some rotations][def56] `Easy` | **BruteForce:** return (s+s).contains(g). **Optimal:** Get the starting index (s.char(i) == g.charAt(i)) and check if the strings are equal. Use (i%len) if pointers goes out of index.                                  |
| [Reverse words in a String][def58] `Medium`                                      |                                                                                                                                                                                                                          |
| [💎💎 14. Longest Common Prefix][def90]                                          | **BruteForce:** find the minlen of all string and check the each char of each string until minlen. **Optimal:** sort the given list of strings. find the max common prefix len for first and last strings                |
| [💎 Generate All Substrings, Subsequences, Permutations of String][def101]       |                                                                                                                                                                                                                          |
| [2259. Remove Digit From Number to Maximize Result][def139]                      | Analyze "5515", "5565" & "5456" numbers to get the solution(Digit = "5").(If there is no greater digit than given digit is present then remove the last occurence of digit in num from right to left)                    |
| [1455. Check If a Word Occurs As a Prefix of Any Word in a Sentence][def144]     |                                                                                                                                                                                                                          |
| [1657. Determine if Two Strings Are Close][def221]                               | "abb", "bba" these are close. Both strings should contain same chars and freq doesn't need to be same of same chars. And second check for frequencies. when we sort the frequencies of two strings, they should be equal |
| [443. String Compression][def229]                                                |                                                                                                                                                                                                                          |
| [953. Verifying an Alien Dictionary][def259]                                     | Lexicographical Sorting                                                                                                                                                                                                  |

<!-- Binary Search  -->

### Binary Search

> Revision History: April 21st 2025,

| Problem Details                                                         | Description                                                                                                                                                                                                                                                                                                                                                                                                                                    |
| ----------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [Find Ceil & Floor of a Number][def122]                                 |                                                                                                                                                                                                                                                                                                                                                                                                                                                |
| [Find Smallest letter greater than target][def21] `Easy`                | Find the ceil of a given letter in the array                                                                                                                                                                                                                                                                                                                                                                                                   |
| [Search Insert Position][def25]                                         | Same as finding the Ceil of a given target                                                                                                                                                                                                                                                                                                                                                                                                     |
| 💎 [First and Last position of element in sorted array][def22] `Medium` | Start looking for target using normal Binary Search. once the target is found at mid, it could be the **potential first or last index**, but more target elements may exists before or after mid. so if we are finding the first index then set end pointer to mid - 1 or if it's last index, set start pointer to mid + 1 . We will run the find index method two times, based on the first or last index we will move start and end pointers |
| 💎 [852 Peak Index in a Mountain Array][def23]                          |                                                                                                                                                                                                                                                                                                                                                                                                                                                |
| 💎 [Find in Mountain Array][def24] `Hard`                               | Find the peak index first. Then apply order-agnostic binary search on both the arrays (before peak and after peak)                                                                                                                                                                                                                                                                                                                             |
| [33. Search in Rotated Sorted Array][def26]                             | First, determine which part of the array is sorted (the part before the mid or the part after the mid using condition `(nums[start] <= middle)` ). Then figure out where the target lies in the left part or right part of array                                                                                                                                                                                                               |
| [81. Search Element in Rotated Sorted Array 2][def27]                   | Same as above problem. But one extra condition `if(middle == nums[start] && middle == nums[end])` will be added since duplicate elements are there `[1, 0, 1, 1, 1]`. In that condition we have to move start and end pointers as long as both the values are same.                                                                                                                                                                            |
| [153. Find Minimum in Rotated Sorted Array][def183]                     | Rule of binary search is to eliminate the half in each step. so figure out the sorted part and consider nums[start] as min of that sorted part and move on to the next part of the array to see if there's any minimum in the next part.                                                                                                                                                                                                       |
| [540. Single Element in a Sorted Array][def184]                         | Always keep the mid at odd index (when we get mid == 4(even) then do mid++). when we are at odd index usually `mid` and `mid-1` should be same, (since every element is repeated twice in the given array). based on this, move start and end pointers                                                                                                                                                                                         |
| [2563. Count the Number of Fair Pairs][def123]                          | **Brute force:** Use a nested for loop O(n^2) and find the pairs. **Optimal:** Sort the array then fix each num in array and find the lower bound and upper bound for that number using binary search. Let's say given lower=3, upper=6 and nums =[0, 1, 4, 4, 5, 7] now when num is 1 then the other number should be atleast 2 (3-1) and max pair num should be 5 (6-1)                                                                      |
| [875. Koko Eating Bananas][def124]                                      | **Brute force:**Start with 1 banana per hour and then keep on increasing the per hour banana count by 1 until the totalHours <= h. Like a linear search - start from 1 to maxOfAllPiles. **Optimal:** Replace Linear Search with BS                                                                                                                                                                                                            |
| [2064. Minimized Maximum of Products Distributed to Any Store][def126]  | Similar to Koko Eating Bananas Problem                                                                                                                                                                                                                                                                                                                                                                                                         |
| [3152. Special Array II][def146]                                        | First find out all the bad indexes and check if there's any bad index which lies in each given range.                                                                                                                                                                                                                                                                                                                                          |
| [2529. Maximum Count of Positive Integer and Negative Integer][def155]  | **Solution 1:** Check every middle whether it's +ve or -ve and then check the adjacent element and move the left and right pointers. **Solution 2:** Find the upper and lower bound. (Ceil & Floor)                                                                                                                                                                                                                                            |
| [💎 3488. Closest Equal Element Queries][def156]                        |                                                                                                                                                                                                                                                                                                                                                                                                                                                |
| [💎 Search In 2D Matrix][def201]                                        | **Brute Force:** Each row is already sorted. apply binary search on each array. **Optimal:** No need to search all row. first apply BS on first col elements and check for floor of target. and apply BS only on that row.                                                                                                                                                                                                                     |

<!-- Sorting -->

### Sorting

| Problem                                                            | Description                        |
| ------------------------------------------------------------------ | ---------------------------------- |
| [3301. Maximize the Total Height of Unique Towers][def96] `Medium` | Hashmaps & Sorting usecase problem |
| [💎💎 1636. Sort Array by Increasing Frequency][def158]            | **Custom comparators in Java**     |

<!-- Two Pointers  -->

### Two Pointers

| Problem Details                                          | Description                                                                                                                      |
| -------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- |
| [167 Two Sum II - Input Array Is Sorted][def11] `Medium` |                                                                                                                                  |
| [💎 125 Valid Pallindrome][def14] `Easy`                 |                                                                                                                                  |
| [💎 680 Valid Pallindrome II][def15] `Easy`              |                                                                                                                                  |
| [💎 LC 13. 3Sum][def17] `Medium`                         |                                                                                                                                  |
| [💎 88 Merge Sorted Array][def48] `Medium`               |                                                                                                                                  |
| [💎 Duplicate Zeros][def87] [code][def89]                | use extra array to generate the result                                                                                           |
| [💎 Number of recent calls][def219]                      | use an array `int[] recentCalls` and use two pointers start and end. make sure that start pointer points to time within t - 3000 |

<!-- Sliding Window  -->

### 🪟 Sliding Window

> Revision History: May 7th 2025,

| Problem Details                                                      | Description                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     |
| -------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [209. Minimum Size Subarray Sum][def99]                              | Keep on calculating the sum. and check if sum >= target then decrease the windown size from left and update min length                                                                                                                                                                                                                                                                                                                                                                                                                                                          |
| [1493. Longest Subarray of 1's After Deleting One Element][def102]   | Maintain a sliding window where there is at most one zero in it. when the second zero is found the move the leftPointer to prevZeroIndex+1                                                                                                                                                                                                                                                                                                                                                                                                                                      |
| [1423. Maximum Points You Can Obtain from Cards][def105]             | **With Extra Space(prefix sum):** Calculate total sum of array now maintain the subarray of len n-k and remove it's sum from total sum. **Constant Window Optimal:** Calculate the first k elements sum(first window) now subtract one element from left and add one element from right to that window sum.                                                                                                                                                                                                                                                                     |
| [3. Longest substring without repeating characters][def106]          | Use hashmap and keep track of each char last appeared index. if the repeat is found then move the window's left pointer                                                                                                                                                                                                                                                                                                                                                                                                                                                         |
| [1004. Max Consecutive Ones III][def107]                             | Keep only atmost k zeros in a window. once zeros count exceeds k. then shrink the windowLeftIndex until one zero is removed from left.                                                                                                                                                                                                                                                                                                                                                                                                                                          |
| [904. Fruit Into Baskets][def109]                                    | since we can pick only 2 types of fruits, maintain a hashmap of fruit frequencies. when map size > 2 shrink the starting point(window left index) until map size becomes 2(when the freq of any fruit reaches 0 then remove it from hashmap). **HINT:** Basically we need to find max len subarray with atmost 2 types of numbers. (2 distince nums)                                                                                                                                                                                                                            |
| [Longest Substring With At Most K Distinct Characters][def108]       | Same as **Fruit Into Baskets** problem                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          |
| [2461. Maximum Sum of Distinct Subarrays With Length K][def110]      | Fixed window. Maintain a window of size k and keep track of distinct elements using a hashmap, if distinct elements == k then consider that subarray sum                                                                                                                                                                                                                                                                                                                                                                                                                        |
| [438. Find All Anagrams in a String][def111]                         | Fixed window. Maintain a window of size s1.length() and slide the window over s2 string. Create two hash maps of size 26 to have the freq of chars in two strings. when hash arrays are equal then it's anagram                                                                                                                                                                                                                                                                                                                                                                 |
| [567. Permutation in a String][def112]                               | Almost same as above problem. Fixed window                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      |
| [424. Longest Repeating Character Replacement][def114]               | get the min replacement count for each window. once replacement count > k then shrink the left window                                                                                                                                                                                                                                                                                                                                                                                                                                                                           |
| [76. Minimum Window Substring][def266]                               |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |
| **Count No. of Subarrays Pattern Problems From Here**                | Every time we add new element to our window how many new subarrays we can form ? [1, 2, 3] now if we add 4 to it how many new subarrays we can create ? [4], [3, 4], [2, 3, 4], [1, 2, 3, 4]. Basically total length                                                                                                                                                                                                                                                                                                                                                            |
| [1358. Number of Substrings Containing All Three Characters][def113] | We need to count all the valid substrings. valid substring should contain all 3 a,b,c chars. Keep Track of last seen indexes of each char, initialize all three to -1(create an array of size[3]) when all three are valid indexes then we found the valid substring. "ababc" We found the valid substring at index 4 then the closest left index to form a valid substring is 2(char a) so that is one substring and before that we have two more chars, so 1 + 2 substrings. everytime we find valid substring then can calculate the substrings till that index in this way. |
| [2537. Count the Number of Good Subarrays][def121]                   | Counting subarrays logic is similar to LC 1358 Problem                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          |
| [930. Binary Subarrays With Sum][def116]                             | **Quite interesting problem.** Same as 560 Subarray sum equals K but that problem uses extra space for keeping track of prefix sums. And traditional sliding window approach also doesn't work because we might miss counting few subarrays while shrinking window. Dry run `[1, 0, 0, 1, 1, 0]` array to see how. **Optimal Solution:** `count(sum<=goal) - count(sum<=goal-1)`                                                                                                                                                                                                |
| [992. Subarrays with K Different Integers][def118]                   | Traditional slidind window approach won't work. Dry run `[2, 1, 1, 1, 3, 4, 3, 1]` to see why. **Optimal Solution:**Use `count(sum<=goal) - count(sum<=goal-1)`                                                                                                                                                                                                                                                                                                                                                                                                                 |
| [2303. Count Subarrays With Score Less Than K][def119]               | Same as **[713. Subarray Product Less Than K][def120]**                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         |
| [3254. Find the Power of K-Size Subarrays I][def125]                 | Fixed-size window problem. just keep track of a last index where consecutiveness is missed, If that index is less than or equal to leftPointer then we can say current window elements are sorted, and last element will be the score                                                                                                                                                                                                                                                                                                                                           |
| [1658. Minimum Operations to Reduce X to Zero][def151]               |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |

<!-- Prefix Sum & Suffix Sum  -->

### Prefix Sum & Suffix Sum

| Problem Details                                                               | Description                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             |
| ----------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [💎 GFG: Longest Sub-Array with Sum K (+ve and -ve)][def104]                  | This problem looks like a **sliding window** problem but it can't be solved using sliding window approach because array contains -ve & +ve numbers. So we need to use **HashMap** and store the prefixsum,index                                                                                                                                                                                                                                                                                                                         |
| [💎 560. Subarray Sum Equals K][def117]                                       | Keep track of prefix sum in each step and increase count in two conditions. **1:**When prefix sum == k then we found the subarray with sum k. **2:**Suppose the prefix is x now but we are looking for k, so if we can find subarray with `x-k` simply we can remove that part and remaining subarray sum will be k, so look for prefixSum - k in hashmap. Remember prefix sum can be repeated since arr contains -ve numbers and 0 also                                                                                                |
| [💎 974. Subarray Sums Divisible by K][def194]                                | keep track of **prefix sum mod**. if we have come across the current prefixSumMod before, then if we can omit that prev subarray then remaining sum will be divisible by k                                                                                                                                                                                                                                                                                                                                                              |
| [💎💎 525. Contiguous Array][def115]                                          | almost same as subarray sum equal K problem where we need to get the total subarrays count but here we need to find the longest subarr length. since array contains only 0 and 1 and we need to find the max subarray with equal 0's and 1's, consider 0 as -1 and 1 as 1 only, when the counter becomes 0 it means that till i 0's & 1's are equal so update max len as i + 1. and additionally check hashmap if current counter value already appeared before , if yes then we can consider the subarray from that index to current i |
| [💎 1769. Minimum Number of Operations to Move All Balls to Each Box][def135] | Use a single for loop and keep track of all the balls left to curr index. Each time we move to the next box, the distance for all the balls we’ve passed increases by one. Do the same thing from right to left.                                                                                                                                                                                                                                                                                                                        |
| [💎 1352. Product of the Last K Numbers][def148]                              | Keep track of last appeared zero index                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  |

<!-- Recursion and Backtracking Problems  -->

### Recursion & Backtracking(Check Subsets problem for BT Introduction)

| Problem Details                                                             | Description                                                                                                                                                                                                                                                                                                                                                                                            |
| --------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| [💎💎 Recursion Concept][def57]                                             | Fibonacci, Factorial, Sum Of Digits, Reverse a Number, Pow(x,n), Binary Search Using Recursion                                                                                                                                                                                                                                                                                                         |
| [💎💎 Recursion on Arrays][def77]                                           | Reverse Array, IsArraySorted, Linear Search, Search in Rotated Sorted Array                                                                                                                                                                                                                                                                                                                            |
| [💎💎 Find all Indexes of target in Array ][def77]                          | A Recursive fn whole return type is List. With & without passing the list in argumentgs.                                                                                                                                                                                                                                                                                                               |
| [💎 50. Pow(x,n)][def60]                                                    | Naive Recursive approach to Recursive calls Optimized approach                                                                                                                                                                                                                                                                                                                                         |
| [Count Zeros (or any digit) in a Number][def50]                             | Count Zeros in a given number using recursion                                                                                                                                                                                                                                                                                                                                                          |
| [Number of Steps to Reduce a Number to Zero][def76]                         |                                                                                                                                                                                                                                                                                                                                                                                                        |
| [💎 Print Triangle Patterns using Recursion][def75]                         |                                                                                                                                                                                                                                                                                                                                                                                                        |
| [Bubble Sort & Selection Sort Using Recursion][def80]                       |                                                                                                                                                                                                                                                                                                                                                                                                        |
| [🌻💎 Recursion on Strings][def81]                                          | Remove a specific char, **Subsets**, **Subsequences**, Generate all subsets of an array/string                                                                                                                                                                                                                                                                                                         |
| [💎 231. Is Power of 2][def83] `Easy`                                       | Call the fn recursively until number becomes 1 or any other odd number. If 1 return true.                                                                                                                                                                                                                                                                                                              |
| [1498. Number of Subsequences That Satisfy the Given Sum Condition][def129] | **Brute Force:** Generate all the subsequences and count the ones which satisfy the condition, But TLE. **Optimal Solution:** Since we don't have to return the actual subsequences but only the count, we can sort the array to find the min and max easily and use the two pointers approach to calculate the subsequences using formula 2^n                                                         |
| [🌻🌻🌻 **78. Subsets**][def128]                                            | Can be solved in 4 ways: **Iterative Approach:** Loop through given array of nums and add each num into existing subsets(Add empty subset initially), **Bit Manipulation:** Consider numbers from 1 to 2^n and the set bits in each number will be a subset. **Recursive Solution:** Follow processed, unprocessed approach., **Backtracking:** Explore all the posibilities in each step using a loop |
| [90. Subsets II][def133]                                                    | Backtracking Approach: Take only unique elements at each position, prune the path if the current element is same as previous element for each position                                                                                                                                                                                                                                                 |
| [39. Combination Sum][def130]                                               | Use typical processed/unprocessed approach but **stay on the same index** when a element is picked(basically left rec call - first one) since we can pick the same element any number of times. Base conditions are very important: stop when target == 0, target < 0, index == given.length.                                                                                                          |
| [40. Combination Sum 2][def131]                                             | **Backtracking:** Starting from 0 we have 5 options to pick 1st element `[1, 1, 1, 2, 2]`. and to pick the 2nd element we have 4 options.. so like this call fn recursively in a for loop. Pick only unique elements while picking nth element in a combination                                                                                                                                        |
| [🌻 Maze Problem - Backtracking][def199]                                    |                                                                                                                                                                                                                                                                                                                                                                                                        |
| [77. Combinations][def134]                                                  |                                                                                                                                                                                                                                                                                                                                                                                                        |
| [17. Letter Combinations of a Phone Number][def132]                         | Check notes for explanation                                                                                                                                                                                                                                                                                                                                                                            |

<!-- Linked List -->

### ⛓️‍💥 Linked List

> Revision History: May 13th 2025,

| Problem Details                                                    | Description                                                                                                                                                                                                                             |
| ------------------------------------------------------------------ | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [🌻 Linked List Implementation - Singly, Doubly, Circular][def160] |                                                                                                                                                                                                                                         |
| [707. Design Linked List][def164]                                  |                                                                                                                                                                                                                                         |
| [🌻 Add Two Numbers][def161]                                       | Add two big numbers and return the result in a linked list, single digit for each node                                                                                                                                                  |
| [203. Remove Linked List Elements][def192]                         |                                                                                                                                                                                                                                         |
| [83. Remove Duplicates from Sorted List][def162]                   | Compare every two adjacent elements. if the values are same then do `first.next = second.next.next`. Otherwise `first = first.next` (just moving to next node)                                                                          |
| [328. Odd Even Linked List][def171]                                |                                                                                                                                                                                                                                         |
| [21. Merge Two Sorted Lists][def163]                               |                                                                                                                                                                                                                                         |
| [876. Middle of the Linked List][def165]                           |                                                                                                                                                                                                                                         |
| [141. Linked List Cycle][def167]                                   |                                                                                                                                                                                                                                         |
| [142. Linked List Cycle II][def166]                                |                                                                                                                                                                                                                                         |
| [148. Sort List][def168]                                           | Sort the given list using merge sort. Keep on breaking the list into two halves(at middle) until it's unbreakable. and start merging the two sorted lists                                                                               |
| [206. Reverse Linked List][def169]                                 |                                                                                                                                                                                                                                         |
| [234. Palindrome Linked List][def170]                              | Reverse the 2nd half of list, compare both lists. and revert back the changes (reversing 2nd half)                                                                                                                                      |
| [143. Reorder List][def172]                                        | we have to link 1st node and last node. then 2nd node and second node from last. It's like folding list into half. last node will overlap on first node. so reverse the second half of the List and start linking the nodes VVV pattern |
| [🌻 146. LRU Cache][def187]                                        | implementation problem : use hashmap + doubly linked list to implement the LRU - Least Recently Used Cache                                                                                                                              |

<!-- Stack & Queue -->

### 📚 Stack & Queue

> Revision History: May 25th 2025,

| Problem Details                                                                                | Description                                                                                                                                                                                                                    |
| ---------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| [💎 Implement Stack Operations - Push, Pop, Peek, Increment(uptoIndex, incrementValue)][def35] | Implement the given stack operations in O(1) Time Complexity. Especially INC operation is bit interesting here.                                                                                                                |
| [Implement Stack using Array, Queue using Array, Stack using Queue, Queue using Stack][def175] |                                                                                                                                                                                                                                |
| [💎 Design Circular Queue][def174]                                                             |                                                                                                                                                                                                                                |
| [155. Design Min Stack][def176]                                                                | `push(), pop(), peek(), size(), getMinTillNow()` implement all these stack operation in O(1). Store a Pair(val,minTillNow) in stack, so we know at each stage what is the min value. but takes extra space                     |
| [1963. Minimum Number of Swaps to Make the String Balanced][def185]                            | `Math.ceil(unbalanced/2.0)`                                                                                                                                                                                                    |
| [921. Minimum Add to Make Parentheses Valid][def213]                                           | count invalid ones                                                                                                                                                                                                             |
| [921. Minimum Remove to Make Valid Parentheses][def214]                                        | two pass approach. first pass to remove invalid ')' brackets and 2nd pass to remove invalid '(' brackets                                                                                                                       |
| [💎 496. Next Greater Element I][def177] **Monotonic Stack**                                   | Maintain a monotonic stack (decreasing from bottom to top) and process the given list backwards. and store the next greater of each element in a hashmap since we need to return next greater only for given elements, not all |
| [503. Next Greater Element II][def178] **Monotonic Stack**                                     | Since the array is circular, do two traversals. Populate the result array during 2nd traversal                                                                                                                                 |
| [1475. Final Prices With a Special Discount in a Shop][def179] **Monotonic Stack**             | Next smaller element using monotonic stack algo                                                                                                                                                                                |
| [739. Daily Temperatures][def180] **Monotonic Stack - Store Index**                            | Next Greater element                                                                                                                                                                                                           |
| [💎 907. Sum of Subarray Minimums][def181] **Monotonic Stack**                                 | Check for each element contribution, for how many subarrays the curr element will continue to be minimum. check on both the sides. Monotonic Stack - Next Smaller & Prev Smaller                                               |
| [2104. Sum of Subarray Ranges][def186] **Monotonic Stack**                                     | Maximums Sum - Minimums Sum                                                                                                                                                                                                    |
| [735. Asteroid Collision][def182]                                                              |                                                                                                                                                                                                                                |
| [2696. Minimum String Length After Removing Substrings][def100]                                | Pretty good problem to get started with Stack Data structure.                                                                                                                                                                  |
| [1910. Remove All Occurrences of a Substring][def143] (Can be solved using KMP Algorithm also) | Keep pushing each char of string into stack, once the stack size reaches the pattern size then check if last chars of stack matches with pattern, if they don't match put them back into stack                                 |

<!-- Heap/Priority Queue  -->

### Heap/Priority Queue

- [**Visualize Heap**][def242]
- [215. Kth Largest Element in an Array][def230] - **Brute Force:** Sort the array and return arr[len - k]. **Better:** Maintain a Min-Heap of size k. First insert k elements of array and after that insert only if element is greater than peek. so at the end peek becomes the Kth largest. **Optimal:** Quick Select Algorithm
- [1046. Last Stone Weight][def231] - Use a Max Heap and process top 2 elements until we end up with empty or 1 element in pq `O(n log n)`
- [2558. Takes Gifts from the richest pile][def233] - Check notes for explanation
- [506. Relative Ranks][def232]
- [💎 347. Top K Frequent Elements][def235] - 4 Approaches : Sorting, Max Heap, **Min Heap of size k(Optimal), Bucket Sort(optimal)**
- [K Closest Points to Origin][def255]
- [2530. Maximal Score After Applying K Operations][def103] - pretty good problem to get started with Heap
- [💎 451. Sort Characters By Frequency][def127] **ᐧ** [Another Similar Problem][def173] - count the freq of all chars using a map and then push all the keys into priority queue(apply custom comparator `(a, b) -> freq.get(b) - freq.get(a)`) and then poll each char and do `sb.repeat(ch,map.get(ch))`. **Bucket Sort:** Calculate the frequencies using map and put the chars into a bucket array, where index is the freq of that char
- [💎 Find Median from Data Stream][def236] - Check notes for clear explanation. Idea is to use two heaps - minHeap & maxHeap and divide the stream values into the heaps. anytime if we want median we just have to look at the peeks of the two heaps
- [Meeting Rooms 2][def238] - Two things to check - If there's a conflict we need new room. at the same time before occupying new room, check if there are any previous meetings that ended so that we can occupy that room

<!-- Intervals -->

### Intervals

- [💎 Merge Intervals][def200] - Sort the array using custom comparator `Arrays.sort(intervals,(o1, o2) -> o1[0] - o2[0])` Now start merging intervals
- [💎 Insert Intervals][def239] - Identify the part where we can insert our new interval, till then take all the left part greedily and in the middle part we have to insert new interval, and take the remaining right part greedily
- [Meeting Rooms 1][def237] - Sort the intervals by starting time and start checking for any overlaps, if there's a overlap then immediately return false
- [N meetings in one room][def240] - Greedy. sort meetings by end time and check how many meetings we can accomodate
- [Non Overlapping Intervals][def241] - sort the intervals by their end time and whenever there's a overlap we need to remove that interval. keep track of lastScheduledMeetingEndTime

<!-- HashTable  -->

### HashTable/Counting

> Revision History: May 14th 2025,

| Problem Details                                                | Description                                                                                                                                                                                                                                                                                                                                                              |
| -------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| [💎 1002. Find Common Characters][def8] `Easy`                 |                                                                                                                                                                                                                                                                                                                                                                          |
| [202. Happy Number][def32] `Easy` `Floyd Cycle Detection`      | Solution1: Store 'n' value in HashMap until (!set.contains(n)) and return true if n becomes 1. Solution2: Use Two-Pointers Fast & Slow and detect cycle using floyds cycle algo. Slow and Fast pointers will move until they become equal. return if slow == 1 or fast == 1                                                                                              |
| [205. Isomorphic Strings][def33] `Easy`                        | Use HashMap and store the key value mappings, next time when key comes again in 's' then it's value should be equal to current char of 't'                                                                                                                                                                                                                               |
| [2090. Word Pattern][def36] `Easy`                             | Same as Isomorphic Strings Problem                                                                                                                                                                                                                                                                                                                                       |
| [💎 2248. Intersection of Multiple Arrays][def37] `Easy`       | Combination of Sorting and Hashing. Super Interesting Problem.                                                                                                                                                                                                                                                                                                           |
| [13. Roman to Integer][def38] `Medium`                         | Put <Character,Value> in a Map and Start processing each char from starting, if **charAt(i) < charAt(i+1)** then subtract charAt(i) from final value otherwise add. "IX" now 1 is less than 10. so first value will be -1 then we add 10 to it. final value becomes 9.                                                                                                   |
| [💎 12. Integer to Roman][def39] `Medium`                      |                                                                                                                                                                                                                                                                                                                                                                          |
| [💎 49. Group Anagrams][def40] `Medium`                        | Just one loop is enough. Sort each string and use that sorted one as key in hashmap and put the actual string as value. Anagrams will be grouped under each key                                                                                                                                                                                                          |
| [💎 128. Longest Consecutive Sequence][def42] `Medium`         | Brute force way is to sort the array and find the longest sequence. Optimized way: Put all the elements in a HashSet and loop through the array(loop through the set to avoid duplicates) again check if (x-1) exists in set or not. If not the x might be the starting point of longest sequence. so start from x and continue checking how many x+1 exists in the set. |
| [💎 Encode & Decode Strings][def43] `Medium`                   |                                                                                                                                                                                                                                                                                                                                                                          |
| [Find the Length of the Longest Common Prefix][def88] `Medium` | SOLVED. store all the prefixes of each num in one array in hashset and iterate through another set to find the longest prefix                                                                                                                                                                                                                                            |
| [💎💎 1497. Check If Array Pairs Are Divisible by k][def97]    | suppose k = 5, now we can say 7 and 3 is a pair whose sum is divisible by 5 by checking the modulo of 7 and 3. Sum of Mod of each number should be equal to k. 7%5 is 2 and 3%5 is 3. so 2 + 3 is 5, that's how we can find a pair.                                                                                                                                      |

<!-- Maths & Bit Manipulation  -->

### 🧮 Maths & Bit Manipulation

> Revision History: May 18th 2025,

| Problem Details                                               | Description                                                                                                                                                                                                                                             |
| ------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [✨ Bit Manipulation Basics][def63]                           | Find the ith Bit(set or not); Swap Two Numbers using XOR; Set the ith Bit of a Number; Clear the ith Bit; Count the set bits                                                                                                                            |
| [💎 67. Add Binary][def69]                                    | Perform the binary sum like normally we do on paper, consider each bit as integer and add to sum. if sum == 2 then carry = 2/2 and do 2%2 for current answer bit. for if sum == 3 then carry = 3/2 and 3 % 2 = 1                                        |
| [Binary to Decimal][def62]                                    |                                                                                                                                                                                                                                                         |
| [✨ Missing Number][def13]                                    |                                                                                                                                                                                                                                                         |
| [389. Find the Difference][def61]                             |                                                                                                                                                                                                                                                         |
| [231. Is Power of 2][def64]                                   | If a number if power of two then and between n & n-1 should be 0. If n is power of two then obviously there will be only one 1 in binary representation.                                                                                                |
| [2220. Minimum Bit Flips to Convert Number][def65]            | we have to flip the bits if they are not same. so xor will be 1 if the two bits are different. so Integer.countBits(start ^ goal)                                                                                                                       |
| [78. Subsets][def66]                                          | Use binary numbers as marking and pick the elements from given array when the bit in each number is 1. This can also be solved using Recursion                                                                                                          |
| [136. Single Number][def67]                                   | Since every number is repeated twice except one. perform xor of all the numbers. Same numbers xor results in zero                                                                                                                                       |
| [137. Single Number II][def68]                                | Check each bit (32 bits) of all given numbers. Sum of the no. of ones at each ith bit position across all numbers should be a multiple of 3; if not, set the ith bit in the result.                                                                     |
| [XOR of numbers from L to R][def70]                           | Start writing xor of numbers from 1 to 8 or 12, you'll observe a pattern. So based on that if we want xor of range getXorOfN(left-1) ^ getXorOfN(right); 4 to 7 means (1 to 7) ^ (1 to 3)                                                               |
| [💎 453. Minimum Moves to Equal Array Elements][def98] `math` | Instead of thinking abt how to increment elements to make them equal, consider how many decrements it would take to reduce all the elements equal to smallest value. Incrementing all elements except one is the same as decrementing only one element. |
| [2657. Find the Prefix Common Array of Two Arrays][def136]    | Use a two 50 digit binary numbers(Long data type) and set the bit at position x for a number x in array. And perform the AND operation for both long numbers to get the common ones                                                                     |
| [2425. Bitwise XOR of All Pairings][def137]                   | Check how many times each number is repeating. **x ^ x = 0**; **x ^ x ^ x = x**                                                                                                                                                                         |
| [3011. Find if Array Can Be Sorted][def138]                   | Divide the array into segments of equal set bits, max of prev segment should be less than min of current segment.                                                                                                                                       |
| [190. Reverse Bits][def140]                                   | check the each bit in a given 32 bit integer and set the bit in result. If 1st bit in `n` is a set then the last bit in result should be set                                                                                                            |
| [3151. Special Array I][def145]                               | Compare the parities of every adjacent pairs and check if they are diff or not, if same return false. use AND and xOR operator                                                                                                                          |
| [1356. Sort Integers by The Number of 1 Bits][def191]         |                                                                                                                                                                                                                                                         |

<!-- Cyclic Sort  -->

### Cyclic Sort

Problems that can be solved using cyclic sort technique

- [Find the Duplicate Number - Using Cyclic Sort][def9]
- [645. Set Mismatch][def44]
- [442. Find all Duplicates in an Array][def49]
- [448. Find All Numbers Disappeared in an Array][def46]
- [268. Missing Number][def47]
- [CSES Missing Number][def92]

<!-- Bucket Sort  -->

### 🪣 Bucket Sort

Problems that can be solved using Bucket sort technique

- [💎 Minimum Time Difference][def85]

### 🤑 Greedy

- [3457. Eat Pizzas!][def150] - Eat all the heaviest pizzas for odd days first, then eat 2nd heavist pizzas for even days.
- [605. Can Place Flowers][def152]
- [455. Assign Cookies][def188]
- [860. Lemonade Change][def189]
- [55. Jump Game][def190] - Assume there are no zeros at all in the array, then we can easily jump to last position. So whenever `0` appears check if we already crossed it by maintaining the maxJumpedIndex. (what is the max index we have gone till now)

<!-- 🌳 Binary Trees 🌳  -->

### 🌳 Binary Trees

> Revision History: June 19th 2025,

- [BT Inorder Traversal][def202] - Left ROOT Right
- [BT Preorder Traversal][def203] - ROOT Left Right
- [BT Postorder Traversal][def204] - Left Right ROOT (for iterative go in reverse - ROOT Right Left and reverse the result in the end)
- [102. Binary Tree Level Order Traversal][def205] - Use a Queue and Go Level By Level
- [Zig Zag or Spiral Traversal][def216] - toggle a boolean value 'isReverse' at each level, based on this boolean value, decide where to add the each element in curr level. either at the front or at the end of list.
- [Find Largest value in each tree row][def206] - Level order Traversal
- [Max Depth of Binary Tree][def207] - **Iterative**: perform level order traversal and calculate levels. **Recursive:** max(left,right). two recursive calls. one will find the left tree count, and another finds the right tree count, now take the max of both
- [Leaf Similar Trees][def220] - Find all the leaf nodes of a tree. we can perform dfs and visit every node. when node.left == null & node.right == null that means it's a leaf node.
- [💎 Binary Tree Paths][def222] - Find paths from root to all leaves. DFS + Backtracking
- [Diameter of Binary Tree][def210] - at every node, LeftHeight + RightHeight is the diameter. use maxDepth() approach
- [Balanced Binary Tree][def215] - DFS. Check height difference of left and right subtree at every node. Use maxDepth() approach
- [Binary Tree Maximum Path Sum][def226] - DFS
- [Same Tree][def208] - perform DFS for both the trees simultaneously. if both becomes null then fine. if any one becomes null and other is not null or p.val != q.val then return false. we need to check this for each node. so at each node we have to check left and right nodes. two recursive calls
- [Symmetric Tree][def209] - Same as "Same Tree" Problem with a slight change. Left,Right & Right,Left should match
- [Vertical Order Traversal of BT][def217] - Group values by col and use `TreeMap<Integer, TreeMap<Integer, List<Integer>>>` to store values in order
- [Top View of BT][def227]
- [Right/Left Side View of Binary Tree][def218] - **Brute Force(Iterative):** Perform Level order traversal and get the last element from each level. **Optimal:** Perform dfs and carry the level number in recursive calls to know which level we are currently in. if the res.size() == level then consider that element
- [Lowest Common Ancestor of BT][def223] - **Brute Force:** Find the paths for two given nodes and check the both paths for how long they are equal, the last equal node will be the LCA. **Optimal:** At every node look for p,q nodes on both left and right sides. when we find p or q then immediately return that node. when we are at a node and we get both left and right as not null, that means we found the two nodes so the current node becomes our answer so return it.

### Binary Search Trees

- [Search in Binary Search Tree][def211] - Find the target in `Log(N)` time. since the tree is BST
- [Find Floor & Ceil in a BST][def212]
- [Insert into a Binary Search Tree][def224] - Find the leaf position where we can insert our new node. Keep going left and right based on the value at each node. (make use of BST property `L < N < R`). Make sure that you don't end up at null, if you are going to end up then that is the position where we have to insert our new node.
- [Delete Node in a BST][def225]
- [Validate Binary Search Tree][def228] - provide min,max range for each node. and check if node.val lies in the given range only or not. if not return false.

<!-- 📈 Graphs 📈  -->

### 📈 Graphs

| Problem Details                                                           | Description                                                                                                                                                                                                                                                                                                                                                    |
| ------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [Represent Graph as Adjacency List when edges[][] and N is given][def244] |                                                                                                                                                                                                                                                                                                                                                                |
| [Find Town Judge - Directed Graph Problem][def257]                        |                                                                                                                                                                                                                                                                                                                                                                |
| [Graph DFS Traversal - Recursive(Stack)][def245]                          |                                                                                                                                                                                                                                                                                                                                                                |
| [Graph BFS Traversal - using Queue][def246]                               |                                                                                                                                                                                                                                                                                                                                                                |
| [BFS & DFS Practice Problem][def247]                                      |                                                                                                                                                                                                                                                                                                                                                                |
| [Count Total Components][def248] : [Code][def249]                         | We have to count the total components in a given undirected graph, Usually during dfs/bfs traversal we start from one node and visit all other nodes because graph is a single component, but here the given graph can have disconnected components, so we have to run another loop and assume every node as starting node and count the total components      |
| [Number of Provinces][def250]                                             | Almost same as above problem, here we can consider given isConnect matrix as Adj Matrix and use it for bfs/dfs traversal.                                                                                                                                                                                                                                      |
| [💎 Number of Islands - **DFS**][def251]                                  | One of my Fav 🌻 Graph problem, initially it looked like a provinces problem but the given matrix is `m x n` so we can't do typical dfs or bfs. we have to gather all the neighbour land, so when we found a land piece explore all the neighbours(top,right,down,left) and if it is a land as then merge it, repeat this recursively for each neighbour land. |
| [Flood Fill - **DFS**][def252]                                            | Similar to Islands problem                                                                                                                                                                                                                                                                                                                                     |
| [Max Area of Island][def253]                                              | Simlar to Islands problem                                                                                                                                                                                                                                                                                                                                      |
| [Island Perimeter][def265]                                                |                                                                                                                                                                                                                                                                                                                                                                |
| [Surrounded Region][def256]                                               | first find out which are not surrounded by traversing on the boundaries. in the end go through the board again and turn the unsurrounded ones back to O and the uneffected ones(after doing dfs) into X                                                                                                                                                        |
| [Rotting Oranges - **BFS**][def254]                                       | We have to calculte the min time to turn fresh ones into rotten ones, and two rotten ones can simultaneously turn their neighbours into rotten ones                                                                                                                                                                                                            |
| [Detect a Cycle in an undirected graph][def258]                           | Can be solved using both BFS and DFS. Keep track of current parent, if any neighbour of current node is already visited and if it is not the parent then we have a cycle, cuz some other guy visited the neighbour already                                                                                                                                     |
| [Bipartite Graph][def260]                                                 | (BFS and DFS both) check if we can color a graph such that no two adjacent nodes have same color. So All linear graphs without any cycle can be bipartite, and the graphs which has cycles if there's any cycle with odd nodes it can't be Bipartite                                                                                                           |
| **🌻 DAG - Direct Acyclic Graph 🌻**                                      |                                                                                                                                                                                                                                                                                                                                                                |
| [🧬 Topological Sort DAG - Algorithm **DFS & BFS**][def261]               | **DFS:** keep doing dfs. node with no more neighbours will be pushed to stack first, so that it comes last in the topo order <br /> <br /> **BFS:** Kahn's Algorithm - calculate the indegree of each node and push nodes with indegree == 0 first into the queue... BFS approach helps to detect cycle as well                                                |
| [Detect Cycle in Directed Graph][def262]                                  | **DFS:** algorithm which used for undirected graph won't work here, we need to maintain `visited` & `inStack` arrays. unmark the `inStack` while coming back <br /> <br /> **BFS:** Khan's Algorithm - topo order `array.length` should be equal to N                                                                                                          |
| [Course Schedule][def263]                                                 | Same as Detect Cycle in Directed Graph                                                                                                                                                                                                                                                                                                                         |
| [Course Schedule 2][def264]                                               | Topological Sort : Khan's Algorithm                                                                                                                                                                                                                                                                                                                            |

<!-- Dynamic Programming  -->

### Dynamic Programming

| Problem Details                                    | Description                                                                             |
| -------------------------------------------------- | --------------------------------------------------------------------------------------- |
| [💎 121. Best Time to Buy and Sell a Stock][def30] | Keep track of min price before the ith price and subtract min price from current price. |

### CSES Problem Set

**Introductory Problems:** [Weird Algorithm][def91], [Missing Number][def92], [Repetitions][def93], [Increasing Array][def94], [Permutations][def95]

**Dynamic Programming:**

[def]: https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/description/
[def2]: https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
[def3]: https://leetcode.com/problems/intersection-of-two-arrays/
[move_zeros]: LeetCode/Arrays/MoveZeros
[def4]: https://leetcode.com/problems/minimum-size-subarray-sum/description/
[def5]: https://leetcode.com/problems/product-of-array-except-self/description/
[def6]: https://leetcode.com/problems/rotate-array/description/
[def7]: https://leetcode.com/problems/valid-anagram/description/
[def8]: LeetCode/HashTable/1002FindCommonCharacters.java
[def9]: LeetCode/Arrays/FindTheDuplicateNumber.java
[def10]: https://leetcode.com/problems/valid-mountain-array/description/
[def11]: https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/
[def12]: LeetCode/Arrays/MajorityElement_169/MajorityElement.java
[def13]: LeetCode/BitManipulation/MissingNumber_268
[def14]: LeetCode/Strings/125ValidPallindrome
[def15]: LeetCode/TwoPointers/ValidPallindromeII_680
[def16]: Algorithms/Searching/LinearSearch
[def17]: LeetCode/Arrays/ThreeSum_15
[def18]: LeetCode/Arrays/NumberOfArithmeticTriplets_2367
[def19]: Algorithms/Searching/BinarySearch
[def20]: LeetCode/Arrays/RemoveDuplicatesFromSortedArrayII
[def21]: https://leetcode.com/problems/find-smallest-letter-greater-than-target/
[def22]: https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
[def23]: LeetCode/Arrays/PeakIndexInaMountainArray
[def24]: https://leetcode.com/problems/find-in-mountain-array/description/
[def25]: LeetCode/Arrays/35SearchInsertPosition
[def26]: LeetCode/Arrays/SearchInRotatedSortedArray
[def27]: LeetCode/Arrays/SearchInRotatedSortedArrayII
[def28]: Algorithms/Sorting/BubbleSort.java
[def29]: Algorithms/Sorting/SelectionSort.java
[def30]: LeetCode/Arrays/BestTimeToBuyAndSellStock/BestTimeToBuyAndSellStock.java
[def31]: Algorithms/Sorting/InsertionSort.java
[def32]: LeetCode/HashTable/HappyNumber
[def33]: LeetCode/HashTable/IsomorphicStrings
[def34]: https://coherent-candle-2b4.notion.site/Java-Cheat-Sheet-8c0f17dceeea4c949c001802df290977?pvs=4
[def35]: RandomProblems/StackGoogleQuestion.java
[def36]: LeetCode/HashTable/WordPattern
[def37]: LeetCode/HashTable/IntersectionOfMultipleArrays
[def38]: LeetCode/HashTable/RomanToInteger
[def39]: LeetCode/HashTable/IntegerToRoman
[def40]: LeetCode/HashTable/GroupAnagrams
[def41]: DataStructures/HashMap
[def42]: LeetCode/HashTable/LongestConsecutiveSequence
[def43]: LeetCode/HashTable/EncodeDecodeStrings
[def44]: https://leetcode.com/problems/set-mismatch/
[def45]: https://leetcode.com/problems/find-all-duplicates-in-an-array/description/
[def46]: https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/
[def47]: https://leetcode.com/problems/missing-number/description/
[def48]: LeetCode/TwoPointers/MergeSortedArray
[def49]: LeetCode/Arrays/FindAllDuplicatesInArray
[def51]: OOPS_JAVA/VarArgs.java
[def52]: OOPS_JAVA/LoopsAndConditions.java
[def53]: OOPS_JAVA/StringsIntro.java
[def54]: OOPS_JAVA/StringsIntro.java
[def55]: LeetCode/Arrays/FirstMissingPositive
[def56]: https://leetcode.com/problems/rotate-string/description/
[def57]: Algorithms/Recursion
[def58]: LeetCode/TwoPointers/ReverseWordsInString
[def59]: RandomProblems/Patterns.java
[def60]: Algorithms/Recursion/Pow.java
[def61]: https://leetcode.com/problems/find-the-difference/description/
[def62]: Algorithms/Maths/BinaryToDecimal.java
[def63]: Algorithms/Maths/BitManipulationBasics.java
[def64]: https://leetcode.com/problems/power-of-two/description/
[def65]: LeetCode/BitManipulation/MinBitFlipsToConvert
[def66]: LeetCode/BitManipulation/SubSets
[def67]: https://leetcode.com/problems/single-number/
[def68]: LeetCode/BitManipulation/SingleNumberII
[def69]: LeetCode/BitManipulation/AddBinary
[def70]: https://www.geeksforgeeks.org/problems/find-xor-of-numbers-from-l-to-r/1
[def71]: Algorithms/Maths/SieveOfEratosthenes.java
[def72]: Algorithms/Maths/SquareRootOfNumber.java
[def73]: Algorithms/Maths/GCD.java
[def74]: LeetCode/Arrays/GameOfLife
[def50]: Algorithms/Recursion/CountZerosInNumber.java
[def76]: https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/description/
[def77]: Algorithms/Recursion/RecursionOnArrays.java
[def75]: Algorithms/Recursion/PatternsUsingRecursion.java
[def78]: Algorithms/Sorting/MergeSort2WayIterative.java
[def79]: Algorithms/Sorting/MergeSort.java
[def80]: Algorithms/Recursion/SortingUsingRecursion.java
[def81]: Algorithms/Recursion/RecursionOnStrings.java
[def82]: Algorithms/Sorting/3-way-merging.py
[def83]: Algorithms/Recursion/PowerOfTwo.java
[def84]: LeetCode/Arrays/FindMissingObservations
[def85]: LeetCode/Maths/MinimumTimeDifference
[def86]: DataStructures/Arrays/SecondLargestElementInArray/SecondLargestElementInArray.go
[def87]: https://leetcode.com/problems/duplicate-zeros/description/
[def88]: https://leetcode.com/problems/find-the-length-of-the-longest-common-prefix/?envType=daily-question&envId=2024-09-24
[def89]: LeetCode/Arrays/01DuplicateZeros/duplicate_zeros.go
[def90]: LeetCode/Strings/LongestCommonPrefix
[def91]: RandomProblems/WeirdAlgorithm.java
[def92]: RandomProblems/MissingNumber.java
[def93]: RandomProblems/CSESRepetitions.java
[def94]: RandomProblems/CsesIncreasingArray.java
[def95]: RandomProblems/CSESPermutations.java
[def96]: LeetCode/Sorting/MaximizeTheTotalHeightOfUniqueTowers
[def97]: LeetCode/HashTable/CheckIfArrayPairsAreDivisibleByK
[def98]: https://leetcode.com/problems/minimum-moves-to-equal-array-elements/description/
[def99]: LeetCode/Arrays/209MinimumSizeSubarraySum
[def100]: LeetCode/Stack/2696
[def101]: DataStructures/Strings/substring_subsequence_permutations.go
[def102]: LeetCode/TwoPointers/LongestSubarrayof1sAfterRemovingOne
[def103]: LeetCode/Heaps/LC2530
[def104]: LeetCode/HashTable/LongestSubarrayWithSumK
[def105]: LeetCode/TwoPointers/LC1423
[def106]: LeetCode/TwoPointers/LC3
[def107]: LeetCode/TwoPointers/LC1004
[def108]: https://takeuforward.org/plus/data-structures-and-algorithm/sliding-window-and-2-pointer/longest-and-smallest-window-problems/longest-substring-with-at-most-k-distinct-characters
[def109]: LeetCode/TwoPointers/LC904
[def110]: LeetCode/TwoPointers/MaximumSumOfDistinctSubarraysWithLengthK
[def111]: https://leetcode.com/problems/find-all-anagrams-in-a-string/description/
[def112]: https://leetcode.com/problems/permutation-in-string/
[def113]: LeetCode/TwoPointers/LC1358
[def114]: LeetCode/TwoPointers/LC424
[def115]: https://leetcode.com/problems/contiguous-array/
[def116]: https://leetcode.com/problems/binary-subarrays-with-sum/description/
[def117]: https://leetcode.com/problems/subarray-sum-equals-k/description/
[def118]: LeetCode/TwoPointers/LC992
[def119]: LeetCode/TwoPointers/LC2302
[def120]: https://leetcode.com/problems/subarray-product-less-than-k/description/
[def121]: https://leetcode.com/problems/count-the-number-of-good-subarrays/
[def122]: Algorithms/Searching/BinarySearch
[def123]: LeetCode/Arrays/LC2563
[def124]: https://leetcode.com/problems/koko-eating-bananas/description/
[def125]: https://leetcode.com/problems/find-the-power-of-k-size-subarrays-i/?envType=daily-question&envId=2024-11-16
[def126]: https://leetcode.com/problems/minimized-maximum-of-products-distributed-to-any-store/description/?envType=daily-question&envId=2024-11-14
[def127]: LeetCode/Strings/LC451
[def128]: https://leetcode.com/problems/subsets/description/
[def129]: LeetCode/RecursionBacktracking/LC1498
[def130]: LeetCode/RecursionBacktracking/CombinationSum
[def131]: LeetCode/RecursionBacktracking/CombinationSum2
[def132]: LeetCode/RecursionBacktracking/LC17
[def133]: LeetCode/RecursionBacktracking/SubsetsII
[def134]: LeetCode/RecursionBacktracking/LC77Combinations
[def135]: LeetCode/Strings/LC1769
[def136]: LeetCode/BitManipulation/LC2657
[def137]: https://leetcode.com/problems/bitwise-xor-of-all-pairings/description/?envType=daily-question&envId=2025-01-16
[def138]: https://leetcode.com/problems/find-if-array-can-be-sorted/?envType=daily-question&envId=2024-11-06
[def139]: LeetCode/Strings/LC2259
[def140]: https://leetcode.com/problems/reverse-bits/
[def141]: https://leetcode.com/problems/count-elements-with-strictly-smaller-and-greater-elements/description/
[def142]: LeetCode/Arrays/LC229
[def143]: LeetCode/Stack/LC1910
[def144]: https://leetcode.com/problems/check-if-a-word-occurs-as-a-prefix-of-any-word-in-a-sentence/description/
[def145]: https://leetcode.com/problems/special-array-i/description/?envType=daily-question&envId=2025-02-01
[def146]: LeetCode/Arrays/SpecialArrayII
[def147]: Algorithms/DynamicConnectivity
[def148]: https://leetcode.com/problems/product-of-the-last-k-numbers/description/?envType=daily-question&envId=2025-02-14
[def149]: OOPS_JAVA
[def150]: https://leetcode.com/problems/eat-pizzas/description/
[def151]: https://leetcode.com/problems/minimum-operations-to-reduce-x-to-zero/description/
[def152]: https://leetcode.com/problems/can-place-flowers/description/
[def153]: https://leetcode.com/problems/asteroid-collision/description/
[def154]: https://leetcode.com/problems/merge-two-2d-arrays-by-summing-values/description/?envType=daily-question&envId=2025-03-02
[def155]: LeetCode/Arrays/LC2529
[def156]: LeetCode/Arrays/LC3488
[def157]: OOPS_JAVA/CustomComparator.java
[def158]: LeetCode/Sorting/LC1636
[def159]: https://leetcode.com/problems/maximum-value-of-an-ordered-triplet-ii/description/
[def160]: DataStructures/LinkedLists
[def161]: https://takeuforward.org/plus/dsa/linked-list/logic-building/add-two-numbers-in-ll
[def162]: https://leetcode.com/problems/remove-duplicates-from-sorted-list/description/
[def163]: https://leetcode.com/problems/merge-two-sorted-lists/description/
[def164]: https://leetcode.com/problems/design-linked-list/
[def165]: https://leetcode.com/problems/middle-of-the-linked-list/description/
[def166]: https://leetcode.com/problems/linked-list-cycle-ii/description/
[def167]: https://leetcode.com/problems/linked-list-cycle/description/
[def168]: https://leetcode.com/problems/sort-list/description/
[def169]: https://leetcode.com/problems/reverse-linked-list/description/
[def170]: DataStructures/LinkedLists/PalindromeLinkedList.java
[def171]: https://leetcode.com/problems/odd-even-linked-list/
[def172]: https://leetcode.com/problems/reorder-list/description/
[def173]: https://takeuforward.org/plus/dsa/beginner-problem/basic-strings/sort-characters-by-frequency
[def174]: https://leetcode.com/problems/design-circular-queue/
[def175]: https://takeuforward.org/plus/dsa/stack-and-queues/implementation/implement-stack-using-arrays
[def176]: https://leetcode.com/problems/min-stack/
[def177]: https://leetcode.com/problems/next-greater-element-i/
[def178]: https://leetcode.com/problems/next-greater-element-ii/
[def179]: https://leetcode.com/problems/final-prices-with-a-special-discount-in-a-shop/
[def180]: https://leetcode.com/problems/daily-temperatures/
[def181]: https://leetcode.com/problems/sum-of-subarray-minimums/
[def182]: LeetCode/Stack/LC735
[def183]: https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/
[def184]: https://leetcode.com/problems/single-element-in-a-sorted-array/
[def185]: https://leetcode.com/problems/minimum-number-of-swaps-to-make-the-string-balanced/description/
[def186]: https://leetcode.com/problems/sum-of-subarray-ranges/
[def187]: https://leetcode.com/problems/lru-cache/
[def188]: https://leetcode.com/problems/assign-cookies/description/
[def189]: https://leetcode.com/problems/lemonade-change/
[def190]: https://leetcode.com/problems/jump-game/
[def191]: https://leetcode.com/problems/sort-integers-by-the-number-of-1-bits/
[def192]: https://leetcode.com/problems/remove-linked-list-elements/description/
[def193]: https://leetcode.com/problems/maximum-subarray/description/
[def194]: https://leetcode.com/problems/subarray-sums-divisible-by-k/description/
[def195]: https://leetcode.com/problems/sort-colors/
[def196]: https://leetcode.com/problems/transpose-matrix/
[def197]: https://leetcode.com/problems/rotate-image/description/
[def198]: https://leetcode.com/problems/set-matrix-zeroes/
[def199]: Algorithms/Backtracking/Maze.java
[def200]: LeetCode/Arrays/MergeIntervals/MergeIntervals.java
[def201]: https://leetcode.com/problems/search-a-2d-matrix/
[def202]: https://leetcode.com/problems/binary-tree-inorder-traversal/
[def203]: https://leetcode.com/problems/binary-tree-preorder-traversal/
[def204]: https://leetcode.com/problems/binary-tree-postorder-traversal/
[def205]: https://leetcode.com/problems/binary-tree-level-order-traversal/description/
[def206]: https://leetcode.com/problems/find-largest-value-in-each-tree-row/
[def207]: https://leetcode.com/problems/maximum-depth-of-binary-tree/
[def208]: https://leetcode.com/problems/same-tree/
[def209]: https://leetcode.com/problems/symmetric-tree/
[def210]: https://leetcode.com/problems/diameter-of-binary-tree/
[def211]: https://leetcode.com/problems/search-in-a-binary-search-tree/
[def212]: https://takeuforward.org/plus/dsa/binary-search-trees/theory-and-basics/floor-and-ceil-in-a-bst
[def213]: https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/
[def214]: https://leetcode.com/problems/minimum-remove-to-make-valid-parentheses/
[def215]: https://leetcode.com/problems/balanced-binary-tree/description/
[def216]: https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/
[def217]: https://leetcode.com/problems/vertical-order-traversal-of-a-binary-tree/
[def218]: https://leetcode.com/problems/binary-tree-right-side-view/
[def219]: https://leetcode.com/problems/number-of-recent-calls/?envType=study-plan-v2&envId=leetcode-75
[def220]: https://leetcode.com/problems/leaf-similar-trees/description/?envType=study-plan-v2&envId=leetcode-75
[def221]: https://leetcode.com/problems/determine-if-two-strings-are-close/?envType=study-plan-v2&envId=leetcode-75
[def222]: https://leetcode.com/problems/binary-tree-paths/
[def223]: https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/
[def224]: https://leetcode.com/problems/insert-into-a-binary-search-tree/
[def225]: https://leetcode.com/problems/delete-node-in-a-bst/
[def226]: https://leetcode.com/problems/binary-tree-maximum-path-sum/
[def227]: https://takeuforward.org/plus/dsa/binary-trees/faqs/top-view-of-bt
[def228]: https://leetcode.com/problems/validate-binary-search-tree/description/
[def229]: https://leetcode.com/problems/string-compression/
[def230]: https://leetcode.com/problems/kth-largest-element-in-an-array/
[def231]: https://leetcode.com/problems/last-stone-weight/
[def232]: LeetCode/Heaps/RelativeRanks
[def233]: https://leetcode.com/problems/take-gifts-from-the-richest-pile/description/
[def234]: https://leetcode.com/problems/top-k-frequent-elements/
[def235]: LeetCode/Heaps/LC347
[def236]: https://leetcode.com/problems/find-median-from-data-stream/description/
[def237]: https://neetcode.io/problems/meeting-schedule
[def238]: https://neetcode.io/problems/meeting-schedule-ii?list=neetcode150
[def239]: LeetCode/IntervalProblems/InsertInterval
[def240]: https://takeuforward.org/plus/dsa/greedy-algorithms/scheduling-and-interval-problems/n-meetings-in-one-room?tab=submissions
[def241]: https://leetcode.com/problems/non-overlapping-intervals/
[def242]: https://visualgo.net/en/heap
[def243]: https://leetcode.com/problems/count-special-triplets/description/
[def244]: DataStructures/Graphs/GraphAsAdjacencyList_01.java
[def245]: DataStructures/Graphs/Graph_DFS_02.java
[def246]: DataStructures/Graphs/Graph_BFS_03.java
[def247]: https://takeuforward.org/plus/dsa/graph/theory-and-traversals/traversal-techniques?tab=editorial
[def248]: https://takeuforward.org/plus/dsa/graph/theory-and-traversals/connected-components
[def249]: DataStructures/Graphs/CountComponents.java
[def250]: LeetCode/Graphs/NumberOfProvinces
[def251]: LeetCode/Graphs/NumberOfIslands
[def252]: https://leetcode.com/problems/flood-fill/
[def253]: https://leetcode.com/problems/max-area-of-island/
[def254]: LeetCode/Graphs/RottingOranges
[def255]: https://leetcode.com/problems/k-closest-points-to-origin/
[def256]: https://leetcode.com/problems/surrounded-regions/
[def257]: https://leetcode.com/problems/find-the-town-judge/
[def258]: DataStructures/Graphs/DetectCycleUndirectedGraph.java
[def259]: https://leetcode.com/problems/verifying-an-alien-dictionary/
[def260]: https://leetcode.com/problems/is-graph-bipartite/
[def261]: DataStructures/Graphs/TopologicalSortGraph.java
[def262]: DataStructures/Graphs/CycleDetectionDirectedGraph.java
[def263]: https://leetcode.com/problems/course-schedule/description/
[def264]: https://leetcode.com/problems/course-schedule-ii/
[def265]: https://leetcode.com/problems/island-perimeter/
[def266]: LeetCode/TwoPointers/LC76
