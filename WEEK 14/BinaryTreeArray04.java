public class BinaryTreeArray04 {
    Mahasiswa04[] dataMahasiswa;
    int idxLast;

    public BinaryTreeArray04() {
        this.dataMahasiswa = new Mahasiswa04[10];
    }

    void populateData(Mahasiswa04 dataMhs[], int idxLast) {
        this.dataMahasiswa = dataMhs;
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                // Formula indeks anak kiri: 2 * i + 1
                traverseInOrder(2 * idxStart + 1);
                
                // Menampilkan informasi data saat ini
                dataMahasiswa[idxStart].tampilInformasi();
                
                // Formula indeks anak kanan: 2 * i + 2
                traverseInOrder(2 * idxStart + 2);
            }
        }
    }
}