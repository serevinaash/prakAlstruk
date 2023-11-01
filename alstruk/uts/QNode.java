// Node untuk menyimpan elemen antrian
class QNode {
    public int key;
    public QNode next;

    // Konstruktor untuk membuat node linked list baru
    public QNode(int key) {
        this.key = key;
        this.next = null;
    }
}

// Kelas untuk merepresentasikan sebuah antrian
class Queue {
    public QNode front, rear;

    public Queue() {
        this.front = this.rear = null;
    }

    // Method untuk menambahkan elemen ke antrian
    public void enqueue(int key) {
        // Membuat node baru
        QNode temp = new QNode(key);

        // Jika antrian kosong, maka node baru menjadi front dan rear
        if (this.rear == null) {
            this.front = this.rear = temp;
            return;
        }

        // Menambahkan node baru di belakang rear dan mengubah rear
        this.rear.next = temp;
        this.rear = temp;
    }
}
