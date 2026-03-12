public class dataAksesoris04 {

    public void dataAksesoris(aksesoris04[] arrayAksesoris) {
        System.out.println("Data Semua Aksesoris: ");
        for (int i = 0; i < arrayAksesoris.length; i++) {
            arrayAksesoris[i].tampilData();
        }
    }

    public void hitungTotalPenjualan(aksesoris04[] arrayAksesoris) {
        int totalPenjualan = 0;
        for (int i = 0; i < arrayAksesoris.length; i++) {
            totalPenjualan += aksesoris04.hitungPenjualan();
        }
        System.out.println("Total Penjualan Semua Aksesoris: " + totalPenjualan);
    }

    public void cekStokAksesoris(aksesoris04[] arrayAksesoris) {
        System.out.println("Stok Aksesoris yang Tersedia: ");
        for (int i = 0; i < arrayAksesoris.length; i++) {
            if (arrayAksesoris[i].stok > 0) {
                System.out.println("Nama Aksesoris: " + arrayAksesoris[i].nama + " - Stok: " + arrayAksesoris[i].stok);
            }else if(arrayAksesoris[i].stok >= 5){
                System.out.println("Nama Aksesoris: " + arrayAksesoris[i].nama + " - Stok: " + arrayAksesoris[i].stok + " (Stok masih banyak)");
            }else if(arrayAksesoris[i].stok < 5 && arrayAksesoris[i].stok > 0){
                System.out.println("Nama Aksesoris: " + arrayAksesoris[i].nama + " - Stok: " + arrayAksesoris[i].stok + " (Stok hampir habis)");
            }
        }
    }
}
