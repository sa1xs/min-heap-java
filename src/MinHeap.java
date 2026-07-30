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
     * Muestra el contenido actual del montículo.
     */
    public void mostrar() {
        System.out.println(monticulo);
    }
}