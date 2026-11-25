public class PengunjungCafe11 {
    public static void main(String[] args) {
        daftarPengunjung("Aldi");
        daftarPengunjung("Doni", "Haqi", "Fijar");
    }

    static void daftarPengunjung(String... namaPengunjung) {
        System.out.println("Daftar Nama Pengunjung");
        for (int i = 0; i < namaPengunjung.length; i++) {
            System.out.println("- " + namaPengunjung[i]);
        }
    }
}
