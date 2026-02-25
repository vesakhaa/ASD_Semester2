
public class dataDosen04 {

    public void dataSemuaDosen(dosen04[] arrayOfDosen04) {
        System.out.println("Data Semua Dosen: ");
        for (int i = 0; i < arrayOfDosen04.length; i++) {
            arrayOfDosen04[i].tampilInfo();
        }
    }

    public void dataDosenPerJenisKelamin(dosen04[] arrayOfDosen04) {
        int pria = 0;
        int wanita = 0;
        for (int i = 0; i < arrayOfDosen04.length; i++) {
            if (arrayOfDosen04[i].jenisKelamin == true) {
                pria++;
            } else {
                wanita++;
            }
        }
        System.out.println("Jumlah Dosen Laki-laki: " + pria);
        System.out.println("Jumlah Dosen Perempuan: " + wanita);
        System.out.println("------------------------------------");
    }

    public void rerataUsiaDosenPerJenisKelamin(dosen04[] arrayOfDosen04){
        int totalUsiaPria = 0, jumlahPria = 0;
        int totalUsiaWanita = 0, jumlahWanita = 0;

        for (int i = 0; i < arrayOfDosen04.length; i++) {
            if (arrayOfDosen04[i].jenisKelamin == true) {
                totalUsiaPria += arrayOfDosen04[i].usia;
                jumlahPria++;
            } else {
                totalUsiaWanita += arrayOfDosen04[i].usia;
                jumlahWanita++;
            }
        }
        double rerataUsiaPria = (jumlahPria > 0) ? (double) totalUsiaPria / jumlahPria : 0;
        double rerataUsiaWanita = (jumlahWanita > 0) ? (double) totalUsiaWanita / jumlahWanita : 0;

        System.out.println("Rerata Usia Dosen Laki-laki: " + rerataUsiaPria + " tahun");
        System.out.println("Rerata Usia Dosen Perempuan: " + rerataUsiaWanita + " tahun");
        System.out.println("------------------------------------");
    }

    public void infoDosenPalingTua(dosen04[] arrayOfDosen04){
        dosen04 dosenTertua = arrayOfDosen04[00];
        for (int i = 1; i < arrayOfDosen04.length; i++) {
            if (arrayOfDosen04[i].usia > dosenTertua.usia) {
                dosenTertua = arrayOfDosen04[i];
            }
        }
        System.out.println("Dosen Tertua: ");
        dosenTertua.tampilInfo();
        System.out.println("------------------------------------");
    }

    public void infoDosenPalingMuda(dosen04[] arrayOfDosen04){
        dosen04 dosenTermuda = arrayOfDosen04[00];
        for (int i = 1; i < arrayOfDosen04.length; i++) {
            if (arrayOfDosen04[i].usia < dosenTermuda.usia) {
                dosenTermuda = arrayOfDosen04[i];
            }
        }
        System.out.println("Dosen Termuda: ");
        dosenTermuda.tampilInfo();
        System.out.println("------------------------------------");
    }
}
