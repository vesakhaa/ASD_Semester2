class MahasiswaMain {
    public static void main(String[] args) {
        Mahasiswa04 mhs1 = new Mahasiswa04();
        mhs1.nama = "Muhhammad Ali Farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2K");
        mhs1.updateIPK(3.6);

        System.out.println("\nSetelah perubahan: \n");
        mhs1.tampilkanInformasi();

        System.out.println("\n\n");


        Mahasiswa04 mhs2 = new Mahasiswa04("Annisa Nabila", "2141720160", "TI 2L", 3.25);
        mhs2.tampilkanInformasi();
        mhs2.updateIPK(3.30);

        System.out.println("\nSetelah perubahan: \n");

        mhs2.tampilkanInformasi();

        System.out.println("\n\n");

        Mahasiswa04 Vesakhagotama04 = new Mahasiswa04("Ananda Vesakhagotama", "254107060025", "SIb iC", 3.89);
        Vesakhagotama04.tampilkanInformasi();

    }
}