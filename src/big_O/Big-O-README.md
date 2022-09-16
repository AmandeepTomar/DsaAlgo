### Big O Annotations

It's an metrics to define the efficiency of an Algorithm.

**Time Complexity** it's means when the no of input or size of input increased the time of execution on function or code
also increased, is called time complexity.

Big O Notations

- **Big-O** Worst case, Maximum time taken by an algorithm to compute.
- **Big-Omega** best case , Minimum time taken to compute algorithm.
- **Big-theta** Average case, Average time taken to compute the algorithm.
- Example
    - Suppose we have an array of n length and required to find a element. Array is 0 to N.
    - Worst Case O(100) to find 100 in 0 to 100 array.
    - Best Case Omega(1) to 0 in 0 to 100 array.
    - Average Case theta(100/2) to find 55 in 0 to 100 array.
      Run time Complexity
- **Constant Complexity**
    - O(1), Fetching a specific elements from an array. Like we need to fetch third index element from array.
- **Linear Complexity**
    - O(N), Search a element in N length array.
- **Logarithmic Complexity**
    - O(logN) , for example when we do not need to traverse the all elements.
    - Like in Binary search, we have an array of 16 elements N = 16. So in maximum we will get answer in 4 steps. i.e 2
      pow k = long N -> K.
- **Quadratic Complexity**
    - O(N pow 2), Each element visit twice. Like for 0-> n { for 0->n {traversal}}.
- **Exponential Complexity**
    - O(2 pow N), As the input increase the growth rate double itself. Double recursion in fibonacci