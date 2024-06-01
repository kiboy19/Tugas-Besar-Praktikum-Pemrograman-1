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
//MASUKAN FUNGSINYA DIATAS INI.
}
