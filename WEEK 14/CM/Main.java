import java.util.Scanner;

public class Main {
    static Barang[] arrBarang = new Barang[5];
    static DLL listTransaksi = new DLL(); // Panggil class DLL
    static int idTransaksi = 1;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Data awal
        arrBarang[0] = new Barang("B01", "Printer", 750000, 10);
        arrBarang[1] = new Barang("B02", "Mouse", 150000, 50);
        arrBarang[2] = new Barang("B03", "Keyboard", 300000, 30);
        arrBarang[3] = new Barang("B04", "Flashdisk", 80000, 0); 
        arrBarang[4] = new Barang("B05", "Monitor", 1200000, 15);

        int pilih;
        do {
            System.out.println("\n== MENU KASIR ==");
            System.out.println("1. Tambah Transaksi");
            System.out.println("2. Lihat Data");
            System.out.println("3. Sorting Nama (Asc)");
            System.out.println("4. Exit");
            System.out.print("Pilih: ");
            pilih = input.nextInt();
            input.nextLine(); 

            switch (pilih) {
                case 1:
                    prosesTransaksi(input);
                    break;
                case 2:
                    listTransaksi.cetakSemua();
                    break;
                case 3:
                    listTransaksi.urutkanNama();
                    listTransaksi.cetakSemua();
                    break;
                case 4:
                    System.out.println("Dadah!");
                    break;
                default:
                    System.out.println("Salah masukin angka.");
            }
        } while (pilih != 4);
        
        input.close();
    }

    static void prosesTransaksi(Scanner input) {
        System.out.println("\n-- List Barang --");
        for (Barang b : arrBarang) {
            System.out.println(b.kode + " - " + b.nama + " (Rp" + b.harga + ") Stok: " + b.stok);
        }

        System.out.print("\nKode Barang: ");
        String kode = input.nextLine();

        Barang cariBrg = null;
        for (Barang b : arrBarang) {
            if (b.kode.equalsIgnoreCase(kode)) {
                cariBrg = b;
                break;
            }
        }

        if (cariBrg == null) {
            System.out.println("Barang tidak ditemukan.");
            return;
        }

        if (cariBrg.stok <= 0) {
            System.out.println("Stok barang habis.");
            return;
        }

        System.out.print("Jumlah Beli: ");
        int jmlBeli = input.nextInt();
        input.nextLine(); 

        if (jmlBeli > cariBrg.stok) {
            System.out.println("Stok kurang, sisa " + cariBrg.stok);
            return;
        }

        cariBrg.stok -= jmlBeli;
        double hrgAwal = jmlBeli * cariBrg.harga;
        double dskn = 0;

        System.out.print("Punya member? (y/n): ");
        String member = input.nextLine();

        if (hrgAwal > 500000) {
            dskn += 0.05;
            System.out.println("Diskon 5% karena belanja > 500rb");
        }
        
        if (member.equalsIgnoreCase("y")) {
            dskn += 0.02;
            System.out.println("Dapat diskon member 2%");
        }

        double totalAkhir = hrgAwal - (hrgAwal * dskn);

        Transaksi transaksiBaru = new Transaksi(idTransaksi++, cariBrg, jmlBeli, totalAkhir);
        listTransaksi.tambah(transaksiBaru);

        System.out.println("\n-- Struk --");
        System.out.println("ID Trx : " + transaksiBaru.idTrx);
        System.out.println("Barang : " + cariBrg.nama);
        System.out.println("Total  : Rp " + totalAkhir);
    }
}