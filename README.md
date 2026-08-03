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

## Features

- Insert elements into the Min-Heap.
- Retrieve the minimum element without removing it.
- Remove the minimum element.
- Convert an unordered list into a valid Min-Heap.
- Display the current heap.
- Accept duplicate values.
- Validate invalid console input.
- Handle empty heaps safely.

## Project Structure

```text
min-heap-java/
├── src/
│   ├── Main.java
│   └── MinHeap.java
├── aplicacion_dijkstra.txt
├── README.md
└── .gitignore
```

## How to Run

### IntelliJ IDEA

1. Open the project in IntelliJ IDEA.
2. Mark the `src` directory as **Sources Root**.
3. Open `Main.java`.
4. Run the `main` method.

## Menu Options

The console menu provides the following operations:

1. Insert an element.
2. Remove the minimum element.
3. View the minimum element.
4. Convert a list into a Min-Heap.
5. Display the current heap.
6. Exit the program.

## Dijkstra Application

The file `aplicacion_dijkstra.txt` explains how a Min-Heap is used by Dijkstra's algorithm to efficiently select the vertex with the smallest known distance.