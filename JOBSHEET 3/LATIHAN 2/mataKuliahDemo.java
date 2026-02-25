import java.util.Scanner;
public class mataKuliahDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mata kuliah : ");
        int indeks = sc.nextInt();
        sc.nextLine();
        mataKuliah04[] arrayOfMataKuliah = new mataKuliah04[indeks];

        for (int i = 0; i < arrayOfMataKuliah.length; i++) {
            arrayOfMataKuliah[i] = new mataKuliah04("", "", 0, 0);
            System.out.println("Masukkan data mata kuliah ke-" + (i+1));
            arrayOfMataKuliah[i].tambahData(sc);
        }

        System.out.println("\n");


        for (int i=0; i<arrayOfMataKuliah.length; i++){
            arrayOfMataKuliah[i].cetakInfo(i);
        }

    }    
}
