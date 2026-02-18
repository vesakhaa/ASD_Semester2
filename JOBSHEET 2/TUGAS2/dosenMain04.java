public class dosenMain04 {
    public static void main(String[] args) {
        dosen04 dosen1 = new dosen04();
        dosen1.idDosen = "D001";
        dosen1.namaDosen = "Dr. Ahmad Rifki";
        dosen1.statusAktif = true;
        dosen1.tahunBergabung = 2010;
        dosen1.bidangKeahlian = "Algoritma dan Struktur Data";
        dosen1.tampilkanInformasi();

        dosen1.ubahBidangKeahlian("Pemrograman Berorientasi Objek");
        dosen1.hitungMasaKerja(2026);

        System.out.println("\nSetelah Perubahan\n");
        dosen1.tampilkanInformasi();

        System.out.println("\n\n");

        dosen04 dosen2 = new dosen04("D002","Dr. Farelyan", false, 2009, "Sistem Operasi");
        dosen2.tampilkanInformasi();

        dosen2.setStatusAktif(true);
        dosen2.ubahBidangKeahlian("Basis Data");
        System.out.println("\nSetelah Perubahan\n");
        dosen2.tampilkanInformasi();
    }
}
