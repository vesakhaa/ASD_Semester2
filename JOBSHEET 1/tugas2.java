import java.util.Scanner;

public class tugas2 {

    static Scanner input = new Scanner(System.in);

    static String[][] jadwal; 
    static int jumlah = 0;    
    static int n;             

    public static void main(String[] args) {

        System.out.print("Masukkan jumlah jadwal kuliah (n): ");
        n = input.nextInt();
        input.nextLine();

        jadwal = new String[n][4];

        tambahData();

        tampilData();

        cariHari();

        cariMatkul();
    }

    public static void tambahData() {

        System.out.println("\n=== INPUT DATA JADWAL KULIAH ===");

        for (int i = 0; i < n; i++) {

            System.out.println("\nJadwal ke-" + (i + 1));

            System.out.print("Mata Kuliah : ");
            jadwal[i][0] = input.nextLine();

            System.out.print("Ruang       : ");
            jadwal[i][1] = input.nextLine();

            System.out.print("Hari        : ");
            jadwal[i][2] = input.nextLine();

            System.out.print("Waktu       : ");
            jadwal[i][3] = input.nextLine();

            jumlah++;
        }

        System.out.println("\nData jadwal kuliah berhasil ditambahkan semua.");
    }


    public static void tampilData() {

        System.out.println("\n=== DAFTAR JADWAL KULIAH ===");

        System.out.printf("%-3s %-25s %-20s %-10s %-15s%n",
                "No", "Mata Kuliah", "Ruang", "Hari", "Waktu");
        System.out.println("---------------------------------------------------------------------");

        for (int i = 0; i < jumlah; i++) {
            System.out.printf("%-3d %-25s %-20s %-10s %-15s%n",
                    i + 1,
                    jadwal[i][0],
                    jadwal[i][1],
                    jadwal[i][2],
                    jadwal[i][3]);
        }
    }


    public static void cariHari() {

        System.out.print("\nMasukkan hari yang ingin dicari: ");
        String cariHari = input.nextLine();

        System.out.println("\n=== JADWAL KULIAH PADA HARI " + cariHari.toUpperCase() + " ===");

        boolean ditemukan = false;

        for (int i = 0; i < jumlah; i++) {
            if (jadwal[i][2].equalsIgnoreCase(cariHari)) {

                System.out.println("- " + jadwal[i][0] +
                        " | Ruang: " + jadwal[i][1] +
                        " | Waktu: " + jadwal[i][3]);

                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Tidak ada jadwal kuliah pada hari tersebut.");
        }
    }


    public static void cariMatkul() {

        System.out.print("\nMasukkan mata kuliah yang ingin dicari: ");
        String cariMatkul = input.nextLine();

        System.out.println("\n=== JADWAL KULIAH UNTUK MATA KULIAH " + cariMatkul.toUpperCase() + " ===");

        boolean ditemukan = false;

        for (int i = 0; i < jumlah; i++) {
            if (jadwal[i][0].equalsIgnoreCase(cariMatkul)) {

                System.out.println("Mata Kuliah : " + jadwal[i][0]);
                System.out.println("Ruang       : " + jadwal[i][1]);
                System.out.println("Hari        : " + jadwal[i][2]);
                System.out.println("Waktu       : " + jadwal[i][3]);

                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Tidak ada jadwal kuliah untuk mata kuliah tersebut.");
        }
    }
}
