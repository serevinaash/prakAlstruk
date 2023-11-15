import java.util.Scanner;

class Node {
    String data;
    Node next;

    Node(String data) {
        this.data = data;
        this.next = null;
    }
}

class SingleLinkedList {
    private Node head;

    SingleLinkedList() {
        this.head = null;
    }

    void insert(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    void display() {
        if (head == null) {
            System.out.println("Linked list is empty");
            return;
        }
        Node temp = head;
        System.out.println("Data in the linked list:");
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    void sort() {
        if (head == null || head.next == null) {
            return;
        }

        Node current = head;
        while (current != null) {
            Node index = current.next;
            while (index != null) {
                if (current.data.compareTo(index.data) > 0) {
                    String temp = current.data;
                    current.data = index.data;
                    index.data = temp;
                }
                index = index.next;
            }
            current = current.next;
        }
    }

    boolean search(String key) {
        Node current = head;
        while (current != null) {
            if (current.data.equals(key)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SingleLinkedList list = new SingleLinkedList();

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter student name " + (i + 1) + ": ");
            String name = scanner.nextLine();
            list.insert(name);
        }

        System.out.println("\nUnsorted list:");
        list.display();

        list.sort();
        System.out.println("\nSorted list:");
        list.display();

        System.out.print("\nEnter a student name to search: ");
        String searchName = scanner.nextLine();
        if (list.search(searchName)) {
            System.out.println(searchName + " is found in the list.");
        } else {
            System.out.println(searchName + " is not found in the list.");
        }

        scanner.close();
    }
}
