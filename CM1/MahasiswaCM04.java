public class MahasiswaCM04 {
    String NIM;
    String nama;
    String prodi;

    public MahasiswaCM04(String NIM, String nama, String prodi) {
        this.NIM = NIM;
        this.nama = nama;
        this.prodi = prodi;
    }
    
    public void tampilMahasiswa04() {
    System.out.println("NIM   : " + NIM);
    System.out.println("Nama  : " + nama);
    System.out.println("Prodi : " + prodi);
    System.out.println("-------------------------");
}
}
