public class aksesoris04 {
    public String nama;
    public String kategori;
    public static   int harga;
    public static  int terjual;
    public  int stok;

    public aksesoris04(){

    }

    public aksesoris04(String nama, String kategori, int harga, int terjual, int stok){
        this.nama = nama;
        this.kategori = kategori;
        aksesoris04.harga = harga;
        aksesoris04.terjual = terjual;
        this.stok = stok;
    }

    public void tampilData(){
        System.out.println("Nama Aksesoris: " + nama);
        System.out.println("Kategori Aksesoris: " + kategori);
        System.out.println("Harga Aksesoris: " + harga);
        System.out.println("Terjual Sebanyak: " + terjual);
        System.out.println("Stok Aksesoris: " + stok);

    }
    public static int hitungPenjualan(){
        return harga * terjual;
    }

}


