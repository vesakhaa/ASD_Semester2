public class dosen04 {
    String idDosen;
    String namaDosen;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    public dosen04() {
    }

    public dosen04(String idDosen, String namaDosen, boolean statusAktif, int tahunBergabung, String bidangKeahlian) {
        this.idDosen = idDosen;
        this.namaDosen = namaDosen;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
    }

    void tampilkanInformasi(){
        System.out.println("ID Dosen: " + idDosen);
        System.out.println("Nama Dosen: " + namaDosen);
        System.out.println("Status Aktif: " + (statusAktif ? "Aktif" : "Tidak Aktif"));
        System.out.println("Tahun Bergabung: " + tahunBergabung);
        System.out.println("Bidang Keahlian: " + bidangKeahlian);
    }

    void setStatusAktif(boolean statusBaru){
        statusAktif = statusBaru;
    }

    int hitungMasaKerja(int tahunSekarang){
        return tahunSekarang - tahunBergabung;
    }

    void ubahBidangKeahlian(String bidangBaru){
        bidangKeahlian = bidangBaru;
    }
}
