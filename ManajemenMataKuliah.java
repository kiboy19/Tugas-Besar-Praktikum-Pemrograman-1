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

    /* Bagian Bima
  Fungsi Letakan Disini
  Akhir Bagian Bima */


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
/* Bagian Azis
  Fungsi Letakan Disini
  Akhir Bagian Azis */

/* Bagian Aldi
  Fungsi Letakan Disini
  Akhir Bagian Azis */
//MASUKAN FUNGSINYA DIATAS INI.
}
