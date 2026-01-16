package ed.u3;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
// CLASE PARA GENERAR LA MATRIZ DE PRUEBA
public class GeneradorMatriz {
    public static void main(String[] args) {
        int N = 5; // Tamaño de la matriz (50x50)
        String nombreArchivo = "grafoPrueba.txt";
        double densidad = 0.3; // 30% de probabilidad de conexión (para que no sea muy denso)

        try (FileWriter writer = new FileWriter(nombreArchivo)) {
            Random rand = new Random();

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    // La diagonal suele ser 0 (sin bucles hacia sí mismo)
                    if (i == j) {
                        writer.write("0");
                    } else {
                        // Escribe 1 o 0 basado en la probabilidad
                        writer.write(rand.nextDouble() < densidad ? "1" : "0");
                    }

                    // Agregar espacio entre números, excepto al final de la línea
                    if (j < N - 1) {
                        writer.write(" ");
                    }
                }
                // Salto de línea al terminar la fila
                writer.write("\n");
            }
            System.out.println("Archivo '" + nombreArchivo + "' generado exitosamente con dimensión " + N + "x" + N);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
