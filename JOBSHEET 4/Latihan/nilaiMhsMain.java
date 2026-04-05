public class nilaiMhsMain {
    public static void main(String[] args) {
        nilaiMhs04[] dataMahasiswa = {
            new nilaiMhs04("Ahmad","220101001","2022",78,82),
            new nilaiMhs04("Budi","220101002","2022",85,88),
            new nilaiMhs04("Cindy","220101003","2021",90,87),
            new nilaiMhs04("Dian","220101004","2021",76,79),
            new nilaiMhs04("Eko","220101005","2023",92,95),
            new nilaiMhs04("Fajar","220101006","2020",88,85),
            new nilaiMhs04("Gina","220101007","2023",80,83),
            new nilaiMhs04("Hadi","220101008","2020",82,84)
        };

        System.out.println("Nama\tNIM\t\tTahun Masuk\tNilai UTS\tNilai UAS");
        System.out.println("");
        for (nilaiMhs04 mhs : dataMahasiswa) {
            System.out.println(mhs.nama + "\t" + mhs.nim + "\t" + mhs.thnMasuk + "\t\t" + mhs.nilaiUTS + "\t\t" + mhs.nilaiUAS);
        }

        int nilaiTertinggi = dataMahasiswa[0].NilaiTertinggiDC(dataMahasiswa, 0, dataMahasiswa.length - 1);
        int nilaiTerendah = dataMahasiswa[0].NilaiTerendahDC(dataMahasiswa, 0, dataMahasiswa.length - 1);
        double rataRata = dataMahasiswa[0].RataBF(dataMahasiswa);

        System.out.println("\nNilai UTS Tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai UTS Terendah: " + nilaiTerendah);
        System.out.println("Rata-rata Nilai UTS: " + rataRata);
    }
}
