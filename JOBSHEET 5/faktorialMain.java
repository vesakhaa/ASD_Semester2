
import java.util.Scanner;

public class faktorialMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai: ");
        int nilai = input.nextInt();

        faktorial04 fk = new faktorial04();
        System.out.println("Nilai Fktorial " +nilai+ "Menggunakan BF: " + fk.faktorialBF(nilai));
        System.out.println("Nilai Fktorial " +nilai+ "Menggunakan DC: " + fk.faktorialDC(nilai));
    }
}

