### Basic Programs
- [Solution.java](./Solution.%20Java)
  > Basic Java structure with main method. Used as a template for all programs.

### Numbers
- [sumofdigit.java](./sumofdigit.java)
  > Takes a number and adds its digits. Logic uses `while(n>0)` and `n%10` to get last digit.

- [palindrome.java](./palindrome.java)
  > Checks if a number reads the same from both sides. Reverses the number and compares with original.

### Pattern Questions
- [hollow_ractagle](./hollow_ractagle)
  > Prints only the border of rectangle. Uses condition `i==1 || i==n || j==1 || j==n` to print `*` on border.

- [butterfly_pattern.java](./butterfly_pattern.java)
  > Combination of two triangles with spaces in middle. Uses 2 loops for upper half and lower half.
 [diamond_pattern.java](./diamond_pattern.java)
  > Diamond pattern using 2 pyramids. Upper half and lower half logic.
  **Output:**_
    *
   _
  _
  _
   _
    *
     _javascript
- [floyds_triangle.java](./floyds_triangle.java)
  > Floyd's triangle with continuous numbers. Counter variable used.
  **Output:**1
  2 3
  4 5 6
  7 8 9 10
  11 12 13 14 15javascript
- [hollow_rhombus.java](./hollow_rhombus.java)
  > Hollow rhombus - border only of slanted square.
  **Output:**_
     - _
    - _
_javascript
- [inverted_and_half_pyramidwithnumber](./inverted_and_half_pyramidwithnumber)
  > Inverted pyramid with numbers 1 to n-i+1.
  **Output:**1 2 3 4 5
  1 2 3 4
  1 2 3
  1 2
  1javascript
- [zero_one_triangle](./zero_one_triangle)
  > 0-1 triangle based on (i+j) even -> 1 else 0.
  **Output:**1
  0 1
  1 0 1
  0 1 0 1
  1 0 1 0 1javascript
- [solid_rhombus.java](./solid_rhombus.java)
  > Solid rhombus - spaces `n-i` + `n` stars logic.
  **Output:**_
     _
    _
   _

## arrays

- [arraysresult.java](arraysresult.java)
 
  Takes marks of 3 subjects - Physics, Chemistry, Maths. Prints them, updates Maths marks to 100 and calculates the percentage. Shows how to take input, print and update value in an Array.
output
87
89
97
phys:87
chem:89
math:97
math:100 percentage=92.0%

- [ArrayFunction.java](ArrayFunction.java)

  Passes array to a function and increases each mark by 1. Shows how arrays are passed by reference in Java.

  output: 98 99 100
  
- [LinearSearch.java](LinearSearch.java)

  Searches a key in an array using Linear Search. Returns the index if found, otherwise returns -1.
  
  Output: key is at index:4
  
- [LargestSmallest.java](LargestSmallest.java)
 
  Finds the largest and smallest value in an array using Integer.MIN_VALUE and MAX_VALUE.
  
   Output: smallest value is: 1, largest value is: 8
  
- [reverseanarray.java](reverseanarray.java)
  Reverses an array by swapping first and last elements using two pointers. Uses a temp variable for swapping.

  Output: 10 8 6 4 2
  
- [binarysearch.java](binarysearch.java)
  
  Searches a key in a sorted array using Binary Search. Divides the array in half each time to find the key faster than Linear Search. Returns the index if found, otherwise returns -1.

  Output: index for key is:2
- [printpairs.java](printpairs.java)
  Prints all pairs of an array using nested loops. Each element is paired with all elements after it.
  
  Output: (2,4)(2,6)(2,8)(2,10) (4,6)(4,8)(4,10) (6,8)(6,10) (8,10)
  
- [print-total-pairs.java](print-total-pairs.java)
- 
  Prints all pairs of an array using nested loops and counts total pairs using a counter variable.
  
  Output: (2,4)(2,6)(2,8)(2,10) (4,6)(4,8)(4,10) (6,8)(6,10) (8,10) totall pairs=10

- [printsubarrays.java](printsubarrays.java)
  Prints all subarrays of an array using three nested loops and counts total subarrays.
  2 
2 4 
2 4 6 
2 4 6 8 
2 4 6 8 10 

4 
4 6 
4 6 8 
4 6 8 10 

6 
6 8 
6 8 10 

8 
8 10 

10 

total sub array=15
  
  Output: total sub array=15
