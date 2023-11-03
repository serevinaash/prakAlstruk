public class SortingMahasiswa {
    public static void main(String[] args) {
        String[] mahasiswa = {"Budi", "Ani", "Citra", "David", "Eka"};

        System.out.println("Sebelum diurutkan:");
        printArray(mahasiswa);

        shellSort(mahasiswa);

        System.out.println("Setelah diurutkan:");
        printArray(mahasiswa);
    }

    public static void shellSort(String[] arr) {
        int n = arr.length;
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                String temp = arr[i];
                int j;
                for (j = i; j >= gap && arr[j - gap].compareTo(temp) > 0; j -= gap) {
                    arr[j] = arr[j - gap];
                }
                arr[j] = temp;
            }
        }
    }

    public static void printArray(String[] arr) {
        for (String s : arr) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}