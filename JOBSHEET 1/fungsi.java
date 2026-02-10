public class fungsi {

    static int  hargaAgnomela = 75000;
    static int hargaKeladi = 50000;
    static int hargaAlocasia = 60000;
    static int hargaMawar = 10000;

    public static double hitungPendapatan(int agnomela, int keladi, int alocasia, int mawar) {
        return 
        (agnomela * hargaAgnomela) + 
        (keladi * hargaKeladi) + 
        (alocasia * hargaAlocasia) + 
        (mawar * hargaMawar);
    }

    public static String statusCabang(int pendapatan) {
        if (pendapatan > 1500000) {
            return "Sangat Baik";
        } else {
            return "Perlu Evaluasi";
        }
    }
    public static void main(String[] args) {
        int[][] stokCabang = {
            {10, 5, 15, 7},   //Royal Garden 1
            {6, 11, 9, 12},    //Royal Garden 2
            {2, 10, 10, 5},     //Royal Garden 3
            {5, 7, 12, 9}     //royal Garden 4
        };
        for (int i = 0; i < stokCabang.length; i++) {
            double pendapatan = hitungPendapatan(
                stokCabang[i][0],
                stokCabang[i][1],
                stokCabang[i][2],
                stokCabang[i][3]
            );
            String status = statusCabang((int)pendapatan);
            System.out.println("Pendapatan Royal Garden " + (i + 1) + ": Rp " + pendapatan + "Status : " + status);
        }
    }
}
