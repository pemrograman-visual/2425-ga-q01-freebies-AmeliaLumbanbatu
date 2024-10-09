// 12S24025 - Paula Gevriella Tambunan
// 12S24031 - Amelia Renata Lumbanbatu

import java.util.*;
import java.lang.Math;

public class X01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double hargaBuku, totalHarga, hargaBukuTermurah, totalPembayaran;

        hargaBuku = Double.parseDouble(input.nextLine());
        totalHarga = hargaBuku;
        hargaBukuTermurah = hargaBuku;
        while (hargaBuku != 0) {
            if (hargaBukuTermurah < hargaBuku) {
                hargaBukuTermurah = hargaBukuTermurah;
            } else {
                hargaBukuTermurah = hargaBuku;
            }
            hargaBuku = Double.parseDouble(input.nextLine());
            totalHarga = totalHarga + hargaBuku;
        }
        if (totalHarga >= 100) {
            totalPembayaran = totalHarga - hargaBukuTermurah;
        } else {
            totalPembayaran = totalHarga;
        }
        System.out.println(toFixed(totalPembayaran,2));
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
