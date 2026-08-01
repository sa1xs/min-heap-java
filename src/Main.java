import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        MinHeap minHeap = new MinHeap();

        // Lista desordenada utilizada para probar heapify.
        ArrayList<Integer> elementos = new ArrayList<>(
                Arrays.asList(9, 4, 7, 1, 3, 6, 2)
        );

        System.out.println("Lista original: " + elementos);

        minHeap.heapify(elementos);

        System.out.print("Min-Heap resultante: ");
        minHeap.mostrar();

        System.out.println("Elemento mínimo: " + minHeap.peek());
    }
}