
import java.util.Scanner;

public class pangkatmain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen: ");
        int elemen = input.nextInt();

        pangkat04[] png = new pangkat04[elemen];
        for(int i=0; i<elemen; i++){
            System.out.print("Masukkan nilai basis elemen ke-" + (i+1) + ": ");
            int basis = input.nextInt();
            System.out.print("Masukkan nilai pangkat elemen ke-" + (i+1) + ": ");
            int pangkat = input.nextInt();
            png[i] = new pangkat04(basis, pangkat);
        }

        System.out.println("hASIL PANGKAT BRUTEFORCE:");
        for (pangkat04 p : png){
            System.out.println(p.nilai + "^" + p.pangkat + ": " + p.pangkatBF());
        }
        System.out.println("hASIL PANGKAT DIVIDE AND CONQUER:");
        for (pangkat04 p : png){
            System.out.println(p.nilai + "^" + p.pangkat + ": " + p.pangkatDC(p.nilai, p.pangkat));
        }
    }
}
