package prak2;

public class BinaryTreeArray14 {
    int[] data;
    int idxLast;

    public BinaryTreeArray14() {
        data = new int[10];
    }

    void populateData(int[] data, int idxLast) {
        this.data = data;
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            traverseInOrder(2 * idxStart + 1); 
            if (data[idxStart] != 0) {
                System.out.print(data[idxStart] + " ");
            }
            traverseInOrder(2 * idxStart + 2); 
        }
    }
}
