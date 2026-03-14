import java.util.Scanner;
public class mainSum04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan jumlah elemen: ");
        int elemen  = input.nextInt();

        sum04 sm = new sum04(elemen);
        for(int i=0; i<elemen; i++){
            System.out.println("Masukkan keuntungan ke-" + (i+1) + ": " );
            sm.keuntungan[i] = input.nextDouble();
        }

        System.out.println("Total keuntungan dengan brute force: " + sm.totalBF());
        System.out.println("Total keuntungan dengan divide and conquer: " + sm.totalDC(sm.keuntungan, 0, elemen-1));
    }
}
