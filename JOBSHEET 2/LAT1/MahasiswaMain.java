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

    }
}
