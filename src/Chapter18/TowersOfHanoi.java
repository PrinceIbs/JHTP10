package Chapter18;

// Fig. 18.11: TowersOfHanoi.java
// Towers of Hanoi solution with recursive methods

public class TowersOfHanoi {
    
    // recursively move disks between towers
    public static void solveTowers(int disks, int srcPeg, int dstPeg, int tempPeg) {
        // base case -- only one disk to move
        if (disks == 1) {
            System.out.printf("%n%d --> %d", srcPeg, dstPeg);
            return;
        }
        
        // recursion step -- move (disk - 1) disks from srcPeg to tempPeg using dstPeg
        solveTowers(disks - 1, srcPeg, tempPeg, dstPeg);
        
        // move last disk from srcPeg to dstPeg
        System.out.printf("%n%d --> %d", srcPeg, dstPeg);
        
        // move (disks - 1) disks from tempPeg to dstPeg
        solveTowers(disks - 1, tempPeg, dstPeg, srcPeg);
    }
    
    public static void main(String[] args) {
        int startPeg = 1;
        int endPeg = 3;
        int tempPeg = 2;
        int totalDisks = 5;
        
        // initial nonrecursive call: move all disks
        solveTowers(totalDisks, startPeg, endPeg, tempPeg);
        System.out.println();
    }
    
}
