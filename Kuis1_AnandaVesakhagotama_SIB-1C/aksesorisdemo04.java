import java.util.Scanner;

public class aksesorisdemo04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        aksesoris04[] arrayAksesoris = new aksesoris04[5];

        for(int i = 0; i < arrayAksesoris.length; i++) {
            arrayAksesoris[i] = new aksesoris04("", "", 0, 0, 0);
            System.out.println("Masukkan data aksesoris "+ (i + 1) + " :");
            System.out.println("================================");

            System.out.print("Masukkan nama: ");
            arrayAksesoris[i].nama = input.nextLine();

            System.out.print("Masukkan kategori: ");
            arrayAksesoris[i].kategori = input.nextLine();

            System.out.print("Masukkan harga: ");
            arrayAksesoris[i].harga = input.nextInt();
            input.nextLine(); // bersihkan newline

            System.out.print("Masukkan jumlah produk yang terjual: ");
            arrayAksesoris[i].terjual = input.nextInt();
            input.nextLine();

            System.out.print("Masukkan stok barang: ");
            arrayAksesoris[i].stok = input.nextInt();
            input.nextLine();
        }

        dataAksesoris04 dataAksesoris = new dataAksesoris04();
        dataAksesoris.dataAksesoris(arrayAksesoris);
        dataAksesoris.hitungTotalPenjualan(arrayAksesoris);
        dataAksesoris.cekStokAksesoris(arrayAksesoris);

        input.close();
    }
}