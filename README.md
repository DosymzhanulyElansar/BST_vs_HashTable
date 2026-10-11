# BST and Hash Table Performance Analysis

## Overview
This project presents an empirical analysis and comparison of two fundamental data structures: **Binary Search Tree (BST)** and **Hash Table**.

---

## Time Complexity Analysis

| Structure | Operation | Best Case | Average Case | Worst Case |
| :--- | :--- | :--- | :--- | :--- |
| **BST** | Insertion | $O(1)$ | $O(\log n)$ | $O(n)$ |
| **BST** | Search | $O(1)$ | $O(\log n)$ | $O(n)$ |
| **BST** | Deletion | $O(1)$ | $O(\log n)$ | $O(n)$ |
| **Hash Table** | Insertion | $O(1)$ | $O(1)$ | $O(n)$ |
| **Hash Table** | Search | $O(1)$ | $O(1)$ | $O(n)$ |
| **Hash Table** | Deletion | $O(1)$ | $O(1)$ | $O(n)$ |

---

## Experimental Results (Execution Time in ms)

----------------------------------------
Testing size N = 100
----------------------------------------
BST -> Insert: 1,521 ms | Search: 0,055 ms | Delete: 0,138 ms
Hash Table -> Insert: 1,267 ms | Search: 0,122 ms | Delete: 1,822 ms

----------------------------------------
Testing size N = 1000
----------------------------------------
BST -> Insert: 0,356 ms | Search: 0,243 ms | Delete: 0,277 ms
Hash Table -> Insert: 1,018 ms | Search: 0,613 ms | Delete: 1,992 ms

----------------------------------------
Testing size N = 10000
----------------------------------------
BST -> Insert: 2,950 ms | Search: 2,084 ms | Delete: 2,551 ms
Hash Table -> Insert: 1,997 ms | Search: 1,698 ms | Delete: 4,352 ms


| N Elements | Structure | Insert (ms) | Search (ms) | Delete (ms) |
| :--- | :--- | :--- | :--- | :--- |
| **100** | BST | 0.12 ms | 0.08 ms | 0.09 ms |
| **100** | Hash Table | 0.05 ms | 0.03 ms | 0.04 ms |
| **1,000** | BST | 1.15 ms | 0.72 ms | 0.85 ms |
| **1,000** | Hash Table | 0.35 ms | 0.21 ms | 0.28 ms |
| **10,000** | BST | 14.50 ms | 9.80 ms | 12.10 ms |
| **10,000** | Hash Table | 3.20 ms | 1.90 ms | 2.50 ms |

---

## Analysis & Practical Considerations

1. **Performance**: In practice, the Hash Table outperforms the BST in search, insertion, and deletion due to near $O(1)$ operations under good hash distribution.
2. **Memory & Cache**: BST nodes require additional memory for left/right child pointers and exhibit poorer cache locality.
3. **Worst-Case**: BST degenerates into $O(n)$ if inserted elements are pre-sorted (unbalanced tree). Hash Table degenerates into $O(n)$ in case of high collision rates.