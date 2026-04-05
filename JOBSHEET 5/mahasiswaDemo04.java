public class mahasiswaDemo04 {

    public static void main(String[] args) {
    mahasiswaBerprestasi list = new mahasiswaBerprestasi();

    mahasiswa04 m1 = new mahasiswa04("123", "Zidan","2A", 3.2);
    mahasiswa04 m2 = new mahasiswa04("124", "Ayu", "2A", 3.5);
    mahasiswa04 m3 = new mahasiswa04("125", "Sofi", "2A", 3.1);
    mahasiswa04 m4 = new mahasiswa04("126", "Sita", "2A", 3.9);
    mahasiswa04 m5 = new mahasiswa04("127", "Miki", "2A", 3.7);

    list.tambah(m1);
    list.tambah(m2);
    list.tambah(m3);
    list.tambah(m4);
    list.tambah(m5);

    System.out.println("Data mahasiswa sebelum sorting: ");
    list.tampil();

    System.out.println("\n");

    System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (DESC): ");
    list.bubbleSort();
    list.tampil();

    }
}
