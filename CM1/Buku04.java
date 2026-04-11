public class Buku04 {
    public String kodeBuku, judul;
    public int tahunTerbit; // Atribut sesuai spesifikasi [cite: 36, 37, 38]

    public Buku04(String kode, String judul, int tahun) {
        this.kodeBuku = kode;
        this.judul = judul;
        this.tahunTerbit = tahun;
    }

    public void tampilBuku04() {
        System.out.println("Kode: " + kodeBuku + " | Judul: " + judul + " | Tahun: " + tahunTerbit);
    }
}