package tubes;

import java.util.Scanner;

public class Main {
//Masukan Fungsinya Dibawah ini
  public static void main(String[] args) {
        ManajemenMataKuliah manajemenMataKuliah = new ManajemenMataKuliah();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== Sistem Manajemen Mata Kuliah UAAAAB - Universitas Ariel Azis Arley Aldi Bima ===");
            System.out.println("1. Tambah Mata Kuliah (Head)");
            System.out.println("2. Tambah Mata Kuliah (Tail)");
            System.out.println("3. Tambah Mata Kuliah (Mid)");
            System.out.println("4. Hapus Mata Kuliah (Head)");
            System.out.println("5. Hapus Mata Kuliah (Tail)");
            System.out.println("6. Hapus Mata Kuliah (Mid)");
            System.out.println("7. Cari Mata Kuliah");
            System.out.println("8. Perbarui Mata Kuliah");
            System.out.println("9. Tampilkan Semua Mata Kuliah");
            System.out.println("10. Keluar");
            System.out.print("Pilihan: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Membuang newline

            switch (choice) {
                case 1:
                    manajemenMataKuliah.addMataKuliahHead(inputMataKuliah(scanner));
                    break;
                case 2:
                    manajemenMataKuliah.addMataKuliahTail(inputMataKuliah(scanner));
                    break;
                case 3:
                    System.out.print("Masukkan posisi indeks: ");
                    int index = scanner.nextInt();
                    scanner.nextLine();
                    manajemenMataKuliah.addMataKuliahMid(index, inputMataKuliah(scanner));
                    break;
                case 4:
                    manajemenMataKuliah.removeMataKuliahHead();
                    break;
                case 5:
                    manajemenMataKuliah.removeMataKuliahTail();
                    break;
                case 6:
                    System.out.print("Masukkan posisi indeks: ");
                    int delIndex = scanner.nextInt();
                    scanner.nextLine();
                    manajemenMataKuliah.removeMataKuliahMid(delIndex);
                    break;
                case 7:
                    System.out.print("Masukkan kode mata kuliah: ");
                    String kodeCari = scanner.nextLine();
                    MataKuliah mataKuliah = manajemenMataKuliah.searchMataKuliah(kodeCari);
                    if (mataKuliah != null) {
                        System.out.println("Mata kuliah ditemukan: " + mataKuliah);
                    } else {
                        System.out.println("Mata kuliah tidak ditemukan");
                    }
                    break;
                case 8:
                    System.out.print("Masukkan kode mata kuliah: ");
                    String kodeUpdate = scanner.nextLine();
                    System.out.print("Masukkan nama baru: ");
                    String namaBaru = scanner.nextLine();
                    System.out.print("Masukkan SKS baru: ");
                    int sksBaru = scanner.nextInt();
                    scanner.nextLine();
                    manajemenMataKuliah.updateMataKuliah(kodeUpdate, namaBaru, sksBaru);
                    break;
                case 9:
                    manajemenMataKuliah.displayMataKuliah();
                    break;
                case 10:
                    System.out.println("Keluar dari program...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
            }
        } while (choice != 10);

        scanner.close();
    }

    private static MataKuliah inputMataKuliah(Scanner scanner) {
        System.out.print("Masukkan kode mata kuliah: ");
        String kode = scanner.nextLine();
        System.out.print("Masukkan nama mata kuliah: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan SKS mata kuliah: ");
        int sks = scanner.nextInt();
        scanner.nextLine();
        return new MataKuliah(kode, nama, sks);
    }

//Masukan Fungsinya Diatas Ini
}
