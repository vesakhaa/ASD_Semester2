
import java.util.Scanner;

public class mahasiswaDemo04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa yang akan diinput: ");
        int jumlahMhs = sc.nextInt();
        sc.nextLine(); 

        mahasiswaBerprestasi list = new mahasiswaBerprestasi(jumlahMhs);

        for (int i = 0; i < jumlahMhs; i++) {
            System.out.println("\n--- Masukkan data mahasiswa ke-" + (i + 1) + " ---");
            System.out.print("NIM   : ");
            String nim = input.nextLine();

            System.out.print("Nama  : ");
            String nama = input.nextLine();

            System.out.print("Kelas : ");
            String kelas = input.nextLine();

            System.out.print("IPK   : ");
            double ipk = sc.nextDouble();
            sc.nextLine();

            mahasiswa04 m = new mahasiswa04(nim, nama, kelas, ipk);

            list.tambah(m);
        }

        System.out.println("\n----------------------------------------------");
        // System.out.println("Data mahasiswa sebelum sorting: ");

        System.out.println("Mengurutkan data mahasiswa");
        list.selectionSort();
        list.tampil();

        // System.out.println("\n----------------------------------------------");
        // System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (DESC): ");
        // list.bubbleSort();
        // list.tampil();
        // System.out.println("\n----------------------------------------------");
        // System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC):");
        // list.selectionSort();
        // list.tampil();
        // System.out.println("\n----------------------------------------------");
        // System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (ASC):");    
        // list.insertionSort();
        // list.tampil();
        System.out.println("-----------------------------------------------");
        System.out.println("Pencarian Data");
        System.out.println("-----------------------------------------------");
        System.out.println("Masukkan IPK mahasiswa yang ingin dicari: ");
        double cari = sc.nextDouble();

        System.out.println("--------------------------------");
        System.out.println("Menggunakan Sequential Seacrhing:");
        System.out.println("--------------------------------");
        double posisi = list.sequentialSearching(cari);
        int pss = (int) posisi;
        list.tampilPosisi(cari, pss);
        list.tampilDataSearch(cari, pss);

        System.out.println("--------------------------------");
        System.out.println("Menggunakan Binary Seacrhing:");
        System.out.println("--------------------------------");
        double posisi2 = list.findBinarySearch(cari, 0, jumlahMhs - 1);
        int pss2 = (int) posisi2;
        list.tampilPosisi(cari, pss2);
        list.tampilDataSearch(cari, pss2);

    input.close();
    sc.close();

    }

    
}
