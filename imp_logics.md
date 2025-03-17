## God Level Logics

### Divisors of Number

```go
/*

LINK -> https://leetcode.com/problems/perfect-number/description/

Instead of iterating from 1 to num, we can iterate only upto the √n

if 2 is the factor of 28 then 28/2 is also a factor which is 14

and √num * √num = num (so we iterate only up to √num)
*/
func checkPerfectNumber(num int) bool {
	sum := 0
	for i := 1; i*i <= num; i++ {
		if num%i == 0 {
			fmt.Println(i)
			// now i is one factor
			// eg: 28%2 == 0, so 2 is one factor. and another factor is 28/2 = 14
			sum += i
			if i*i != num {
				// if i = 4 and num = 16 the we will add 4 again if (i*i != num) this check is not performed
				/// adding another factor as well
				sum += num / i
				fmt.Println("Another factor is :", num/i)
			}
		}
	}
	// when i is 1 we are adding both 1 and num to sum (1 is first factor and another factor is num/1 = num)
	// so as per the question we need to exclude the num itself
	return sum-num == num
}
```

<!-- Generate all the prefixes of a number -->

### Print all the prefixes of Number

```go
/*

All Prefixes of number 98798 are:
9
98
987
9879
98798

To get 9 we need to divide 98798 with 10000

 */

func printPrefixesOfNum(x int) {
	divisor := 1
	for divisor <= x/10 {
		divisor *= 10
	}

	for divisor > 0 {
		fmt.Println(x / divisor)
		divisor /= 10
	}
}

```

### Find the shortest distance between two elements in a circular array

```java

// Note: Logic from 3488. Closest Equal Element Queries Problem

// [10, 11, 22, 33, 44] shortest distance between 11,44 is 2. (array is circular)
// i and j are the indexes of 11 and 44
int shortestDistance = Math.min(Math.abs(j - i), len - Math.abs(i - j));
```

### Find the left and right elements of an element in a circular array

```java
// [12, 13, 8] - find the left and right elements of 12. Left is 8 and right is 13
int elementIndex = 0;

int leftElementIndex = list.get((elementIndex - 1 + size) % size);
int rightElementIndex = list.get((elementIndex + 1) % size);

```

### Custom Comparators in Java

```java
	int[] arr = new int[] { 1, 2, 4, 2, 2, 0 };
	// Collections.sort(arr); ❌ Collections.sort() can be used only on collections. List<T>
	Arrays.sort(arr); // ascending order
	// For sorting array in descending order we need to use custom comparator
	// and Custom Comparator doesn't work on primitives

	Integer[] arrObj = new Integer[] { 1, 2, 4, 2, 2, 0 };
	// Collections.sort(arrObj); ❌ Collections.sort() can be used only on collections. List<T>
	Arrays.sort(arrObj, (a, b) -> {
	    return b - a;
	});
	// or
	Arrays.sort(arrObj, Collections.reverseOrder());


	/*
	 * Collections
	 */
	List<Integer> lis = new ArrayList<>(Arrays.asList(1, 6, 4, 0, 2, 999, 777));
	// different ways to sort the List type
    Collections.sort(lis);
    Collections.sort(lis, Collections.reverseOrder());
    lis.sort((a, b) -> b - a);
    lis.sort(null);

```
