public class StackKonversi03 {
    int[] tumpukanBiner;
    int size;
    int top;

    public StackKonversi03() {
        this.size = 32;
        tumpukanBiner = new int[size];
        top = -1;
    }
    public boolean isEmpty() {
        return top == -1;
    }
    public boolean isFull() {
        return top == size - 1;
    }
    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack penuh!");
        } else {
            tumpukanBiner[++top] = data;
        }
    }
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack kosong.");
            return -1;
        } else {
            return tumpukanBiner[top--];
        }
    }
    public String konversiDesimalKeBiner(int nilai) {
        while (nilai > 0) {
            int sisa = nilai % 2;
            push(sisa);
            nilai = nilai / 2;
        }
        String biner = "";
        while (!isEmpty()) {
            biner += pop();
        }
        return biner;
    }
}
