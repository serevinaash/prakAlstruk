/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author serev
 */
public class queue {
    private int[] queue;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public CircularQueue(int capacity) {
        this.capacity = capacity;
        this.queue = new int[capacity];
        this.front = this.rear = -1;
        this.size = 0;
    }

    // Method untuk menambah elemen ke dalam antrian (enqueue)
    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue penuh. Tidak dapat menambahkan elemen.");
            return;
        }

        if (isEmpty()) {
            front = rear = 0;
        } else {
            rear = (rear + 1) % capacity;
        }

        queue[rear] = item;
        size++;
        System.out.println(item + " ditambahkan ke dalam antrian.");
    }

    // Method untuk menghapus elemen dari antrian (dequeue)
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue kosong. Tidak dapat menghapus elemen.");
            return -1;
        }

        int removedItem = queue[front];
        if (front == rear) {
            front = rear = -1;
        } else {
            front = (front + 1) % capacity;
        }

        size--;
        return removedItem;
    }

    // Method untuk mendapatkan elemen yang ada di depan antrian
    public int front() {
        if (isEmpty()) {
            System.out.println("Queue kosong.");
            return -1;
        }
        return queue[front];
    }

    // Method untuk mengecek apakah antrian kosong
    public boolean isEmpty() {
        return front == -1;
    }

    // Method untuk mengecek apakah antrian penuh
    public boolean isFull() {
        return (rear + 1) % capacity == front;
    }

    // Method untuk mendapatkan jumlah elemen dalam antrian
    public int size() {
        return size;
    }

    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue(5);

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println("Elemen depan: " + queue.front());
        System.out.println("Ukuran antrian: " + queue.size());

        System.out.println("Elemen yang dihapus: " + queue.dequeue());
        System.out.println("Elemen yang dihapus: " + queue.dequeue());

        System.out.println("Ukuran antrian sekarang: " + queue.size());

        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6); // Akan mencetak pesan bahwa antrian penuh

        System.out.println("Ukuran antrian sekarang: " + queue.size());
    }
}

