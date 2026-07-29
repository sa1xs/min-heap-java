# Min-Heap Java Implementation

Implementation of a minimum heap, or **Min-Heap**, in Java using an `ArrayList<Integer>`.

This project was developed as the third data structures implementation practice for the Data Structures course at Universidad CENFOTEC.

## Objective

Implement a dynamic Min-Heap that maintains the smallest element at the top of the structure.

The heap must preserve the following property:

- Every parent is less than or equal to its children.
- Duplicate values are allowed.
- Elements are stored in an `ArrayList`.
- The structure is maintained as a complete binary heap.

## Index Formulas

For an element located at index `i`:

```java
int leftChild = (2 * i) + 1;
int rightChild = (2 * i) + 2;
int parent = (i - 1) / 2;
```

## Features

- [ ] Insert an element.
- [ ] Restore the heap using recursive `upHeapify()`.
- [ ] Remove and return the minimum element.
- [ ] Restore the heap using recursive `downHeapify()`.
- [ ] View the minimum element without removing it.
- [ ] Convert an unordered array into a valid Min-Heap.
- [ ] Display the heap.
- [ ] Use all operations through a console menu.
- [ ] Handle empty heap cases.
- [ ] Allow duplicate values.

## Project Structure

```text
min-heap-java/
├── src/
│   ├── Main.java
│   └── MinHeap.java
├── README.md
├── aplicacion_dijkstra.txt
└── .gitignore
```

## Classes

### `MinHeap`

Responsible for storing and managing the heap.

Main operations:

- `insertar(int value)`
- `eliminarMin()`
- `peek()`
- `heapify(...)`
- `upHeapify(int index)`
- `downHeapify(int index)`

### `Main`

Responsible for:

- Starting the application.
- Displaying the console menu.
- Reading user input.
- Calling the Min-Heap operations.

## Technologies

- Java
- ArrayList
- Git
- GitHub

## How to Run

Compile the Java files:

```bash
javac -d out src/Main.java src/MinHeap.java
```

Run the program:

```bash
java -cp out Main
```

## Project Status

Currently under development.