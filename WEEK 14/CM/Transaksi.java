public class Transaksi {
    int idTrx;
    Barang brg; 
    int jml;
    double total;

    public Transaksi(int idTrx, Barang brg, int jml, double total) {
        this.idTrx = idTrx;
        this.brg = brg;
        this.jml = jml;
        this.total = total;
    }
}