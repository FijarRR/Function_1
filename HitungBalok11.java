import java.util.Scanner;

public class HitungBalok11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int p, l, t, L, vol;

        System.out.println("Masukan panjang: ");
        p = input.nextInt();
        System.out.println("Masukan lebar: ");
        l = input.nextInt();
        System.out.println("Masukan tinggi: ");
        t = input.nextInt();

        L = hitungLuas(p, l);
        System.out.println("Luas persegi panjang adalah " + L);
        vol = hitungVolume(p, l, t);
        System.out.println("Volume balok adalah " + vol);
        input.close();
    }

    static int hitungLuas(int pjg, int lb) {
        int Luas = pjg * lb;
        return Luas;
    }

    static int hitungVolume(int tinggi, int a, int b) {
        int Volume = hitungLuas(a, b) * tinggi;
        return Volume;
    }
}
