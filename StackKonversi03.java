public class StackKonversi03 {
    int[] stack;
    int size;
    int top;

    public StackKonversi03(int size) {
        this.size = size;
        stack = new int[size];
        top = -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(int value) {
        if (!isFull()) {
            stack[++top] = value;
        }
    }

    public int pop() {
        if (!isEmpty()) {
            return stack[top--];
        }
        return -1;
    }

    public void konversiDesimalKeBiner(int nilai) {
        StackKonversi03 binerStack = new StackKonversi03(32);
        while (nilai != 0) {
            binerStack.push(nilai % 2);
            nilai = nilai / 2;
        }

        System.out.print("Nilai dalam biner: ");
        while (!binerStack.isEmpty()) {
            System.out.print(binerStack.pop());
        }
        System.out.println();
    }
}
