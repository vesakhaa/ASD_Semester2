public class DLL {
    Node head, tail;

    public DLL() {
        head = null;
        tail = null;
    }

    public void tambah(Transaksi data) {
        Node nodeBaru = new Node(data);
        if (head == null) {
            head = tail = nodeBaru;
        } else {
            tail.next = nodeBaru;
            nodeBaru.prev = tail;
            tail = nodeBaru;
        }
    }

    public void cetakSemua() {
        if (head == null) {
            System.out.println("Data masih kosong.");
            return;
        }
        
        Node curr = head;
        double omset = 0;
        
        System.out.println("---------------------------------------------------------");
        System.out.printf("| %-5s | %-12s | %-8s | %-4s | %-10s |\n", "ID", "Nama Barang", "Harga", "Jml", "Total");
        System.out.println("---------------------------------------------------------");
        
        while (curr != null) {
            System.out.printf("| %-5d | %-12s | %-8.0f | %-4d | %-10.0f |\n",
                    curr.data.idTrx, curr.data.brg.nama, curr.data.brg.harga, 
                    curr.data.jml, curr.data.total);
            omset += curr.data.total;
            curr = curr.next;
        }
        System.out.println("---------------------------------------------------------");
        System.out.println("Total Semua Pendapatan: Rp " + omset);
    }

    public void urutkanNama() {
        if (head == null || head.next == null) return;

        boolean tukar;
        Node curr;
        do {
            tukar = false;
            curr = head;

            while (curr.next != null) {
                if (curr.data.brg.nama.compareToIgnoreCase(curr.next.data.brg.nama) > 0) {
                    Transaksi temp = curr.data;
                    curr.data = curr.next.data;
                    curr.next.data = temp;
                    tukar = true;
                }
                curr = curr.next;
            }
        } while (tukar);
        System.out.println("Udah diurutin sesuai abjad (A-Z).");
    }
}