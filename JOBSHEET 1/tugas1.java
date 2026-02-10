
import java.util.Scanner;


public class tugas1 {
    public static void main(String[] args) {
        char[] kodePlat = {'A', 'B', 'D', 'E', 'F','G', 'H', 'L', 'N', 'T'};

        String[] Kota = {
            "Banten",
            "Jakarta",
            "Bandung",
            "Cirebon",
            "Bogor",
            "Pekalongan",
            "Semarang",
            "Surabaya",
            "Malang",
            "Tegal"
        };

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan kode plat kendaraan (huruf kapital): ");
        char kode = input.next().charAt(0);

        boolean ditemukan = false;
        for (int i = 0; i < kodePlat.length; i++) {
           if (kodePlat[i]==kode){
                System.out.println("Kota asal kendaraan dengan kode plat " + kode + " adalah " + Kota[i]);
                ditemukan = true;
                break;
            
           }
        }
        if (!ditemukan) {
            System.out.println("Kode plat kendaraan tidak ditemukan.");
        }
    }
}
