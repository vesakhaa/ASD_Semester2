import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMK = input.nextInt();

        String[] namaMK = new String[jumlahMK];
        int[] sks = new int[jumlahMK];
        double[] nilaiAngka = new double[jumlahMK];
        String[] nilaiHuruf = new String[jumlahMK];
        double[] bobotNilai = new double[jumlahMK];

        double totalBobot = 0;
        double totalSKS = 0;


        for (int i = 0; i < jumlahMK; i++) {
            System.out.print("Nama Mata Kuliah ke-" + (i+1) + ": ");
            namaMK[i] = input.nextLine();

            System.out.print("Bobot SKS " + namaMK[i] + ": ");
            sks[i] = input.nextInt();

            System.out.print("Nilai Angka " + namaMK[i] + ": ");
            nilaiAngka[i] = input.nextDouble();

            
            if (nilaiAngka[i] > 80 && nilaiAngka[i] <= 100) {
                nilaiHuruf[i] = "A"; bobotNilai[i] = 4.0;
            } else if (nilaiAngka[i] > 73 && nilaiAngka[i] <= 80) {
                nilaiHuruf[i] = "B+"; bobotNilai[i] = 3.5;
            } else if (nilaiAngka[i] > 65 && nilaiAngka[i] <= 73) {
                nilaiHuruf[i] = "B"; bobotNilai[i] = 3.0;
            } else if (nilaiAngka[i] > 60 && nilaiAngka[i] <= 65) {
                nilaiHuruf[i] = "C+"; bobotNilai[i] = 2.5;
            } else if (nilaiAngka[i] > 50 && nilaiAngka[i] <= 60) {
                nilaiHuruf[i] = "C"; bobotNilai[i] = 2.0;
            } else if (nilaiAngka[i] > 39 && nilaiAngka[i] <= 50) {
                nilaiHuruf[i] = "D"; bobotNilai[i] = 1.0;
            } else {
                nilaiHuruf[i] = "E"; bobotNilai[i] = 0.0;
            }

            totalBobot += bobotNilai[i] * sks[i];
            totalSKS += sks[i];
        }

        System.out.println("\nHasil Konversi Nilai:");
        System.out.println("-------------------------------------------------------------");
        System.out.println("MK\t\tNilai Angka\tNilai Huruf\tBobot Nilai");
        System.out.println("-------------------------------------------------------------");
        for (int i = 0; i < jumlahMK; i++) {
            System.out.println(namaMK[i] + "\t\t" + nilaiAngka[i] + "\t\t" + nilaiHuruf[i] + "\t\t" + bobotNilai[i]);
        }

        double ipSemester = totalBobot / totalSKS;
        System.out.printf("\nIP Semester = %.2f\n", ipSemester);

        input.close();
    }
}
