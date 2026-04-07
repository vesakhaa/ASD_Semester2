
public class sortingMain04 {

    public static void main(String[] args) {
        int a[]={20 , 10 , 2 , 7 , 12 };
        sorting04 dataUrut1 = new sorting04(a, a.length);

        int b[]={30,20,2,8,14};
        sorting04 dataUrut2= new sorting04(b, b.length);

        int c []={40,10,4,9,3};
        sorting04 dataUrut3= new sorting04(c, c.length);

        System.out.println("Data awal 1");
        dataUrut1.tampil();
        dataUrut1.bubbleSort();
        System.out.println("data sudah diurutkan dengan BUBBLE SORT (ASC)");
        dataUrut1.tampil();

        System.out.println("\n");

        System.out.println("Data awal 2");
        dataUrut2.tampil();
        dataUrut2.selectionSort();
        System.out.println("data sudah diurutkan dengan SELECTION SORT (ASC)");
        dataUrut2.tampil();

        System.out.println("\n");

        System.out.println("Data awal 3");
        dataUrut3.tampil();
        dataUrut3.insertionSort();
        System.out.println("data sudah diurutkan dengan INSERTION SORT (ASC)");
        dataUrut3.tampil();

    }
}
