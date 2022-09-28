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
- **O(n pow 2)**. A nested loop of the same type.
- **O(long n )**. A loop in which the controlling parameter is divide by two at each steps.
- When dealing with multiple statements just add them.

```java
class findComplexity {
    /**
     *    // T(N)=O(1)+O(N)+O(1)+O(1)+O(1)
     // T(N)=O(4)+O(N)
     // T(N)=O(N+4)
     // T(N)=O(N).
     * */
    int findMaximumElement(int[] arr) {
        int max = -1; //-------------->O(1)
        for (int i = 0; i < arr.length; i++) { //-------------->O(N)
            if (max < arr[i])//-------------->O(1)
                max = arr[i];//-------------->O(1)
        }
        return max; // -------------->O(1)
    }


    /**
     * int arr1[] = {11, 4, 12, 9};
     * Now Resursive call
     * max(arr(4-1),findMaximum(arr,3))=>max(9,12)
     * -> findMaximum(arr,2)---->max(arr(2),11) => max(12,11)
     * -> findMaximum(arr,1) ---> max(arr[1],11)==>max(4,11)
     * its time complexity is O(N).
     * M(n) = O(1)+M(N-1)
     * M(1) = O(1)+M(1-1)=>O(1)
     * M(n-1)=O(1)+M((n-1)-1)
     * M(n-2)=O(1)+M((n-2)-1)
     * <p>
     * = 1+M(n-1)
     * = 1+1+M(n-2)
     * = 3+M(N-3)
     * = lets make constant a variable a
     * =a+M(n-a)
     * = lest a ==1
     * = n-1+M(n-(n-1))
     * = n
     */
    private int findMaximum(int[] arr, int length) { // --------->M(n)
        if (length == 1) return arr[0]; // ---------->O(1)
        return Math.max(arr[length - 1], findMaximum(arr, length - 1));//------>M(n-1)
    }

    /**
     * How to measure multiple recursive calls time complexity
     * it's like if we call num=4.
     * f(4)
     * - f(3) + f(3) two times
     * this will repeat till f(1).
     * Depth of tree is 4.
     * Level 0 1 node
     * Level 1 => 2
     * Level 2 => 4
     * Level 3 => 8.
     * 2 pow 0 + 2 pow 1 + .... + 2 pow n = 2 pow(n)-1.
     * we can write O(2 pow n).
     * its like O(branches pow depth).
     * like we have two branches because we calling it two time (n-1) +(n-1).
     */
    private int findComplexity(int num) {
        if (num <= 1) return 1;
        return findComplexity(num - 1) + findComplexity(num - 1);
    }

    /**
     * complexity of findFIbComplexity = branches pow(depths)
     * => 2 pow(N).
     * Now Complexity of findTimeComplexityOfFib =>
     * findFIbComplexity(1) = 2 pow 1. steps
     * findFIbComplexity(2) = 2 pow 2.
     * findFIbComplexity(3) = 2 pow 3.
     * findFIbComplexity(n) = 2 pow n.
     * <p>
     * total work = 2 pow 1. + 2 pow 2 + 2 pow 3+...........+2 pow n.
     * = 2 pow n+1 -2
     * = O(2 pow N).
     */
    private static void findTimeComplexityOfFib(int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(findFIbComplexity(i) + " on " + i);
        }
    }

    private static int findFIbComplexity(int num) {
        if (num == 0) return 0;
        if (num == 1) {
            return 1;
        }
        return findFIbComplexity(num - 1) + findFIbComplexity(num - 2);
    }
 

}




```

**Which of the complexity is equivalent to O(N)**

```
1. O(n/2) -> O(N) , As we remove constaint
2. O(2N) -> O(N)
3. O(2N+N) -> O(N)
4. O(N+log N) -> O(N)
5. O(2N+M) -> its not O(N) coz M id different value that may be big than N.
6 . O(N + NlogN) Not its O(NLogN)

```
