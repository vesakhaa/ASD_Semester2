import java.util.Scanner;

public class Main04 {
    // Data awal Mahasiswa [cite: 57]
    static MahasiswaCM04[] daftarMhs = {
        new MahasiswaCM04("22001", "Andi", "Teknik Informatika"),
        new MahasiswaCM04("22002", "Budi", "Teknik Informatika"),
        new MahasiswaCM04("22003", "Citra", "Sistem Informasi Bisnis")
        
        
    };

    // Data awal Buku [cite: 59]
    static Buku04[] daftarBuku = {
        new Buku04("B001", "Algoritma", 2020),
        new Buku04("B002", "Basis Data", 2019),
        new Buku04("B003", "Pemrograman", 2021),
        new Buku04("B004", "Fisika", 2024)
    };

    // Data awal Peminjaman menggunakan Array of Object [cite: 61]
    static Peminjaman04[] dataPinjam = {
        new Peminjaman04(daftarMhs[0], daftarBuku[0], 7),
        new Peminjaman04(daftarMhs[1], daftarBuku[1], 3),
        new Peminjaman04(daftarMhs[2], daftarBuku[2], 10),
        new Peminjaman04(daftarMhs[2], daftarBuku[3], 6),
        new Peminjaman04(daftarMhs[0], daftarBuku[1], 4)
    };

    // Implementasi Selection Sort - Berdasarkan Denda Terbesar (Descending) 
    static void selectionSortDenda04() {
        for (int i = 0; i < dataPinjam.length - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < dataPinjam.length; j++) {
                if (dataPinjam[j].denda > dataPinjam[maxIdx].denda) {
                    maxIdx = j;
                }
            }
            Peminjaman04 temp = dataPinjam[maxIdx];
            dataPinjam[maxIdx] = dataPinjam[i];
            dataPinjam[i] = temp;
        }
    }

    // Pendukung Binary Search: Harus urut berdasarkan NIM
    static void sortByNIM04() {
        for (int i = 0; i < dataPinjam.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < dataPinjam.length; j++) {
                if (dataPinjam[j].mhs.NIM.compareTo(dataPinjam[minIdx].mhs.NIM) < 0) {
                    minIdx = j;
                }
            }
            Peminjaman04 temp = dataPinjam[minIdx];
            dataPinjam[minIdx] = dataPinjam[i];
            dataPinjam[i] = temp;
        }
    }

    // Implementasi Binary Search berdasarkan NIM 
    static void binarySearchNIM04(String cariNim) {
        sortByNIM04(); // Urutkan data terlebih dahulu
        int low = 0, high = dataPinjam.length - 1;
        boolean ditemukan = false;

        while (low <= high) {
            int mid = (low + high) / 2;
            int res = cariNim.compareTo(dataPinjam[mid].mhs.NIM);

            if (res == 0) {
                // Tampilkan semua data jika satu mahasiswa meminjam lebih dari satu buku
                int left = mid;
                while (left >= 0 && dataPinjam[left].mhs.NIM.equals(cariNim)) {
                    dataPinjam[left].tampilPeminjaman04();
                    left--;
                    ditemukan = true;
                }
                int right = mid + 1;
                while (right < dataPinjam.length && dataPinjam[right].mhs.NIM.equals(cariNim)) {
                    dataPinjam[right].tampilPeminjaman04();
                    right++;
                    ditemukan = true;
                }
                break;
            } else if (res > 0) low = mid + 1;
            else high = mid - 1;
        }
        if (!ditemukan) System.out.println("Data NIM " + cariNim + " tidak ditemukan.");
    }

    public static void main(String[] args) {
        Scanner sc04 = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("\n=== SISTEM PEMINJAMAN RUANG BACA JTI ===");
            System.out.println("1. Tampilkan Mahasiswa\n2. Tampilkan Buku\n3. Tampilkan Peminjaman"); 
            System.out.println("4. Urutkan Berdasarkan Denda\n5. Cari Berdasarkan NIM\n0. Keluar"); 
            System.out.print("Pilih: ");
            pilih = sc04.nextInt();

            switch (pilih) {
                case 1: for (MahasiswaCM04 m : daftarMhs) m.tampilMahasiswa04(); break;
                case 2: for (Buku04 b : daftarBuku) b.tampilBuku04(); break;
                case 3: for (Peminjaman04 p : dataPinjam) p.tampilPeminjaman04(); break;
                case 4: 
                    selectionSortDenda04();
                    System.out.println("Setelah diurutkan (Denda terbesar):"); 
                    for (Peminjaman04 p : dataPinjam) p.tampilPeminjaman04();
                    break;
                case 5:
                    System.out.print("Masukkan NIM: ");
                    binarySearchNIM04(sc04.next());
                    break;
            }
        } while (pilih != 0);
    }
}