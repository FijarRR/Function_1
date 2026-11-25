import java.util.Scanner;

class Kafe11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu("Aldi", true);

        System.out.print("\nMasukan nomor menu yang ingin Anda pesan: ");
        int pilihanMenu = sc.nextInt();
        System.out.print("Masukan jumlah item yang ingin dipesan: ");
        int banyakItem = sc.nextInt();
        int totalHarga = hitungTotalHarga11(pilihanMenu, banyakItem);
        System.out.println("Total harga untuk pesanan Anda: Rp " + totalHarga);
    }

    public static int hitungTotalHarga11(int pilihanMenu, int banyakItem) {
        int[] hargaMenu = { 15000, 20000, 22000, 12000, 10000, 18000 };

        int hargaTotal = hargaMenu[pilihanMenu - 1] * banyakItem;
        return hargaTotal;
    }

    public static void Menu(String namaPelanggan, Boolean Ismember) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");

        if (Ismember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian.");
        }

        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("===========================");
        System.out.println("Silahkan pilih menu yang Anda inginkan: ");
    }
}
