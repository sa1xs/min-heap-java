import java.util.ArrayList;

public class MinHeap {

    // Almacena los elementos del montículo mínimo.
    private final ArrayList<Integer> monticulo;

    /**
     * Crea un montículo mínimo vacío.
     */
    public MinHeap() {
        monticulo = new ArrayList<>();
    }

    /**
     * Calcula el índice del padre de un elemento.
     *
     * @param indice posición actual del elemento
     * @return índice del padre
     */
    private int obtenerIndicePadre(int indice) {
        return (indice - 1) / 2;
    }

    /**
     * Calcula el índice del hijo izquierdo.
     *
     * @param indice posición actual del elemento
     * @return índice del hijo izquierdo
     */
    private int obtenerIndiceIzquierdo(int indice) {
        return (2 * indice) + 1;
    }

    /**
     * Calcula el índice del hijo derecho.
     *
     * @param indice posición actual del elemento
     * @return índice del hijo derecho
     */
    private int obtenerIndiceDerecho(int indice) {
        return (2 * indice) + 2;
    }

    /**
     * Intercambia dos elementos dentro del montículo.
     *
     * @param indiceA índice del primer elemento
     * @param indiceB índice del segundo elemento
     */
    private void intercambiar(int indiceA, int indiceB) {
        int temporal = monticulo.get(indiceA);

        monticulo.set(indiceA, monticulo.get(indiceB));
        monticulo.set(indiceB, temporal);
    }

    /**
     * Inserta un valor en el montículo mínimo.
     *
     * @param valor valor que se desea insertar
     */
    public void insertar(int valor) {
        // Se agrega al final para conservar la forma completa del montículo.
        monticulo.add(valor);

        // El último índice corresponde al valor recién insertado.
        int indiceNuevo = monticulo.size() - 1;

        // Se sube el elemento hasta restaurar la propiedad del Min-Heap.
        upHeapify(indiceNuevo);
    }

    /**
     * Sube recursivamente un elemento mientras sea menor que su padre.
     *
     * @param indice índice actual del elemento
     */
    private void upHeapify(int indice) {
        // Caso base: el elemento alcanzó la cima.
        if (indice == 0) {
            return;
        }

        int indicePadre = obtenerIndicePadre(indice);

        // Si el hijo es menor que el padre, ambos están desordenados.
        if (monticulo.get(indice) < monticulo.get(indicePadre)) {
            intercambiar(indice, indicePadre);

            // El elemento continúa siendo evaluado desde su nueva posición.
            upHeapify(indicePadre);
        }
    }

    /**
     * Muestra el contenido actual del montículo.
     */
    public void mostrar() {
        System.out.println(monticulo);
    }
}