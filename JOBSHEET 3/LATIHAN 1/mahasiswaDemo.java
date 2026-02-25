
import java.util.Scanner;

    public class mahasiswaDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        mahasiswa04[] arrayOfMahasiswa = new mahasiswa04[3];
        String dummy;

        for (int i=0; i<arrayOfMahasiswa.length;i++){
            arrayOfMahasiswa[i] = new mahasiswa04();
            System.out.println("Masukkan data mahasiswa ke-"+(i+1));
            System.out.print("Masukkan NIM: ");
            arrayOfMahasiswa[i].nim = input.nextLine();
            System.out.print("Masukkan Nama: ");
            arrayOfMahasiswa[i].nama = input.nextLine();
            System.out.print("Masukkan Kelas: ");   
            arrayOfMahasiswa[i].kelas = input.nextLine();
            System.out.print("Masukkan IPK: ");
            dummy = input.nextLine();
            arrayOfMahasiswa[i].ipk = Float.parseFloat(dummy);
            System.out.println("-----------------------------------");
        }

        // for (mahasiswa04 arrayOfMahasiswa1 : arrayOfMahasiswa) {
        //     System.out.println("NIM:    " + arrayOfMahasiswa1.nim);
        //     System.out.println("Nama:   " + arrayOfMahasiswa1.nama);
        //     System.out.println("Kelas:  " + arrayOfMahasiswa1.kelas);
        //     System.out.println("IPK:    " + arrayOfMahasiswa1.ipk);
        //     System.out.println("-----------------------------------");
        // }


        for (int i=0; i <arrayOfMahasiswa.length; i++){
            arrayOfMahasiswa[i].cetakInfo();
        }

        // arrayOfMahasiswa[0] = new mahasiswa04();
        // arrayOfMahasiswa[0].nim = "244107060033";
        // arrayOfMahasiswa[0].nama = "AGNES TITANIA KINANTI";
        // arrayOfMahasiswa[0].kelas = "SIB-1E";
        // arrayOfMahasiswa[0].ipk = (float) 3.75;
        // arrayOfMahasiswa[1] = new mahasiswa04();
        // arrayOfMahasiswa[1].nim = "2341720172";
        // arrayOfMahasiswa[1].nama = "ACHMAD MAULANA HAMZAH";
        // arrayOfMahasiswa[1].kelas = "TI-2A";
        // arrayOfMahasiswa[1].ipk = (float) 3.36;
        // arrayOfMahasiswa[2] = new mahasiswa04();
        // arrayOfMahasiswa[2].nim = "244107023006";
        // arrayOfMahasiswa[2].nama = "DIRHAMAWAN PUTRANTO";
        // arrayOfMahasiswa[2].kelas = "TI-2E";
        // arrayOfMahasiswa[2].ipk = (float) 3.80;
        // System.out.println("NIM:    " + arrayOfMahasiswa[0].nim);
        // System.out.println("Nama:   " + arrayOfMahasiswa[0].nama);
        // System.out.println("Kelas:  " + arrayOfMahasiswa[0].kelas);
        // System.out.println("IPK:    " + arrayOfMahasiswa[0].ipk);
        // System.out.println("-----------------------------------");
        // System.out.println("NIM:    " + arrayOfMahasiswa[1].nim);
        // System.out.println("Nama:   " + arrayOfMahasiswa[1].nama);
        // System.out.println("Kelas:  " + arrayOfMahasiswa[1].kelas);
        // System.out.println("IPK:    " + arrayOfMahasiswa[1].ipk);
        // System.out.println("-----------------------------------");
        // System.out.println("NIM:    " + arrayOfMahasiswa[2].nim);
        // System.out.println("Nama:   " + arrayOfMahasiswa[2].nama);
        // System.out.println("Kelas:  " + arrayOfMahasiswa[2].kelas);
        // System.out.println("IPK:    " + arrayOfMahasiswa[2].ipk);
        // System.out.println("-----------------------------------");
    } 
}
