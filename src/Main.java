import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] sizes = {100, 1000, 10000};
        Random random = new Random();

        System.out.println("=== BST and Hash Table Performance Analysis ===\n");

        for (int n : sizes) {
            System.out.println("----------------------------------------");
            System.out.println("Testing size N = " + n);
            System.out.println("----------------------------------------");

            int[] data = new int[n];
            for (int i = 0; i < n; i++) {
                data[i] = random.nextInt(n * 10);
            }

            BST bst = new BST();

            long start = System.nanoTime();
            for (int val : data) bst.insert(val);
            long bstInsertTime = System.nanoTime() - start;

            start = System.nanoTime();
            for (int val : data) bst.search(val);
            long bstSearchTime = System.nanoTime() - start;

            start = System.nanoTime();
            for (int val : data) bst.delete(val);
            long bstDeleteTime = System.nanoTime() - start;

            HashTable hashTable = new HashTable(n * 2);

            start = System.nanoTime();
            for (int val : data) hashTable.insert(val);
            long htInsertTime = System.nanoTime() - start;

            start = System.nanoTime();
            for (int val : data) hashTable.search(val);
            long htSearchTime = System.nanoTime() - start;

            start = System.nanoTime();
            for (int val : data) hashTable.delete(val);
            long htDeleteTime = System.nanoTime() - start;

            System.out.printf("BST -> Insert: %.3f ms | Search: %.3f ms | Delete: %.3f ms%n",
                    bstInsertTime / 1e6, bstSearchTime / 1e6, bstDeleteTime / 1e6);
            System.out.printf("Hash Table -> Insert: %.3f ms | Search: %.3f ms | Delete: %.3f ms%n\n",
                    htInsertTime / 1e6, htSearchTime / 1e6, htDeleteTime / 1e6);
        }
    }
}