import java.util.Scanner;
public class mataKuliah04 {
    public String  kode;
    public String  nama;
    public int sks;
    public int jumlahJam;
    public Scanner sc = new Scanner(System.in);
    public String dummy;

    public mataKuliah04(String kode, String nama, int sks, int jumlahJam){
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    public void tambahData(Scanner sc){
            System.out.print("Masukkan kode mata kuliah : ");
            this.kode = sc.nextLine();
            System.out.print("Masukkan nama mata kuliah : ");
            this.nama = sc.nextLine();
            System.out.print("Masukkan jumlah sks       : ");
            this.dummy = sc.nextLine();
            this.sks = Integer.parseInt(dummy);
            System.out.print("Masukkan jumlah jam       : ");
            this.dummy = sc.nextLine();
            this.jumlahJam = Integer.parseInt(dummy);
            System.out.println("------------------------------");
    }

    public void cetakInfo(int i){
        System.out.println("Data mata kuliah ke-" + (i+1));
        System.out.println("Kode mata kuliah : " + this.kode);
        System.out.println("Nama mata kuliah : " + this.nama);
        System.out.println("Jumlah sks       : " + this.sks);
        System.out.println("Jumlah jam       : " + this.jumlahJam);
        System.out.println("------------------------------");
    }
}
