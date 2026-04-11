public class Peminjaman04 {
    public MahasiswaCM04 mhs; // Relasi object [cite: 44]
    public Buku04 buku; // Relasi object [cite: 45]
    public int lamaPinjam;
    public int batasPinjam = 5; // Ketentuan 
    public int terlambat;
    public int denda;

    public Peminjaman04(MahasiswaCM04 mhs, Buku04 buku, int lamaPinjam) {
        this.mhs = mhs;
        this.buku = buku;
        this.lamaPinjam = lamaPinjam;
        hitungDenda04(); // Perhitungan otomatis saat instansiasi [cite: 50]
    }

    public void hitungDenda04() {
        terlambat = lamaPinjam - batasPinjam;
        if (terlambat > 0) {
            denda = terlambat * 2000; // Denda Rp 2.000 per hari 
        } else {
            terlambat = 0;
            denda = 0; // Jika tidak terlambat, denda 0 [cite: 27]
        }
    }

    public void tampilPeminjaman04() {
        System.out.printf("%-10s | %-12s | Lama: %-2d | Terlambat: %-2d | Denda: %-5d\n", 
            mhs.nama, buku.judul, lamaPinjam, terlambat, denda);
    }
}