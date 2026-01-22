package ed.u3;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TreeLoader {

    public TreeNode loadTree(String filename) {
        TreeNode[] nodes = null;
        int[] leftChildren = null;
        int[] rightChildren = null;

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            // 1. Leer la cantidad de nodos (primera línea)
            String line = br.readLine();
            if (line == null) return null;

            int n = Integer.parseInt(line.trim());

            // Inicializar arreglos
            nodes = new TreeNode[n];
            leftChildren = new int[n];
            rightChildren = new int[n];

            // 2. Leer cada línea y crear los nodos (sin enlazar aún)
            for (int i = 0; i < n; i++) {
                line = br.readLine();
                if (line == null) break;

                // Formato: ID;Valor;Izq;Der
                String[] parts = line.split(";");
                int id = Integer.parseInt(parts[0]);
                int value = Integer.parseInt(parts[1]);
                int leftId = Integer.parseInt(parts[2]);
                int rightId = Integer.parseInt(parts[3]);

                // Crear el nodo y guardarlo en su posición (ID)
                nodes[id] = new TreeNode(value);

                // Guardar las referencias de hijos para el paso de enlace
                leftChildren[id] = leftId;
                rightChildren[id] = rightId;
            }

            // 3. Enlazar los nodos (conectar padres con hijos)
            for (int i = 0; i < n; i++) {
                if (leftChildren[i] != -1) {
                    nodes[i].left = nodes[leftChildren[i]];
                }
                if (rightChildren[i] != -1) {
                    nodes[i].right = nodes[rightChildren[i]];
                }
            }

        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
            return null;
        } catch (NumberFormatException e) {
            System.err.println("Error de formato en el archivo: " + e.getMessage());
            return null;
        }

        // Retornamos el nodo con ID 0 asumiendo que es la raíz
        return (nodes != null && nodes.length > 0) ? nodes[0] : null;
    }
}
