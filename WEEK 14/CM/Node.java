public class Node {
    Transaksi data;
    Node prev, next;

    public Node(Transaksi data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}