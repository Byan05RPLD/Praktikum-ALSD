public class StackTugasMahasiswa03 {
    Mahasiswa03[] stack;
    int size;
    int top;

    public StackTugasMahasiswa03(int size) {
        this.size = size;
        stack = new Mahasiswa03[size];
        top = -1;
    }

    public boolean isFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(Mahasiswa03 mhs) {
        if (!isFull()) {
            stack[++top] = mhs;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan tugas lagi.");
        }
    }

    public Mahasiswa03 pop() {
        if (!isEmpty()) {
            Mahasiswa03 m = stack[top];
            top--;
            return m;
        } else {
            System.out.println("Stack kosong! Tidak ada tugas untuk dinilai.");
            return null;
        }
    }

    public Mahasiswa03 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan");
            return null;
        }
    }
    public Mahasiswa03 lihatTugasTerbawah() {
        if (!isEmpty()) {
            return stack[0];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan.");
            return null;
        }
    }    
    public int jumlahTugasTerkumpul() {
        return top + 1;
    }    
    public void print() {
        for (int i = 0; i <= top; i++) {
            System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas + "\tNilai: " + (stack[i].nilai >= 0 ? stack[i].nilai : "Belum dinilai"));
        }
        System.out.println("");
    }
    public String konversiDesimalKeBiner(int nilai) {
        StackKonversi03 stackBiner = new StackKonversi03();
        while (nilai > 0) {
            int sisa = nilai % 2;
            stackBiner.push(sisa);
            nilai = nilai / 2;
        }
        String biner = new String();
        while (!stackBiner.isEmpty()) {
            biner += stackBiner.pop();
        }
        return biner;
    }
    
}