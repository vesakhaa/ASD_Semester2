class mataKuliah04{
    String kodeMK;
    String namaMK;
    int sks;
    int jumlahJam;

    public mataKuliah04() {
    }

    public mataKuliah04(String kodeMK, String namaMK, int sks, int jumlahJam) {
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    void tampilkanInformasi(){
        System.out.println("Kode MK : " + kodeMK);
        System.out.println("Nama MK: " + namaMK);
        System.out.println("SKS : " + sks);
        System.out.println("Jumlah Jam : " + jumlahJam);
    }

    void ubahSKS(int sksBaru){
        sks = sksBaru;
    }

    void tambahJam(int jamTambahan){
        jumlahJam += jamTambahan;
    }

    void kurangiJam(int jamDikurangi){
        jumlahJam -= jamDikurangi;
    }
}
