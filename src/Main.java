public class Main {

    public static void main(String[] args) {
        MinHeap minHeap = new MinHeap();

        // Prueba de inserción y upHeapify.
        minHeap.insertar(10);
        minHeap.insertar(4);
        minHeap.insertar(7);
        minHeap.insertar(1);

        minHeap.mostrar();
    }
}