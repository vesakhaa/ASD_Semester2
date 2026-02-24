import java.util.Scanner;
public class mataKuliahDemo {
    public static void main(String[] args) {
        mataKuliah04[] arrayOfMataKuliah = new mataKuliah04[3];

        for (int i = 0; i < arrayOfMataKuliah.length; i++) {
            arrayOfMataKuliah[i] = new mataKuliah04("", "", 0, 0);
            System.out.println("Masukkan data mata kuliah ke-" + (i+1));
            arrayOfMataKuliah[i].tambahData(new Scanner(System.in));
        }


        for (int i=0; i<arrayOfMataKuliah.length; i++){
            arrayOfMataKuliah[i].cetakInfo(i);
        }

    }    
}
