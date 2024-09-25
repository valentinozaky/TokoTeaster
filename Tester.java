package toko;

import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("berapa jumlah object? (1-10)");
        int jumlah = in.nextInt();
        // condition dilengkapi >10 tdk dijalankan
        if (jumlah < 1 || 10 < jumlah) {
            System.out.println("input salah");

        }
        for (int i = 1; i <= jumlah; i++) {
            try {
                System.out.println("silahkan pilih 1 untuk membuat CD dan 2 untuk membuat DVD");
                int pilih = in.nextInt();
                if (pilih == 1) {
                    CD cd = new CD();
                    System.out.println();
                } else if (pilih == 2) {
                    DVD dvd = new DVD();
                }
            } catch (Exception e) {

            }
            // mencegah error krn tipe data tidak sesuai
        }
        in.close();
    }
}