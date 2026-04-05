public class dosen04 {
    String kode;
    String nama;
    Boolean jenisKelamin; 
    int usia;

    public dosen04(String kode, String nama, Boolean jk, int umur) {
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jk;
        this.usia = umur;
    }

    public void tampil() {
        System.out.println("Kode Dosen    : " + kode);
        System.out.println("Nama          : " + nama);
        System.out.println("Jenis Kelamin : " + (jenisKelamin ? "Pria" : "Wanita")); 
        System.out.println("Usia          : " + usia + " tahun");
    }
}
