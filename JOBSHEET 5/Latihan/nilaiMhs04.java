public class nilaiMhs04 {
    String nama;
    String nim;
    String thnMasuk;
    int nilaiUTS;
    int nilaiUAS;

    nilaiMhs04(String nama, String nim, String thnMasuk, int nilaiUTS, int nilaiUAS) {
        this.nama = nama;
        this.nim = nim;
        this.thnMasuk = thnMasuk;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }

    int NilaiTertinggiDC(nilaiMhs04[] arr, int l, int r){
        if (l==r){
            return arr[l].nilaiUTS;
        }
        int mid = (l+r)/2;

        int maxLeft = NilaiTertinggiDC(arr, l, mid);
        int maxRight = NilaiTertinggiDC(arr, mid+1, r);

        return Math.max(maxLeft, maxRight);
    }

    int NilaiTerendahDC(nilaiMhs04[] arr, int l, int r){
        if (l==r){
            return arr[l].nilaiUTS;
        }
        int mid = (l+r)/2;

        int minLeft = NilaiTerendahDC(arr, l, mid);
        int minRight = NilaiTerendahDC(arr, mid+1, r);

        return Math.min(minLeft, minRight);
    }

    double RataBF(nilaiMhs04[] arr){
        int total = 0;

        for (int i=0; i<arr.length; i++){
            total += arr[i].nilaiUTS;
        }
        
        return (double) total/arr.length;
    }
}