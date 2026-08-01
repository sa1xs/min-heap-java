import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        MinHeap minHeap = new MinHeap();

        try (Scanner scanner = new Scanner(System.in)) {
            menu(scanner, minHeap);
        }
    }

    /**
     * Muestra el menú y ejecuta las operaciones seleccionadas.
     *
     * @param scanner lector de entradas del usuario
     * @param minHeap estructura que será administrada
     */
    private static void menu(Scanner scanner, MinHeap minHeap) {
        int opcion;

        do {
            mostrarMenu();
            opcion = leerEntero(scanner, "Seleccione una opción: ");

            switch (opcion) {
                case 1:
                    insertarElemento(scanner, minHeap);
                    break;

                case 2:
                    eliminarMinimo(minHeap);
                    break;

                case 3:
                    consultarMinimo(minHeap);
                    break;

                case 4:
                    convertirListaEnHeap(scanner, minHeap);
                    break;

                case 5:
                    mostrarHeap(minHeap);
                    break;

                case 6:
                    System.out.println("Programa finalizado.");
                    break;

                default:
                    System.out.println("Opción inválida. Seleccione una opción del 1 al 6.");
            }

            System.out.println();

        } while (opcion != 6);
    }

    /**
     * Imprime las operaciones disponibles.
     */
    private static void mostrarMenu() {
        System.out.println("========== MIN-HEAP ==========");
        System.out.println("1. Insertar elemento");
        System.out.println("2. Eliminar elemento mínimo");
        System.out.println("3. Consultar elemento mínimo");
        System.out.println("4. Convertir lista en Min-Heap");
        System.out.println("5. Mostrar montículo");
        System.out.println("6. Salir");
        System.out.println("==============================");
    }

    /**
     * Solicita un valor y lo inserta en el montículo.
     */
    private static void insertarElemento(Scanner scanner, MinHeap minHeap) {
        int valor = leerEntero(scanner, "Ingrese el valor que desea insertar: ");

        minHeap.insertar(valor);

        System.out.println("Elemento insertado correctamente.");
        System.out.print("Montículo actual: ");
        minHeap.mostrar();
    }

    /**
     * Elimina el elemento mínimo del montículo.
     */
    private static void eliminarMinimo(MinHeap minHeap) {
        if (minHeap.estaVacio()) {
            System.out.println("No se puede eliminar: el montículo está vacío.");
            return;
        }

        int eliminado = minHeap.eliminarMin();

        System.out.println("Elemento eliminado: " + eliminado);
        System.out.print("Montículo actual: ");
        minHeap.mostrar();
    }

    /**
     * Consulta el mínimo sin modificar el montículo.
     */
    private static void consultarMinimo(MinHeap minHeap) {
        if (minHeap.estaVacio()) {
            System.out.println("No se puede consultar: el montículo está vacío.");
            return;
        }

        System.out.println("Elemento mínimo: " + minHeap.peek());
    }

    /**
     * Solicita una lista desordenada y ejecuta heapify.
     */
    private static void convertirListaEnHeap(
            Scanner scanner,
            MinHeap minHeap
    ) {
        int cantidad;

        do {
            cantidad = leerEntero(
                    scanner,
                    "Ingrese la cantidad de elementos: "
            );

            if (cantidad < 0) {
                System.out.println("La cantidad no puede ser negativa.");
            }

        } while (cantidad < 0);

        ArrayList<Integer> elementos = new ArrayList<>();

        for (int indice = 0; indice < cantidad; indice++) {
            int valor = leerEntero(
                    scanner,
                    "Elemento " + (indice + 1) + ": "
            );

            elementos.add(valor);
        }

        minHeap.heapify(elementos);

        System.out.println("La lista fue convertida en un Min-Heap.");
        System.out.print("Montículo resultante: ");
        minHeap.mostrar();
    }

    /**
     * Muestra el estado actual del montículo.
     */
    private static void mostrarHeap(MinHeap minHeap) {
        if (minHeap.estaVacio()) {
            System.out.println("El montículo está vacío.");
            return;
        }

        System.out.print("Montículo actual: ");
        minHeap.mostrar();
    }

    /**
     * Lee un número entero y evita que una entrada inválida cierre el programa.
     *
     * @param scanner lector de entradas
     * @param mensaje texto mostrado al usuario
     * @return número entero válido
     */
    private static int leerEntero(Scanner scanner, String mensaje) {
        while (true) {
            System.out.print(mensaje);
            String entrada = scanner.nextLine().trim();

            try {
                return Integer.parseInt(entrada);
            } catch (NumberFormatException exception) {
                System.out.println("Entrada inválida. Debe ingresar un número entero.");
            }
        }
    }
}