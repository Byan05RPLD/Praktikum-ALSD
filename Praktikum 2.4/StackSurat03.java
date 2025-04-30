import java.util.Stack;
public class StackSurat03 {
    Stack<Surat03> stackSurat = new Stack<>();

    public void terimaSurat(Surat03 surat) {
        stackSurat.push(surat);
    }
    public void prosesSurat() {
        if (!stackSurat.isEmpty()) {
            Surat03 surat = stackSurat.pop();
            System.out.println("Surat berikut telah diproses:");
            surat.tampilkanSurat();
        } else {
            System.out.println("Tidak ada surat yang dapat diproses.");
        }
    }
    public void lihatSuratTerakhir() {
        if (!stackSurat.isEmpty()) {
            System.out.println("Surat izin terakhir:");
            stackSurat.peek().tampilkanSurat();
        } else {
            System.out.println("Tidak ada surat izin dalam stack.");
        }
    }
    public void cariSurat(String nama) {
        boolean ditemukan = false;
        for (Surat03 surat : stackSurat) {
            if (surat.namaMahasiswa.equalsIgnoreCase(nama)) {
                System.out.println("Surat ditemukan:");
                surat.tampilkanSurat();
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Surat atas nama " + nama + " tidak ditemukan.");
        }
    }
}
