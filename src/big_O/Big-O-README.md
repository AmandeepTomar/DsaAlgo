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
    - O(2 pow N), As the input increase the growth rate double itself. Double recursion in fibonacci.

```java
/**
 * for example when we add complexity like (N+N) and when we multiply like (N*N)
 * */
class Example {
    void additionOfComplexity() {
        for (i = 0; i < N; i++) {
            print(i);
        }
        for (i = 0; i < M; i++) {
            print(i);
        }
    }

    // it is like N+M => O(N+M)
    void multiplicationOfComplexity() {
        for (i = 0; i < N; i++) {
            for (j = 0; j < M; j++) {
                print(i + " and" + j);
            }
        }
    }
    // it is like N*M => O(N*M)

}


```

#### Measure the code complexity using Big O. 
- **O(n)**. Any if and assignment statement that are executed only once regardless of the size of the problem.
- **O(N)**. Any simple loops from o to N. 
- **O(n pow 2)**.  A nested loop of the same type.
- **O(long n )**. A loop in which the controlling parameter is divide by two at each steps.
- When dealing with multiple statements just add them. 
```java
class findComplexity{
    int findMaximumElement(int[] arr){
        int max = -1; //-------------->O(1)
        for (int i = 0;i<arr.length;i++){ //-------------->O(N)
            if(max<arr[i])//-------------->O(1)
                max=arr[i];//-------------->O(1)
        }
        return max; // -------------->O(1)
    }
}
// T(N)=O(1)+O(N)+O(1)+O(1)+O(1)
// T(N)=O(4)+O(N)
// T(N)=O(N+4)
// T(N)=O(N).


```
