package ed.u3;

public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        TreeLoader loader = new TreeLoader();

        // Asegúrate de que el archivo .txt esté en la carpeta raíz del proyecto
        System.out.println("Cargando árbol desde archivo...");
        tree.root = loader.loadTree("src/ed/u3/txt/arbol_10_nodos.txt");

        if (tree.root != null) {
            System.out.println("¡Árbol cargado correctamente!\n");

            System.out.println("--- Recorrido Preorden ---");
            tree.preOrder(tree.root);
            System.out.println("\n");

            System.out.println("--- Recorrido Inorden ---");
            tree.inOrder(tree.root);
            System.out.println("\n");

            System.out.println("--- Recorrido Postorden ---");
            tree.postOrder(tree.root);
            System.out.println("\n");

            System.out.println("--- Recorrido Por Niveles ---");
            tree.levelOrder(tree.root);
            System.out.println("\n");
        } else {
            System.out.println("No se pudo cargar el árbol.");
        }
    }
}