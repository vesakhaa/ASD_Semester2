public class dataDosen04 {
    dosen04[] dataDosen; 
    int idx = 0;

    public dataDosen04(int kapasitas) {
        dataDosen = new dosen04[kapasitas];
    }

    public void tambah(dosen04 dsn) {
        if (idx < dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
        } else {
            System.out.println("[PERINGATAN] Kapasitas penyimpanan dosen sudah penuh!");
        }
    }

    public void tampil() {
        if (idx == 0) {
            System.out.println("Data dosen masih kosong.");
        } else {
            for (int i = 0; i < idx; i++) {
                if (dataDosen[i] != null) {
                    System.out.println("--- Dosen ke-" + (i + 1) + " ---");
                    dataDosen[i].tampil();
                }
            }
        }
    }

    public void SortingASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 1; j < idx - i; j++) {
                if (dataDosen[j] != null && dataDosen[j-1] != null) {
                    if (dataDosen[j].usia < dataDosen[j - 1].usia) {
                        dosen04 temp = dataDosen[j];
                        dataDosen[j] = dataDosen[j - 1];
                        dataDosen[j - 1] = temp;
                    }
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
            while (j >= 0 && dataDosen[j] != null && dataDosen[j].usia < temp.usia) {
                dataDosen[j + 1] = dataDosen[j];
                j--;
            }
            dataDosen[j + 1] = temp;
        }
        System.out.println("\n[INFO] Berhasil diurutkan DSC (Tertua-Termuda) dengan Insertion Sort.");
    }
}