package learnrecursivemethods.methods;

//You have 3 rods (let’s call them A, B, and C) and n disks of different sizes.
//Initially, all disks are stacked in increasing size on rod A (largest at bottom).
//
//Goal: Move all disks from rod A to rod C using rod B as an auxiliary, following these rules:
//
//Only one disk can be moved at a time.
//
//A larger disk cannot be placed on top of a smaller disk.


public class TowerOfHanoi {

    public  void towerOfHanoi(int n, char source, char auxiliary, char destination) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }

        // Step 1: Move n-1 disks from source to auxiliary
        towerOfHanoi(n - 1, source, destination, auxiliary);

        // Step 2: Move nth disk from source to destination
        System.out.println("Move disk " + n + " from " + source + " to " + destination);

        // Step 3: Move n-1 disks from auxiliary to destination
        towerOfHanoi(n - 1, auxiliary, source, destination);
    }

   
    
    
    
}
