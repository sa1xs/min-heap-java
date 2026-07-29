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