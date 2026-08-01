public class Main {

    public static void main(String[] args) {
        MinHeap minHeap = new MinHeap();

        minHeap.insertar(10);
        minHeap.insertar(4);
        minHeap.insertar(7);
        minHeap.insertar(1);

        System.out.print("Montículo inicial: ");
        minHeap.mostrar();

        int eliminado = minHeap.eliminarMin();

        System.out.println("Elemento eliminado: " + eliminado);

        System.out.print("Montículo después de eliminar: ");
        minHeap.mostrar();

        System.out.println("Nuevo mínimo: " + minHeap.peek());
    }
}