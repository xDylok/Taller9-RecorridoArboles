package ed.u3;

import java.io.FileWriter;
import java.io.IOException;

public class Generador {
    public static void main(String[] args) {
        int n = 15000; // Cantidad de nodos que quieres
        String nombreArchivo = "arbol_1000_nodos.txt";

        try (FileWriter writer = new FileWriter(nombreArchivo)) {
            // Escribir la primera línea con la cantidad total
            writer.write(n + "\n");

            // Generar los nodos
            for (int i = 0; i < n; i++) {
                int valor = (i + 1) * 10; // Valores: 10, 20, 30...

                // Calcular índices de hijos (fórmula de árbol binario en arreglo)
                int izq = 2 * i + 1;
                int der = 2 * i + 2;

                // Si el índice se pasa del límite, es -1 (null)
                String sIzq = (izq < n) ? String.valueOf(izq) : "-1";
                String sDer = (der < n) ? String.valueOf(der) : "-1";

                // Escribir línea: ID;Valor;Izq;Der
                writer.write(i + ";" + valor + ";" + sIzq + ";" + sDer + "\n");
            }
            System.out.println("¡Listo! Archivo " + nombreArchivo + " generado.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}