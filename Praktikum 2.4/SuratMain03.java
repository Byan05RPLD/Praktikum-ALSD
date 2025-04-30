import java.util.Scanner;

public class SuratMain03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StackSurat03 stackSurat = new StackSurat03();
        int pilihan;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat Izin");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.print("ID Surat        : ");
                    String id = scanner.nextLine();
                    System.out.print("Nama Mahasiswa  : ");
                    String nama = scanner.nextLine();
                    System.out.print("Kelas           : ");
                    String kelas = scanner.nextLine();
                    System.out.print("Jenis Izin (S/I): ");
                    char jenis = scanner.nextLine().toUpperCase().charAt(0);
                    System.out.print("Durasi (hari)   : ");
                    int durasi = scanner.nextInt();
                    scanner.nextLine();

                    Surat03 suratBaru = new Surat03(id, nama, kelas, jenis, durasi);
                    stackSurat.terimaSurat(suratBaru);
                    System.out.println("Surat berhasil ditambahkan.");
                    break;

                case 2:
                    stackSurat.prosesSurat();
                    break;

                case 3:
                    stackSurat.lihatSuratTerakhir();
                    break;

                case 4:
                    System.out.print("Masukkan nama mahasiswa: ");
                    String cariNama = scanner.nextLine();
                    stackSurat.cariSurat(cariNama);
                    break;

                case 0:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);
    }
}
