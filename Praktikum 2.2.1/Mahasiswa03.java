public class Mahasiswa03 {
    String nim;
    String nama;
    String kelas;
    int nilai;

    public Mahasiswa03(String nama, String nim, String kelas) {
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        nilai = -1;
    }

    public void tugasDinilai(int nilai) {
        this.nilai = nilai;
    }

    public String toString() {
        return nim + " - " + nama + " (" + kelas + "), Nilai: " + nilai;
    }
}
