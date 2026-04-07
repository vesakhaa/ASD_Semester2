import java.util.Scanner;

public class mahasiswaDemo04 {

    
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        Scanner input = new Scanner(System.in); 
        System.out.print("Masukkan jumlah mahasiswa yang akan diinput: ");
        int jumlahMhs = 5;

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

            mahasiswa04 m = new mahasiswa04(nim, nama, kelas, ipk);

            list.tambah(m);
        }

        System.out.println("\n----------------------------------------------");
        // System.out.println("Data mahasiswa sebelum sorting: ");

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

        System.out.println("\nMenggunakan Sequential Seacrhing:");
        double posisi = list.sequentialSearching(cari);
        int pss = (int) posisi;
        list.tampilPosisi(cari, pss);
        list.tampilDataSearch(cari, pss);
    } 
} 