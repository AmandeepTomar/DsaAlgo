package recursion;

public class RecursionLogicExample {
    public static void main(String[] args) {
        //  methodInvocationStack();
        recursionCallingLogic(3);
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
}

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
