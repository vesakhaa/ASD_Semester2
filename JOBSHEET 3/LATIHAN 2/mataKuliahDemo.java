import java.util.Scanner;
public class mataKuliahDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        mataKuliah04[] arrayOfMataKuliah = new mataKuliah04[3];
        String kode, nama, dummy;
        int sks, jumlahJam;

        for (int i=0; i<arrayOfMataKuliah.length; i++){
            System.out.println("Masukkan data mata kuliah ke-" + (i+1));
            System.out.print("Masukkan kode mata kuliah : ");
            kode = sc.nextLine();
            System.out.print("Masukkan nama mata kuliah : ");
            nama = sc.nextLine();
            System.out.print("Masukkan jumlah sks       : ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Masukkan jumlah jam       : ");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);

            arrayOfMataKuliah[i] = new mataKuliah04(kode, nama, sks, jumlahJam);
        }

    }    
}
