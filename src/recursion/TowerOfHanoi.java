package recursion;

/**
 * Tower of Hanoi is a mathematical puzzle where we have three rods (A, B, and C) and N disks. Initially, all the disks are stacked in decreasing value of diameter i.e., the smallest disk is placed on the top and they are on rod A. The objective of the puzzle is to move the entire stack to another rod (here considered C), obeying the following simple rules:
 * <p>
 * Only one disk can be moved at a time.
 * Each move consists of taking the upper disk from one of the stacks and placing it on top of another stack i.e. a disk can only be moved if it is the uppermost disk on a stack.
 * No disk may be placed on top of a smaller disk.
 * Input: 2
 * Output: Disk 1 moved from A to B
 * Disk 2 moved from A to C
 * Disk 1 moved from B to C
 * <p>
 * Input: 3
 * Output: Disk 1 moved from A to C
 * Disk 2 moved from A to B
 * Disk 1 moved from C to B
 * Disk 3 moved from A to C
 * Disk 1 moved from B to A
 * Disk 2 moved from B to C
 * Disk 1 moved from A to C
 */
public class TowerOfHanoi {
    public static void main(String[] args) {
        long moves[] = new long[1];
        int N = 3;
        String fromTower = "A";
        String toTower = "C";
        String auxTower = "B";
        tower(N, fromTower, toTower, auxTower, moves);
        System.out.println(moves[0]);
    }

    /***
     * We have three tower 1,2 and three.
     * We have disk N= 2;
     * Now we have to move the disk from 1 that is source to toTower that is target tower using aux tower.
     *
     *  tower(N-1,from(A),aux(B),to(C))
     *  tower(N-1,Aux(B),T(C),S(A))
     *A(2,1),C() B()
     * A(2,) B (1) C()->A to B
     * A(,) B (1) C(2)->A to C
     * A(,) B () C(2,1)->B to C
     *  Solve for 3 Disk
     * Disk 1 Moved From A to Tower C
     * Disk 2 Moved From A to Tower B
     * Disk 1 Moved From C to Tower B
     * Disk 3 Moved From A to Tower C
     * Disk 1 Moved From B to Tower A
     * Disk 2 Moved From B to Tower C
     * Disk 1 Moved From A to Tower C
     *
     * */
    private static void tower(int n, String fromTower, String toTower, String auxTower, long[] moves) {
        if (n == 0) {
            return;
        }
        moves[0]++;
        tower(n - 1, fromTower, auxTower, toTower, moves);
        System.out.println("Disk " + n + " Moved From " + fromTower + " to Tower " + toTower);
        tower(n - 1, auxTower, toTower, fromTower, moves);
    }
}
