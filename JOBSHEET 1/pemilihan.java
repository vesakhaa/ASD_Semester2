import java.util.Scanner;

public class pemilihan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Program Menghitung Nilai Akhir ===");
        System.out.println("=======================================");

        System.out.print("Masukkan nilai Tugas: ");
        int nilaiTugas = input.nextInt();

        System.out.print("Masukkan nilai Kuis: ");
        int nilaiKuis = input.nextInt();

        System.out.print("Masukkan nilai UTS: ");
        int nilaiUTS = input.nextInt();

        System.out.print("Masukkan nilai UAS: ");
        int nilaiUAS = input.nextInt();

        double nilaiAkhir = (0.2 * nilaiTugas) + (0.2 * nilaiKuis) + (0.3 * nilaiUTS) + (0.3 * nilaiUAS);


        String nilaiHuruf, status;


        if (nilaiAkhir >= 80 && nilaiAkhir <= 100) {
           nilaiHuruf = "A";
           status = "Lulus";           
        } else if (nilaiAkhir >= 73 && nilaiAkhir < 80) {
            nilaiHuruf = "B+";
            status = "Lulus";
        } else if (nilaiAkhir >= 65 && nilaiAkhir < 73) {
            nilaiHuruf = "B";
            status = "Lulus";
        } else if (nilaiAkhir >= 60 && nilaiAkhir < 65) {
            nilaiHuruf = "C+";
            status = "Lulus";
        } else if (nilaiAkhir >= 50 && nilaiAkhir < 60) {
            nilaiHuruf = "C";
            status = "Lulus";
        } else if (nilaiAkhir >= 39 && nilaiAkhir < 50) {
            nilaiHuruf = "D";
            status = "Tidak Lulus";
        } else {
            nilaiHuruf = "E";
            status = "Tidak Lulus";
        }
        System.out.println("==============================");

        System.out.println("Nilai Akhir: " + nilaiAkhir);
        System.out.println("Nilai Huruf: " + nilaiHuruf);
        System.out.println("Status: " + status);
        System.out.println("==============================");
        if(status.equals("Lulus")){
            System.out.println("Selamat, Anda Lulus!");
        } else {
            System.out.println("Maaf, Anda Tidak Lulus.");
        }


        input.close();
    }
}
