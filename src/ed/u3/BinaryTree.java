package ed.u3;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    TreeNode root;

    // 1. Preorden (Raíz -> Izquierda -> Derecha) [cite: 35]
    // Se usa recursividad [cite: 37]
    public void preOrder(TreeNode node) {
        if (node == null) return;

        System.out.print(node.value + " "); // Visitar Raíz
        preOrder(node.left);                // Visitar Izquierda
        preOrder(node.right);               // Visitar Derecha
    }

    // 2. Inorden (Izquierda -> Raíz -> Derecha) [cite: 39]
    public void inOrder(TreeNode node) {
        if (node == null) return;

        inOrder(node.left);                 // Visitar Izquierda
        System.out.print(node.value + " "); // Visitar Raíz
        inOrder(node.right);                // Visitar Derecha
    }

    // 3. Postorden (Izquierda -> Derecha -> Raíz) [cite: 40]
    public void postOrder(TreeNode node) {
        if (node == null) return;

        postOrder(node.left);               // Visitar Izquierda
        postOrder(node.right);              // Visitar Derecha
        System.out.print(node.value + " "); // Visitar Raíz
    }

    // 4. Por Niveles (Usando una Cola)
    public void levelOrder(TreeNode root) {
        if (root == null) return;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            System.out.print(current.value + " ");

            if (current.left != null) {
                queue.add(current.left);
            }
            if (current.right != null) {
                queue.add(current.right);
            }
        }
    }
}
