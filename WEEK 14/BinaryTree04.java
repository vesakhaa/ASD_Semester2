public class BinaryTree04 {
    Node04 root;

    public BinaryTree04() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    // Menambahkan node baru secara non-rekursif
    public void add(Mahasiswa04 mahasiswa) {
        Node04 newNode = new Node04(mahasiswa); 
        if (isEmpty()) {
            root = newNode;
        } else {
            Node04 current = root;
            while (true) {
                Node04 parent = current;
                if (mahasiswa.ipk < current.mahasiswa.ipk) {
                    current = current.left;
                    if (current == null) {
                        parent.left = newNode;
                        return;
                    }
                } else {
                    current = current.right;
                    if (current == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    // Mencari data berdasarkan IPK
    public boolean find(double ipk) {
        boolean result = false;
        Node04 current = root;
        while (current != null) {
            if (current.mahasiswa.ipk == ipk) {
                result = true;
                break;
            } else if (ipk > current.mahasiswa.ipk) {
                current = current.right;
            } else {
                current = current.left;
            }
        }
        return result;
    }

    // Traversal Mode
    public void traversePreOrder(Node04 node) {
        if (node != null) {
            node.mahasiswa.tampilInformasi();
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    public void traverseInOrder(Node04 node) {
        if (node != null) {
            traverseInOrder(node.left);
            node.mahasiswa.tampilInformasi();
            traverseInOrder(node.right);
        }
    }

    public void traversePostOrder(Node04 node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            node.mahasiswa.tampilInformasi();
        }
    }

    // Mendapatkan penerus (successor) untuk proses delete dengan 2 child
    public Node04 getSuccessor(Node04 del) {
        Node04 successor = del.right;
        Node04 successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    // Menghapus data berdasarkan nilai IPK
    public void delete(double ipk) {
        if (isEmpty()) {
            System.out.println("Binary tree kosong");
            return;
        }

        Node04 parent = root;
        Node04 current = root;
        boolean isLeftChild = false;

        // Proses pencarian node yang akan dihapus
        while (current != null) {
            if (current.mahasiswa.ipk == ipk) {
                break;
            } else if (ipk < current.mahasiswa.ipk) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else if (ipk > current.mahasiswa.ipk) {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }

        // Jika data tidak ditemukan
        if (current == null) {
            System.out.println("Data tidak ditemukan");
            return;
        }

        // Kasus 1: Node yang dihapus tidak memiliki anak (Leaf Node)
        if (current.left == null && current.right == null) {
            if (current == root) {
                root = null;
            } else {
                if (isLeftChild) {
                    parent.left = null;
                } else {
                    parent.right = null;
                }
            }
        }
        // Kasus 2a: Node yang dihapus hanya memiliki anak kanan
        else if (current.left == null) {
            if (current == root) {
                root = current.right;
            } else {
                if (isLeftChild) {
                    parent.left = current.right;
                } else {
                    parent.right = current.right;
                }
            }
        }
        // Kasus 2b: Node yang dihapus hanya memiliki anak kiri
        else if (current.right == null) {
            if (current == root) {
                root = current.left;
            } else {
                if (isLeftChild) {
                    parent.left = current.left;
                } else {
                    parent.right = current.left;
                }
            }
        }
        // Kasus 3: Node yang dihapus memiliki dua anak
        else {
            Node04 successor = getSuccessor(current);
            System.out.println("Jika 2 anak, current = ");
            successor.mahasiswa.tampilInformasi();
            if (current == root) {
                root = successor;
            } else {
                if (isLeftChild) {
                    parent.left = successor;
                } else {
                    parent.right = successor;
                }
            }
            successor.left = current.left;
        }
    }
}