package tubes;

import java.util.LinkedList;
import java.util.List;

public class ManajemenMataKuliah {
    private List<MataKuliah> mataKuliahList;
//MASUKAN FUNGSINYA DIBAWAH INI.
 
public ManajemenMatakuliah() {
        mataKuliahList = new LinkedList<>();
    }

public void addMatakuliahHead(MataKuliah mataKuliah) {
        mataKuliahList.add(0, mataKuliah);
    }

public void addMataKuliahTail(MataKuliah mataKuliah) {
        mataKuliahList.add(mataKuliah);
    }

    // Bagian Bima
    public void addMataKuliahMid(int index, MataKuliah mataKuliah) {
        if (index >= 0 && index <= mataKuliahList.size()) {
            mataKuliahList.add(index, mataKuliah);
        } else {
            System.out.println("Indeks di luar jangkauan");
        }
    }

    public void removeMataKuliahHead() {
        if (!mataKuliahList.isEmpty()) {
            mataKuliahList.remove(0);
        } else {
            System.out.println("Daftar mata kuliah kosong");
        }
    }


    public void removeMataKuliahTail() {
        if (!mataKuliahList.isEmpty()) {
            mataKuliahList.remove(mataKuliahList.size() - 1);
        } else {
            System.out.println("Daftar mata kuliah kosong");
        }
    }

    public void removeMataKuliahMid(int index) {
        if (index >= 0 && index < mataKuliahList.size()) {
            mataKuliahList.remove(index);
        } else {
            System.out.println("Indeks di luar jangkauan");
        }
    }
// Bagian Azis

public MataKuliah searchMataKuliah(String kode) {
        for (MataKuliah mataKuliah : mataKuliahList) {
            if (mataKuliah.getKode().equals(kode)) {
                return mataKuliah;
            }
        }
        return null;
    }

    public void updateMataKuliah(String kode, String nama, int sks) {
        MataKuliah mataKuliah = searchMataKuliah(kode);
        if (mataKuliah != null) {
            mataKuliah.setNama(nama);
            mataKuliah.setSks(sks);
        } else {
            System.out.println("Mata kuliah tidak ditemukan");
        }
    }
// Bagian Aldi

-- ManajemenMatakuliah --
        public void displayMataKuliah() {
        if (mataKuliahList.isEmpty()) {
            System.out.println("Daftar mata kuliah kosong");
        } else {
            for (MataKuliah mataKuliah : mataKuliahList) {
                System.out.println(mataKuliah);
            }
        }
    }

    public int size() {
        return mataKuliahList.size();
    }

-- Main --
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
}
