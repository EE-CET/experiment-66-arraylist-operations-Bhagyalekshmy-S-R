[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/RfrMtENX)
# Experiment 66: ArrayList Operations

## Problem Statement
Create an `ArrayList` of Strings representing items in a shopping cart. Perform the following operations:
1. Add items to the list.
2. Sort the items alphabetically.
3. Check if a specific item exists in the list.
4. Print the final sorted list and the search result.

## Input Format
* **Line 1:** An integer N, representing the number of items.
* **Line 2:** N space-separated Strings representing the items in the cart.
* **Line 3:** A single String representing the item to search for.

## Output Format
* **Line 1:** `Sorted Items: [Item1, Item2, ...]` (The alphabetically sorted list).
* **Line 2:** `Found` if the search item exists in the list, otherwise `Not Found`.

## Example 1

**Input:**
```text
3
Milk Bread Eggs
Bread
```
**Output:**
  ```text
Sorted Items: [Bread, Eggs, Milk]
Found
```
## Example 2

**Input:**
```text
4
Zebra Apple Monkey Dog
Cat
```

**Output:**
```text
Sorted Items: [Apple, Dog, Monkey, Zebra]
Not Found
```

## Instructions
* Ensure your main class is named `ArrayListOperations`.
* Do not use any extra prompts (like "Enter number of items:") as it will fail the strict autograding checks. Just read the inputs directly and print the exact expected output.
    
