import java.util.Scanner;

// Implementasi Node Binary Tree
class BTNode {
    String nama;
    BTNode left, right;

    public BTNode(String item) {
        nama = item;
        left = right = null;
    }
}

// Implementasi Binary Tree
class BinaryTree {
    BTNode root;

    BinaryTree() {
        root = null;
    }

    // Method untuk memasukkan data mahasiswa ke dalam Binary Tree
    void insert(String nama) {
        root = insertRec(root, nama);
    }

    BTNode insertRec(BTNode root, String nama) {
        if (root == null) {
            root = new BTNode(nama);
            return root;
        }

        int compareResult = nama.compareTo(root.nama);

        if (compareResult < 0)
            root.left = insertRec(root.left, nama);
        else if (compareResult > 0)
            root.right = insertRec(root.right, nama);

        return root;
    }

    // Method untuk mencari nama mahasiswa dalam Binary Tree
    BTNode search(BTNode root, String nama) {
        if (root == null || root.nama.equals(nama))
            return root;

        int compareResult = nama.compareTo(root.nama);

        if (compareResult < 0)
            return search(root.left, nama);
        else
            return search(root.right, nama);
    }

    // Method untuk mencetak data mahasiswa dari Binary Tree secara inorder
    void inorderPrint(BTNode root) {
        if (root != null) {
            inorderPrint(root.left);
            System.out.println(root.nama);
            inorderPrint(root.right);
        }
    }
}

// Class utama untuk menjalankan program
public class MainBinaryTree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();

        // Meminta input dari pengguna untuk memasukkan data mahasiswa
        System.out.println("Masukkan data mahasiswa (Ketik 'selesai' untuk mengakhiri):");
        String input = scanner.nextLine();
        while (!input.equalsIgnoreCase("selesai")) {
            tree.insert(input);
            input = scanner.nextLine();
        }

        // Menampilkan data mahasiswa dari Binary Tree secara inorder
        System.out.println("Data mahasiswa (urutan nama):");
        tree.inorderPrint(tree.root);

        // Meminta input dari pengguna untuk mencari nama mahasiswa
        System.out.print("Masukkan nama mahasiswa yang ingin dicari: ");
        String searchName = scanner.nextLine();

        // Mencari dan menampilkan data mahasiswa berdasarkan nama
        BTNode result = tree.search(tree.root, searchName);
        if (result != null)
            System.out.println("Data mahasiswa dengan nama '" + searchName + "' ditemukan.");
        else
            System.out.println("Data mahasiswa dengan nama '" + searchName + "' tidak ditemukan.");
        
        scanner.close();
    }
}
