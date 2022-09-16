## Recursion

### What, Why, what and how

#### What ?

- Recursion is a technique to solve a problem by calling a function itself until we get the solution.
- Properties of Recursions
    - Find a base condition, After that we will not call function itself.
    - Its call same function multiple times with different input.
    - After each step, We have smaller input to make the problem smaller.

```java
class RecursionExample {

    public void printNumber(int num) {
        if (num == 0) {
            return;  // this one is base condition
        }
        printNumber(num - 1); // we try with smaller input to make problem small.
    }
}
```

### Why Should be Recursion

- Help us to break down the big problem into sub-smaller problem of same type.
- We use recursion in data structure like tree and graph.
- It's used in algorithms like divide and conquer, greedy and DP.

### When to use and Avoid

#### When to use

- When you can divide the problem in to similar sub problems.
- When you are fine with extra time and space, because when you use recursion it bring some extra overhead in term of
  space and time.
- Traverse tree
- When we use memoization in recursion

#### When to avoid
- When time and space is matter.
- We should not use recursion for the application that are installed on less memory device, like airbags , mobile eyc.

### How to write recursive function
- STEP 1 -> finds recursive i.e problem into sub problems.
- STEP 2 -> find base conditions. Stopping criteria
- STEP 3 -> Handle un intentional use cases.
### Recursion Vs Iterative

#### Recursion

- Time efficient
    - In case of recursion system need more time to push and pop elements to stack memory which take more time so this
      one is taking more time.
- Space efficient
    - We required Stack memory to push and pop elements. so it required more space to compute.
- Easy / Stable
    - Yes easy in comparison to iterative, but suitable for such problems that divide into similar sub problem.

#### Iterative

- Time efficient
    - Yes, it will take max elements list size or less that that if we use two pointer.
- Space efficient
    - Yes, Not required any kind of extra space or stack memory for computation.
- Easy / Stable
    - Not easy
    - Iterative problems that required count of n and iterate n numbers .

```java
class Example {
    public String callRecursiveMethod(paramente) {
        if (exit condition){
            // base condition exit from the infinite loop.
            return parament;
        }else{
            // modify the parameter with smaller value
            callRecursiveMethod(modified parameter);
        }
    }
}
```

- ### How Stack memory works in case of method invocation and Recursion.
- It's store the method in STACK using PUSH and retrieve the method when it required using POP.
- Like we have 3 methods in which M1 is calling M2 and M2 is calling M3. M3 just print something. and m2 and m1 also
  print after calling m3 and m2 methods. for more details we have example.
- Here are the STACK in which order the method is stored.
- ANd here is the execution output.

```java
/***
 * M1->called M2 now M1 have something to execute so M1 store in stack
 * M2->called M3 now m2 have something to execute so M2 store in stack
 * M3-> execute sout, now pull the m2 and execute and now pull the m1 and execute.
 * Push -> M1
 * Push -M2
 * exexute M3
 * Pull -> M2 
 * execute M2
 * Pull-> M1 
 * execute M1
 *
 * o/p is
 * Method m3 called
 * Method M2 called
 * Method M1 called
 * */

public class RecursionLogicExample {
    public static void main(String[] args) {
        methodInvocationStack();
    }

    private static void methodInvocationStack() {
        callMethodM1();
    }

    private static void callMethodM1() {
        callMethodM2();
        System.out.println("Method M1 called");
    }

    private static void callMethodM2() {
        callMethodM3();
        System.out.println("Method M2 called");
    }

    private static void callMethodM3() {
        System.out.println("Method m3 called");
    }


    /***
     * Logic 
     * num = 3,
     * recursionCallingLogic(3-1)  Push 3 
     * recursionCallingLogic(2-1)  Push 2 
     * recursionCallingLogic(2-1)  Push 1
     * Pull 1 print 1 
     * pull 2 print 2 
     * pull 3 print 3
     * */
    private static void recursionCallingLogic(int num) {
        if (num < 1) {
            return;
        }
        recursionCallingLogic(num - 1);
        System.out.println(num);
    }
}
```

