# [506. Relative Ranks](https://leetcode.com/problems/relative-ranks/description/)

You are given an integer array <code>score</code> of size <code>n</code>, where <code>score[i]</code> is the score of the <code>i^th</code> athlete in a competition. All the scores are guaranteed to be **unique** .

The athletes are **placed**  based on their scores, where the <code>1^st</code> place athlete has the highest score, the <code>2^nd</code> place athlete has the <code>2^nd</code> highest score, and so on. The placement of each athlete determines their rank:

- The <code>1^st</code> place athlete's rank is <code>"Gold Medal"</code>.
- The <code>2^nd</code> place athlete's rank is <code>"Silver Medal"</code>.
- The <code>3^rd</code> place athlete's rank is <code>"Bronze Medal"</code>.
- For the <code>4^th</code> place to the <code>n^th</code> place athlete, their rank is their placement number (i.e., the <code>x^th</code> place athlete's rank is <code>"x"</code>).

Return an array <code>answer</code> of size <code>n</code> where <code>answer[i]</code> is the **rank**  of the <code>i^th</code> athlete.

**Example 1:** 

```
Input: score = [5,4,3,2,1]
Output: ["Gold Medal","Silver Medal","Bronze Medal","4","5"]
Explanation: The placements are [1^st, 2^nd, 3^rd, 4^th, 5^th].```

**Example 2:** 

```
Input: score = [10,3,8,9,4]
Output: ["Gold Medal","5","Bronze Medal","Silver Medal","4"]
Explanation: The placements are [1^st, 5^th, 3^rd, 2^nd, 4^th].

```

**Constraints:** 

- <code>n == score.length</code>
- <code>1 <= n <= 10^4</code>
- <code>0 <= score[i] <= 10^6</code>
- All the values in <code>score</code> are **unique** .