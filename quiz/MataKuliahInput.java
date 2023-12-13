import java.util.*;

public class MataKuliahInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> mataKuliahHashMap = new HashMap<>();
        LinkedList<String> mataKuliahList = new LinkedList<>();

        boolean exit = false;

        while (!exit) {
            System.out.println("==================================");
            System.out.println("Menu:");
            System.out.println("1. Tambah Mata Kuliah");
            System.out.println("2. Tampilkan Daftar Mata Kuliah");
            System.out.println("3. Edit Jumlah SKS Mata Kuliah");
            System.out.println("4. Hapus Mata Kuliah");
            System.out.println("5. Cari Mata Kuliah");
            System.out.println("6. Keluar");
            System.out.println("==================================");
            


            System.out.print("Pilih menu: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Membuang karakter newline

            switch (choice) {
                case 1:
                    System.out.print("Masukkan nama mata kuliah: ");
                    String namaMK = scanner.nextLine();

                    System.out.print("Masukkan jumlah SKS: ");
                    int sks = scanner.nextInt();
                    scanner.nextLine(); // Membuang karakter newline

                    mataKuliahHashMap.put(namaMK, sks);
                    mataKuliahList.add(namaMK);
                    System.out.println("Mata kuliah '" + namaMK + "' dengan " + sks + " SKS telah ditambahkan.");
                    break;
                case 2:
                    System.out.println("Daftar Mata Kuliah:");
                    if (mataKuliahList.isEmpty()) {
                        System.out.println("Belum ada mata kuliah yang ditambahkan.");
                    } else {
                        for (String mataKuliah : mataKuliahList) {
                            System.out.println("- " + mataKuliah + " (SKS: " + mataKuliahHashMap.get(mataKuliah) + ")");
                        }
                    }
                    break;
                case 3:
                    System.out.print("Masukkan nama mata kuliah yang ingin diedit jumlah SKS: ");
                    String namaMKEdit = scanner.nextLine();

                    if (mataKuliahList.contains(namaMKEdit)) {
                        System.out.print("Masukkan jumlah SKS baru: ");
                        int newSKS = scanner.nextInt();
                        scanner.nextLine(); // Membuang karakter newline

                        mataKuliahHashMap.put(namaMKEdit, newSKS);
                        System.out.println("Jumlah SKS mata kuliah '" + namaMKEdit + "' berhasil diubah menjadi " + newSKS);
                    } else {
                        System.out.println("Mata kuliah tidak ditemukan.");
                    }
                    break;
                case 4:
                    System.out.print("Masukkan nama mata kuliah yang ingin dihapus: ");
                    String namaMkhapus = scanner.nextLine();

                    if (mataKuliahList.contains(namaMkhapus)) {
                        mataKuliahList.remove(namaMkhapus);
                        mataKuliahHashMap.remove(namaMkhapus);
                        System.out.println("Mata kuliah '" + namaMkhapus + "' berhasil dihapus.");
                    } else {
                        System.out.println("Mata kuliah tidak ditemukan.");
                    }
                    break;
                case 5:
                    System.out.print("Masukkan nama mata kuliah yang ingin dicari: ");
                    String mataKuliahCari = scanner.nextLine();

                    if (mataKuliahList.contains(mataKuliahCari)) {
                        System.out.println("Mata kuliah '" + mataKuliahCari + "' ditemukan dengan SKS: " + mataKuliahHashMap.get(mataKuliahCari));
                    } else {
                        System.out.println("Mata kuliah tidak ditemukan.");
                    }
                    break;
                case 6:
                    System.out.println("Program berhenti.");
                    exit = true;
                    break;
                default:
                    System.out.println("Pilihan tidak valid, silakan pilih lagi.");
                    break;
            }
        }

        scanner.close();
    }
}
