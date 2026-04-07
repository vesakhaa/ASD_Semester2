import java.util.Scanner;

public class dosenMain04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Menentukan total kapasitas maksimal sistem di awal
        System.out.print("Masukkan total maksimal dosen yang dapat ditampung sistem: ");
        int kapasitasSistem = sc.nextInt();
        dataDosen04 listDosen = new dataDosen04(kapasitasSistem);
        
        int menu;

        do {
            System.out.println("\n==================================");
            System.out.println("    Sistem Manajemen Data Dosen   ");
            System.out.println("==================================");
            System.out.println("1. Tambah Data Dosen (Multiple)");
            System.out.println("2. Tampil Data Seluruh Dosen");
            System.out.println("3. Sorting ASC (Usia Termuda ke Tertua)");
            System.out.println("4. Sorting DSC (Usia Tertua ke Termuda)");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");
            menu = sc.nextInt();
            sc.nextLine(); 

            switch (menu) {
                case 1:
                    System.out.print("\nMasukkan jumlah dosen: ");
                    int n = sc.nextInt();
                    sc.nextLine(); 

                    for (int i = 0; i < n; i++) {
                        System.out.println("\n--- Input Data Dosen ke-" + (i + 1) + " ---");
                        System.out.print("Kode Dosen   : ");
                        String kode = sc.nextLine();
                        
                        System.out.print("Nama Dosen   : ");
                        String nama = sc.nextLine();
                        
                        System.out.print("Jenis Kelamin (Laki-laki / Perempuan): ");
                        String inputJK = sc.nextLine(); 
                        

                        Boolean jk;
                        if (inputJK.equalsIgnoreCase("Laki-laki") || inputJK.equalsIgnoreCase("L")) {
                            jk = true; 
                        } else {
                            jk = false; 
                        }
                        
                        System.out.print("Usia         : ");
                        int usia = sc.nextInt();
                        sc.nextLine(); 

                        dosen04 dsnBaru = new dosen04(kode, nama, jk, usia);
                        listDosen.tambah(dsnBaru);
                    }
                    System.out.println("\n[Selesai] " + n + " data dosen telah diproses.");
                    break;

                case 2:
                    System.out.println("\n--- Data Seluruh Dosen ---");
                    listDosen.tampil();
                    break;

                case 3:
                    listDosen.SortingASC();
                    listDosen.tampil(); 
                    break;

                case 4:
                    listDosen.sortingDSC();
                    listDosen.tampil(); 
                    break;

                case 5:
                    System.out.println("\nTerima kasih telah menggunakan program ini.");
                    break;

                default:
                    System.out.println("\n[ERROR] Pilihan menu tidak valid!");
            }
        } while (menu != 5);
        
        sc.close();
    }
}