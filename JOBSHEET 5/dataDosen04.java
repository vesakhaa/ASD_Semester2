public class dataDosen04 {
    dosen04[] dataDosen = new dosen04[10];
    int idx = 0;

    public void tambah(dosen04 dsn) {
        if (idx < dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
            System.out.println("Data dosen berhasil ditambahkan!");
        } else {
            System.out.println("Kapasitas data dosen sudah penuh (Maksimal 10)!");
        }
    }

    public void tampil() {
        if (idx == 0) {
            System.out.println("Data dosen masih kosong.");
        } else {
            for (int i = 0; i < idx; i++) {
                System.out.println("--- Dosen ke-" + (i + 1) + " ---");
                dataDosen[i].tampil();
            }
        }
    }

    public void SortingASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 1; j < idx - i; j++) {
                if (dataDosen[j].usia < dataDosen[j - 1].usia) {
                    dosen04 temp = dataDosen[j];
                    dataDosen[j] = dataDosen[j - 1];
                    dataDosen[j - 1] = temp;
                }
            }
        }
        System.out.println("\n[INFO] Berhasil diurutkan ASC (Termuda-Tertua) dengan Bubble Sort.");
    }
 
    public void sortingDSC() {
        insertionSort(); 
    }

    public void insertionSort() {
        for (int i = 1; i < idx; i++) {
            dosen04 temp = dataDosen[i];
            int j = i - 1;
            while (j >= 0 && dataDosen[j].usia < temp.usia) {
                dataDosen[j + 1] = dataDosen[j];
                j--;
            }
            dataDosen[j + 1] = temp;
        }
        System.out.println("\n[INFO] Berhasil diurutkan DSC (Tertua-Termuda) dengan Insertion Sort.");
    }
}
