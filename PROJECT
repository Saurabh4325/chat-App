import java.util.Scanner;

class BST {
    // Node class represents each node in the BST
    static class Node {
        int data;  // The value stored in the node
        Node left, right;  // Left and right child nodes

        // Constructor to initialize a new node
        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    // Method to insert a new value into the BST
    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);  // If the tree is empty, create a new node
            return root;
        }
        if (root.data > val) {
            root.left = insert(root.left, val);  // Insert in the left subtree
        } else {
            root.right = insert(root.right, val);  // Insert in the right subtree
        }
        return root;
    }

    // InOrder Traversal: Left, Root, Right
    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // PreOrder Traversal: Root, Left, Right
    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // PostOrder Traversal: Left, Right, Root
    public static void postorder(Node root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    // Method to search for a value in the BST
    public static boolean search(Node root, int key) {
        if (root == null) {
            return false;  // Value not found
        }
        if (root.data == key) {
            return true;  // Value found
        }
        if (root.data > key) {
            return search(root.left, key);  // Search in the left subtree
        } else {
            return search(root.right, key);  // Search in the right subtree
        }
    }

    // Method to delete a value from the BST
    public static Node delete(Node root, int del) {
        if (root == null) return null;  // If the tree is empty

        if (root.data > del) {
            root.left = delete(root.left, del);  // Delete from the left subtree
        } else if (root.data < del) {
            root.right = delete(root.right, del);  // Delete from the right subtree
        } else {
            // Node to be deleted found
            if (root.left == null && root.right == null) {
                return null;  // Node is a leaf
            }
            if (root.left == null) {
                return root.right;  // Node has only right child
            } else if (root.right == null) {
                return root.left;  // Node has only left child
            }
            // Node has two children
            Node IS = findInorderSuccessor(root.right);
            root.data = IS.data;  // Replace data with inorder successor's data
            root.right = delete(root.right, IS.data);  // Delete inorder successor
        }
        return root;
    }

    // Method to find the inorder successor (smallest value in the right subtree)
    public static Node findInorderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Node root = null;  // Initial empty BST

        while (true) {
            // Display menu
            System.out.println("\nBinary Search Tree Operations Menu:");
            System.out.println("1. Insert");
            System.out.println("2. Search");
            System.out.println("3. Delete");
            System.out.println("4. InOrder Traversal");
            System.out.println("5. PreOrder Traversal");
            System.out.println("6. PostOrder Traversal");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Insert a new value
                    System.out.print("Enter value to insert: ");
                    int val = scanner.nextInt();
                    root = insert(root, val);
                    System.out.println("Inserted " + val);
                    break;
                case 2:
                    // Search for a value
                    System.out.print("Enter value to search: ");
                    int key = scanner.nextInt();
                    if (search(root, key)) {
                        System.out.println("Found");
                    } else {
                        System.out.println("Not found");
                    }
                    break;
                case 3:
                    // Delete a value
                    System.out.print("Enter value to delete: ");
                    int del = scanner.nextInt();
                    root = delete(root, del);
                    System.out.println("Deleted " + del);
                    break;
                case 4:
                    // InOrder traversal
                    System.out.println("InOrder traversal:");
                    inorder(root);
                    System.out.println();
                    break;
                case 5:
                    // PreOrder traversal
                    System.out.println("PreOrder traversal:");
                    preorder(root);
                    System.out.println();
                    break;
                case 6:
                    // PostOrder traversal
                    System.out.println("PostOrder traversal:");
                    postorder(root);
                    System.out.println();
                    break;
                case 7:
                    // Exit
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    // Invalid choice
                    System.out.println("Invalid choice! Please enter a number between 1 and 7.");
            }
        }
    }
}
