import java.util.Scanner;
public class dosenDemo04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah dosen: ");
        int indeks = input.nextInt();
        dosen04[] arrayOfDosen = new dosen04[indeks];

        String dummy;

        for (int i=0; i<arrayOfDosen.length;i++){
            arrayOfDosen[i] = new dosen04("", "", false, 0);
            System.out.println("Masukkan data dosen ke-"+(i+1));

            System.out.print("Masukkan Kode: ");
            arrayOfDosen[i].kode = sc.nextLine();

            System.out.print("Masukkan Nama: ");
            arrayOfDosen[i].nama = sc.nextLine();

            System.out.print("Masukkan Jenis Kelamin (Pria/Wanita): ");
            dummy = sc.nextLine();
            if (dummy.equalsIgnoreCase("Pria")) {
                arrayOfDosen[i].jenisKelamin = true;
            } else if (dummy.equalsIgnoreCase("Wanita")) {
                arrayOfDosen[i].jenisKelamin = false;
            } else {
                System.out.println("Input tidak valid. Program akan dihentikan");
                return;
            }

            System.out.print("Masukkan Usia: ");
            arrayOfDosen[i].usia = input.nextInt();

            System.out.println("-----------------------------------");
        }

        System.out.println("\n");

        dataDosen04 dataDosen = new dataDosen04();
        dataDosen.dataSemuaDosen(arrayOfDosen);
        System.out.println("\n");
        dataDosen.dataDosenPerJenisKelamin(arrayOfDosen);
        System.out.println("\n");
        dataDosen.rerataUsiaDosenPerJenisKelamin(arrayOfDosen);
        System.out.println("\n");
        dataDosen.infoDosenPalingTua(arrayOfDosen);
        System.out.println("\n");
        dataDosen.infoDosenPalingMuda(arrayOfDosen);

        // int i = 1;
        // for (dosen04 arrayOfDosen1 : arrayOfDosen) {
        //     System.out.println("Data Dosen ke- " + i++);
        //     System.out.println("Kode:   " + arrayOfDosen1.kode);
        //     System.out.println("Nama:   " + arrayOfDosen1.nama);
        //     System.out.println("Jenis Kelamin: " + (arrayOfDosen1.jenisKelamin ? "Laki-laki" : "Perempuan"));
        //     System.out.println("Usia:   " + arrayOfDosen1.usia);
        //     System.out.println("-----------------------------------");
        // }

        input.close();
        sc.close();
    }
}
