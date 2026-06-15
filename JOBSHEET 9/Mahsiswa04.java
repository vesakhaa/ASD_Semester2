public class Mahsiswa04 {
    String NIM;
    String Nama;
    String Kelas;
    int nilai;

    public Mahsiswa04() {
    }

    public Mahsiswa04(String NIM, String Nama, String Kelas, int nilai) {
        this.NIM = NIM;
        this.Nama = Nama;
        this.Kelas = Kelas;
        this.nilai = -1;
    }

    void tugasDinilai(int nilai) {
        this.nilai = nilai;
    }


}
