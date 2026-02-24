public class mataKuliahMain04 {
    public static void main(String[] args) {
        mataKuliah04 matKul1 = new mataKuliah04();
        matKul1.kodeMK = "ASD";
        matKul1.namaMK = "Algoritma dan Struktur Data";
        matKul1.sks = 3;
        matKul1.jumlahJam = 4;
        matKul1.tampilkanInformasi();

        matKul1.ubahSKS(4);
        matKul1.tambahJam(2);

        System.out.println("\nSetelah Perubahan\n");
        matKul1.tampilkanInformasi();

        System.out.println("\n\n");


        mataKuliah04 matKul2 = new mataKuliah04("PASD", "Praktikum Algoritma dan Struktur Data", 3, 6);
        matKul2.tampilkanInformasi();

        matKul2.kurangiJam(2);
        
        System.out.println("\nSetelah Perubahan\n");
        matKul2.tampilkanInformasi();
    }
}
