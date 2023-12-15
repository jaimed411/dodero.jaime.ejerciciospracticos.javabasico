import java.util.Scanner;

public class ReservaAsientos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Inicializar el mapa de asientos
        char[][] mapaAsientos = {
                {'O', 'O', 'O', 'O', 'O'},
                {'O', 'O', 'O', 'O', 'O'},
                {'O', 'O', 'O', 'O', 'O'},
                {'O', 'O', 'O', 'O', 'O'},
                {'O', 'O', 'O', 'O', 'O'}
        };

        mostrarMapa(mapaAsientos);

        // Proceso de reservas
        while (true) {
            System.out.print("Ingrese la fila (1-5) y el número de asiento (1-5) separados por espacio, o 'fin' para terminar): ");
            String entrada = scanner.nextLine();

            if (entrada.equalsIgnoreCase("fin")) {
                System.out.println("Fin del programa.");
                break;
            }

            try {
                String[] partes = entrada.split(" ");
                int fila = Integer.parseInt(partes[0]) - 1;
                int asiento = Integer.parseInt(partes[1]) - 1;

                if (esAsientoValido(fila, asiento) && mapaAsientos[fila][asiento] == 'O') {
                    // El asiento está vacío, se reserva
                    mapaAsientos[fila][asiento] = 'X';
                    System.out.println("Reserva exitosa. Asiento marcado como ocupado.");
                    mostrarMapa(mapaAsientos);
                } else {
                    System.out.println("El asiento seleccionado está ocupado o no válido. Por favor, elija otro.");
                }
            } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
                System.out.println("Entrada no válida. Ingrese números de fila y asiento separados por espacio.");
            }
        }

        scanner.close();
    }

    // Función para mostrar el mapa de asientos
    private static void mostrarMapa(char[][] mapaAsientos) {
        System.out.println("Mapa de Asientos:");
        for (char[] fila : mapaAsientos) {
            for (char asiento : fila) {
                System.out.print(asiento + " ");
            }
            System.out.println();
        }
    }

    // Función para verificar si las coordenadas del asiento son válidas
    private static boolean esAsientoValido(int fila, int asiento) {
        return fila >= 0 && fila < 5 && asiento >= 0 && asiento < 5;
    }
}
