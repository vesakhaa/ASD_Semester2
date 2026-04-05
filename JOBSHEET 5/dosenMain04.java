import java.util.Scanner;

public class dosenMain04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Memanggil class yang baru
        dataDosen04 listDosen = new dataDosen04();
        int menu;

        do {
            System.out.println("\n==================================");
            System.out.println("    Sistem Manajemen Data Dosen   ");
            System.out.println("==================================");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampil Data Seluruh Dosen");
            System.out.println("3. Sorting ASC (Usia Termuda ke Tertua)");
            System.out.println("4. Sorting DSC (Usia Tertua ke Termuda)");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");
            menu = sc.nextInt();
            sc.nextLine(); // Membersihkan buffer enter

            switch (menu) {
                case 1:
                    System.out.println("\n--- Masukkan Data Dosen Baru ---");
                    System.out.print("Kode Dosen   : ");
                    String kode = sc.nextLine();
                    
                    System.out.print("Nama Dosen   : ");
                    String nama = sc.nextLine();
                    
                    System.out.print("Jenis Kelamin (L/P atau Laki-laki/Perempuan): ");
                    String inputJK = sc.nextLine(); 
                    
                    Boolean jk;

                    if (inputJK.equalsIgnoreCase("L") || inputJK.equalsIgnoreCase("Laki-laki") || inputJK.equalsIgnoreCase("l")) {
                        jk = true;
                    } else {
                        jk = false; 
                    }
                    
                    System.out.print("Usia         : ");
                    int usia = sc.nextInt();
                    sc.nextLine(); 


                    dosen04 dsnBaru = new dosen04(kode, nama, jk, usia);
                    listDosen.tambah(dsnBaru);
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