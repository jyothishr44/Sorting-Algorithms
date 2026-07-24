# 🔢 Sorting Algorithms in Java

A Java project that demonstrates the implementation of the most commonly used **Sorting Algorithms** from scratch without using any built-in sorting methods.

This project is designed for students, beginners, and interview preparation. Every algorithm is implemented using clean and easy-to-understand Java code along with its **Time Complexity** and **Space Complexity** analysis.

---

# 📖 Time Complexity and Space Complexity

Before understanding sorting algorithms, it is important to know how we measure an algorithm's efficiency.

## ⏱️ Time Complexity

**Time Complexity** is the measure of how the execution time of an algorithm grows as the size of the input increases. It helps us analyze the efficiency of an algorithm regardless of the hardware or programming language used.

Time Complexity is represented using **Big O Notation**.

### Common Time Complexities

| Complexity | Meaning |
|------------|---------|
| O(1) | Constant Time |
| O(log n) | Logarithmic Time |
| O(n) | Linear Time |
| O(n log n) | Linearithmic Time |
| O(n²) | Quadratic Time |

---

## 💾 Space Complexity

**Space Complexity** is the measure of how much additional memory an algorithm requires as the size of the input increases. It includes the extra memory used during the execution of the algorithm.

Space Complexity is also represented using **Big O Notation**.

### Common Space Complexities

| Complexity | Meaning |
|------------|---------|
| O(1) | Constant Extra Space |
| O(log n) | Recursive Stack Space |
| O(n) | Linear Extra Space |

---

# 🎯 Project Objective

The purpose of this project is to understand how different sorting algorithms work internally by implementing them manually instead of using Java's built-in sorting methods.

This project demonstrates the implementation of the following major sorting algorithms:

- Bubble Sort
- Optimized Bubble Sort
- Selection Sort
- Insertion Sort
- Merge Sort
- Quick Sort

For each algorithm, the repository provides:

- ✅ Clean Java source code
- ✅ Step-by-step sorting implementation
- ✅ Best Case Time Complexity
- ✅ Average Case Time Complexity
- ✅ Worst Case Time Complexity
- ✅ Space Complexity
- ✅ Easy-to-understand logic for learning and interview preparation

---

# 📂 Project Structure

```
Sorting-Algorithms
│
├── src
│   ├── LaunchBubbleSort.java
│   ├── BubbleSortOptimized.java
│   ├── SelectionSort.java
│   ├── LaunchInsertionSort.java
│   ├── MergeSort.java
│   └── QuickSort.java
│
└── README.md
```

---

# 🚀 Algorithms Implemented

---

## 1️⃣ Bubble Sort

Bubble Sort repeatedly compares adjacent elements and swaps them whenever they are in the wrong order.

After every pass, the largest unsorted element "bubbles" to the end of the array.

### Time Complexity

| Case | Complexity |
|------|------------|
| Best | O(n²) |
| Average | O(n²) |
| Worst | O(n²) |

### Space Complexity

```
O(1)
```

**Java File**

```
LaunchBubbleSort.java
```

---

## 2️⃣ Optimized Bubble Sort

Optimized Bubble Sort improves the traditional Bubble Sort by introducing a **swapped** flag.

If no swapping occurs during a complete pass, the algorithm terminates early because the array is already sorted.

This optimization improves the best-case performance from **O(n²)** to **O(n)**.

### Time Complexity

| Case | Complexity |
|------|------------|
| Best | O(n) |
| Average | O(n²) |
| Worst | O(n²) |

### Space Complexity

```
O(1)
```

**Java File**

```
BubbleSortOptimized.java
```

---

## 3️⃣ Selection Sort

Selection Sort repeatedly finds the smallest element from the unsorted portion of the array and places it at its correct position.

Only one swap is performed in each iteration.

### Time Complexity

| Case | Complexity |
|------|------------|
| Best | O(n²) |
| Average | O(n²) |
| Worst | O(n²) |

### Space Complexity

```
O(1)
```

**Java File**

```
SelectionSort.java
```

---

## 4️⃣ Insertion Sort

Insertion Sort builds the sorted array one element at a time by inserting each element into its correct position among the already sorted elements.

It performs efficiently for small datasets and nearly sorted arrays.

### Time Complexity

| Case | Complexity |
|------|------------|
| Best | O(n) |
| Average | O(n²) |
| Worst | O(n²) |

### Space Complexity

```
O(1)
```

**Java File**

```
LaunchInsertionSort.java
```

---

## 5️⃣ Merge Sort

Merge Sort follows the **Divide and Conquer** strategy.

The array is recursively divided into smaller halves until each subarray contains only one element. These smaller arrays are then merged together in sorted order.

Merge Sort provides consistent performance for all input cases.

### Time Complexity

| Case | Complexity |
|------|------------|
| Best | O(n log n) |
| Average | O(n log n) |
| Worst | O(n log n) |

### Space Complexity

```
O(n)
```

**Java File**

```
MergeSort.java
```

---

## 6️⃣ Quick Sort

Quick Sort is another **Divide and Conquer** algorithm.

It selects a pivot element and partitions the array such that:

- Elements smaller than the pivot are placed on the left.
- Elements larger than the pivot are placed on the right.

The same process is recursively applied to both partitions.

Quick Sort is one of the fastest sorting algorithms in practical applications.

### Time Complexity

| Case | Complexity |
|------|------------|
| Best | O(n log n) |
| Average | O(n log n) |
| Worst | O(n²) |

### Space Complexity

| Case | Complexity |
|------|------------|
| Best / Average | O(log n) |
| Worst | O(n) |

**Java File**

```
QuickSort.java
```

---

# 📊 Complexity Comparison

| Algorithm | Best Case | Average Case | Worst Case | Space Complexity |
|------------|-----------|--------------|-------------|------------------|
| Bubble Sort | O(n²) | O(n²) | O(n²) | O(1) |
| Optimized Bubble Sort | O(n) | O(n²) | O(n²) | O(1) |
| Selection Sort | O(n²) | O(n²) | O(n²) | O(1) |
| Insertion Sort | O(n) | O(n²) | O(n²) | O(1) |
| Merge Sort | O(n log n) | O(n log n) | O(n log n) | O(n) |
| Quick Sort | O(n log n) | O(n log n) | O(n²) | O(log n) Avg |

---

# 💻 Technologies Used

- Java
- Arrays API (`java.util.Arrays`)
- Recursion
- Divide and Conquer
- Iterative Programming
- Algorithm Analysis
- Big O Notation

---

# ▶️ How to Run

### 1. Clone the Repository

```bash
git clone https://github.com/jyothishr44/Sorting-Algorithms.git
```

### 2. Open the Project

Open the project using any Java IDE such as:

- IntelliJ IDEA
- Eclipse
- VS Code

### 3. Run the Program

Navigate to the `src` folder and execute the desired Java file.

Each algorithm contains its own `main()` method and can be run independently.

---

# 🎓 Learning Outcomes

After completing this project, you will understand:

- How sorting algorithms work internally
- The difference between iterative and recursive sorting
- The Divide and Conquer technique
- When to use different sorting algorithms
- Time Complexity analysis using Big O Notation
- Space Complexity analysis using Big O Notation
- How algorithm efficiency changes with input size
- Java implementation of popular sorting algorithms

---

# 📚 Key Concepts Covered

- Arrays
- Swapping
- Nested Loops
- Recursion
- Divide and Conquer
- Partitioning
- Merging
- Big O Notation
- Time Complexity
- Space Complexity
- Algorithm Analysis

---

# 👨‍💻 Author

**Jyothish R**

Computer Science Engineering Student

This repository was created as part of my **Data Structures and Algorithms (DSA)** learning journey to strengthen my understanding of sorting techniques, algorithm analysis, and problem-solving skills for technical interviews.

---

## ⭐ Support

If you found this project helpful or learned something from it, consider giving this repository a **Star ⭐** on GitHub.

Happy Coding! 🚀
