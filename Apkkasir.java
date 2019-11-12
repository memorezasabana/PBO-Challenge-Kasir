/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challengekasir;

import java.util.Scanner;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 *
 * @author TUF
 */
public class Apkkasir {

    void apk() {
        Scanner apik = new Scanner(System.in);
        System.out.println("===== SELAMAT DATANG DI MOZA'S SHOES =====");

        System.out.print("Silahkan Masukkan Nama Kasir          :");
        String namakasir = apik.next();

        System.out.println("\n^ ==== MOZA'S SHOES ==== ^");
        kasir1 cetak1 = new kasir1("[1]Cowok \t[2]Cewek",
                "[1]Olahraga \t[2]Lari \t[3]Santai \t[4]Kantoran", "[1]Adidas \t[2]Nike \t[3]Skechers \t[4]Puma \t[5]Reebok \t[6]Vans \t[7]Converse \t[8]Fila",
                "[1]Black \t[2]White \t[3]Gold \t[4]Silver \t[5]Orange \t[6]Green \t[7]Yellow \t[8]Blue \t[9]Red");
        System.out.println("Daftar Harga Sepatu   \t:");
        int harga1 = 259999;
        System.out.println("[FILA]      \tRp " + harga1);
        int harga2 = 379000;
        System.out.println("[VANS]      \tRp " + harga2);
        int harga3 = 415900;
        System.out.println("[PUMA]      \tRp " + harga3);
        int harga4 = 560000;
        System.out.println("[SKECHERS]  \tRp " + harga4);
        int harga5 = 699000;
        System.out.println("[REEBOK]    \tRp " + harga5);
        int harga6 = 779000;
        System.out.println("[NIKE]      \tRp " + harga6);
        int harga7 = 850000;
        System.out.println("[CONVERSE]  \tRp " + harga7);
        int harga8 = 999000;
        System.out.println("[ADIDAS]    \tRp " + harga8);

        System.out.println("[BELI >= 2 DISKON KELIPATAN Rp 50000]");

        System.out.print("\nSilahkan pilih KATEGORI SEPATU      \t:");
        int kategori = apik.nextInt();
        if (kategori > 2) {
            System.out.print("Kategori tidak tersedia, Pilih ulang:");
            int kodekategori = apik.nextInt();
        }
        System.out.print("Silahkan pilih JENIS SEPATU           \t:");
        int jenis = apik.nextInt();
        if (jenis > 4) {
            System.out.print("Jenis tidak tersedia, Pilih ulang  :");
            int kodejenis = apik.nextInt();
        }

        System.out.print("Silahkan pilih MERK SEPATU            \t:");
        int merk = apik.nextInt();
        if (merk > 8) {
            System.out.print("Merk tidak tersedia, Pilih ulang  :");
            int kodemerk = apik.nextInt();
        }

        System.out.print("Silahkan pilih WARNA SEPATU           \t:");
        int warna = apik.nextInt();
        if (warna > 9) {
            System.out.print("Warna tidak tersedia, Pilih ulang  :");
            int kodewarna = apik.nextInt();
        }

        System.out.print("Silahkan pilih UKURAN SEPATU (25-34)  \t:");
        int ukuran = apik.nextInt();
        if (ukuran > 34) {
            System.out.print("Ukuran tidak tersedia, Pilih ulang \t:");
            int kodeukuran = apik.nextInt();
        }
        if (ukuran < 25) {
            System.out.print("Ukuran tidak tersedia, Pilih ulang \t:");
            int kodeukuran = apik.nextInt();
        }

        System.out.print("Silahkan masukkan JUMLAH PEMBELIAN    \t:");
        int jumlah = apik.nextInt();
        int diskon = jumlah * 50000;

        System.out.println("\n============== N O T A  P E M B E L I A N ==============");
        System.out.println("          ----- M O Z A ' S  S H O E S -----");
        System.out.println("   Jl. Danau Laut Tawar G2E23, Sawojajar - Kota Malang");
        System.out.println("                    (0341)857360");
        Tanggal tgl = new Tanggal();
        System.out.println("\nTANGGAL PEMBELIAN \t: " + tgl.getTanggal());
        System.out.println("PUKUL               \t: " + tgl.getWaktu());
        System.out.println("NAMA KASIR          \t: " + namakasir);
        if (jenis == 1 ) {
            System.out.println("\nJENIS SEPATU      : COWOK");
        
        } else if (jenis == 2) {
            System.out.println("\nJENIS SEPATU      : CEWEK");
        } 
        if (kategori == 1) {
            System.out.println("KATEGORI SEPATU   : OLAHRAGA");
        } else if (kategori == 2) {
            System.out.println("KATEGORI SEPATU   : LARI");
        } else if (kategori == 3) {
            System.out.println("KATEGORI SEPATU   : SANTAI");
        } else if (kategori == 4) {
            System.out.println("KATEGORI SEPATU   : KANTORAN");
        }
        if (merk == 1) {
            System.out.println("MERK SEPATU       : ADIDAS");

        } else if (merk == 2) {
            System.out.println("MERK SEPATU       : NIKE");

        } else if (merk == 3) {
            System.out.println("MERK SEPATU       : SKECHERS");

        } else if (merk == 4) {
            System.out.println("MERK SEPATU       : PUMA");

        } else if (merk == 5) {
            System.out.println("MERK SEPATU       : REEBOK");

        } else if (merk == 6) {
            System.out.println("MERK SEPATU       : VANS");

        } else if (merk == 7) {
            System.out.println("MERK SEPATU       : CONVERSE");

        } else if (merk == 8) {
            System.out.println("MERK SEPATU       : FILA");

        }
        if (warna == 1) {
            System.out.println("WARNA SEPATU      : BLACK");
        } else if (warna == 2) {
            System.out.println("WARNA SEPATU      : WHITE");
        } else if (warna == 3) {
            System.out.println("WARNA SEPATU      : GOLD");
        } else if (warna == 4) {
            System.out.println("WARNA SEPATU      : SILVER");
        } else if (warna == 5) {
            System.out.println("WARNA SEPATU      : ORANGE");
        } else if (warna == 6) {
            System.out.println("WARNA SEPATU      : GREEN");
        } else if (warna == 7) {
            System.out.println("WARNA SEPATU      : YELLOW");
        } else if (warna == 8) {
            System.out.println("WARNA SEPATU      : BLUE");
        } else if (warna == 9) {
            System.out.println("WARNA SEPATU      : RED");
        }
        System.out.println("UKURAN SEPATU     : " + ukuran);
        System.out.println("JUMLAH PEMBELIAN  : " + jumlah);

        if (merk == 1 && jumlah >= 2) {

            System.out.println("\nHARGA @SEPATU        \t: Rp " + harga8 + " x " + jumlah);
            System.out.println("DISKON SEPATU          \t: Rp " + diskon);
            System.out.println("TOTAL HARGA            \t: Rp " + ((harga8 * jumlah) - diskon));
            System.out.print("\nPEMBAYARAN           \t: Rp ");
            int pembayaran = apik.nextInt();
            System.out.println("PENGEMBALIAN         \t: Rp " + (pembayaran - ((harga8 * jumlah) - diskon)));
        } else if (merk == 2 && jumlah >= 2) {
            System.out.println("\nHARGA @SEPATU        \t: Rp " + harga6 + " x " + jumlah);
            System.out.println("DISKON SEPATU          \t: Rp " + diskon);
            System.out.println("TOTAL HARGA            \t: Rp " + ((harga6 * jumlah) - diskon));
            System.out.print("\nPEMBAYARAN           \t: Rp ");
            int pembayaran = apik.nextInt();
            System.out.println("PENGEMBALIAN         \t: Rp " + (pembayaran - ((harga6 * jumlah) - diskon)));
        } else if (merk == 3 && jumlah >= 2) {

            System.out.println("\nHARGA @SEPATU        \t: Rp " + harga4 + " x " + jumlah);
            System.out.println("DISKON SEPATU          \t: Rp " + diskon);
            System.out.println("TOTAL HARGA            \t: Rp " + ((harga4 * jumlah) - diskon));
            System.out.print("\nPEMBAYARAN           \t: Rp ");
            int pembayaran = apik.nextInt();
            System.out.println("PENGEMBALIAN         \t: Rp " + (pembayaran - ((harga4 * jumlah) - diskon)));
        } else if (merk == 4 && jumlah >= 2) {

            System.out.println("\nHARGA @SEPATU        \t: Rp " + harga3 + " x " + jumlah);
            System.out.println("DISKON SEPATU          \t: Rp " + diskon);
            System.out.println("TOTAL HARGA            \t: Rp " + ((harga3 * jumlah) - diskon));
            System.out.print("\nPEMBAYARAN           \t: Rp ");
            int pembayaran = apik.nextInt();
            System.out.println("PENGEMBALIAN         \t: Rp " + (pembayaran - ((harga3 * jumlah) - diskon)));
        } else if (merk == 5 && jumlah >= 2) {

            System.out.println("\nHARGA @SEPATU        \t: Rp " + harga5 + " x " + jumlah);
            System.out.println("DISKON SEPATU          \t: Rp " + diskon);
            System.out.println("TOTAL HARGA            \t: Rp " + ((harga5 * jumlah) - diskon));
            System.out.print("\nPEMBAYARAN           \t: Rp ");
            int pembayaran = apik.nextInt();
            System.out.println("PENGEMBALIAN         \t: Rp " + (pembayaran - ((harga5 * jumlah) - diskon)));
        } else if (merk == 6 && jumlah >= 2) {

            System.out.println("\nHARGA @SEPATU        \t: Rp " + harga2 + " x " + jumlah);
            System.out.println("DISKON SEPATU          \t: Rp " + diskon);
            System.out.println("TOTAL HARGA            \t: Rp " + ((harga2 * jumlah) - diskon));
            System.out.print("\nPEMBAYARAN           \t: Rp ");
            int pembayaran = apik.nextInt();
            System.out.println("PENGEMBALIAN         \t: Rp " + (pembayaran - ((harga2 * jumlah) - diskon)));
        } else if (merk == 7 && jumlah >= 2) {

            System.out.println("\nHARGA @SEPATU        \t: Rp " + harga7 + " x " + jumlah);
            System.out.println("DISKON SEPATU          \t: Rp " + diskon);
            System.out.println("TOTAL HARGA            \t: Rp " + ((harga7 * jumlah) - diskon));
            System.out.print("\nPEMBAYARAN           \t: Rp ");
            int pembayaran = apik.nextInt();
            System.out.println("PENGEMBALIAN         \t: Rp " + (pembayaran - ((harga7 * jumlah) - diskon)));
        } else if (merk == 8 && jumlah >= 2) {

            System.out.println("\nHARGA @SEPATU        \t: Rp " + harga1 + " x " + jumlah);
            System.out.println("DISKON SEPATU          \t: Rp " + diskon);
            System.out.println("TOTAL HARGA            \t: Rp " + ((harga1 * jumlah) - diskon));
            System.out.print("\nPEMBAYARAN           \t: Rp ");
            int pembayaran = apik.nextInt();
            System.out.println("PENGEMBALIAN         \t: Rp " + (pembayaran - ((harga1 * jumlah) - diskon)));
        } else if (merk == 1 && jumlah >= 1) {

            System.out.println("\nHARGA @SEPATU        \t: Rp " + harga8 + " x " + jumlah);
            System.out.println("DISKON SEPATU          \t: Rp 0");
            System.out.println("TOTAL HARGA            \t: Rp " + harga8 * jumlah);
            System.out.print("\nPEMBAYARAN           \t: Rp ");
            int pembayaran = apik.nextInt();
            System.out.println("PENGEMBALIAN         \t: Rp " + (pembayaran - (harga8 * jumlah)));
        } else if (merk == 2 && jumlah >= 1) {
            System.out.println("\nHARGA @SEPATU        \t: Rp " + harga6 + " x " + jumlah);
            System.out.println("DISKON SEPATU          \t: Rp 0");
            System.out.println("TOTAL HARGA            \t: Rp " + harga6 * jumlah);
            System.out.print("\nPEMBAYARAN           \t: Rp ");
            int pembayaran = apik.nextInt();
            System.out.println("PENGEMBALIAN         \t: Rp " + (pembayaran - (harga6 * jumlah)));
        } else if (merk == 3 && jumlah >= 1) {

            System.out.println("\nHARGA @SEPATU        \t: Rp " + harga4 + " x " + jumlah);
            System.out.println("DISKON SEPATU          \t: Rp 0");
            System.out.println("TOTAL HARGA            \t: Rp " + harga4 * jumlah);
            System.out.print("\nPEMBAYARAN           \t: Rp ");
            int pembayaran = apik.nextInt();
            System.out.println("PENGEMBALIAN         \t: Rp " + (pembayaran - (harga4 * jumlah)));
        } else if (merk == 4 && jumlah >= 2) {

            System.out.println("\nHARGA @SEPATU        \t: Rp " + harga3 + " x " + jumlah);
            System.out.println("DISKON SEPATU          \t: Rp 0");
            System.out.println("TOTAL HARGA            \t: Rp " + harga3 * jumlah);
            System.out.print("\nPEMBAYARAN           \t: Rp ");
            int pembayaran = apik.nextInt();
            System.out.println("PENGEMBALIAN         \t: Rp " + (pembayaran - (harga3 * jumlah)));
        } else if (merk == 5 && jumlah >= 1) {

            System.out.println("\nHARGA @SEPATU        \t: Rp " + harga5 + " x " + jumlah);
            System.out.println("DISKON SEPATU          \t: Rp 0");
            System.out.println("TOTAL HARGA            \t: Rp " + harga5 * jumlah);
            System.out.print("\nPEMBAYARAN           \t: Rp ");
            int pembayaran = apik.nextInt();
            System.out.println("PENGEMBALIAN         \t: Rp " + (pembayaran - (harga5 * jumlah)));
        } else if (merk == 6 && jumlah >= 1) {

            System.out.println("\nHARGA @SEPATU        \t: Rp " + harga2 + " x " + jumlah);
            System.out.println("DISKON SEPATU          \t: Rp 0");
            System.out.println("TOTAL HARGA            \t: Rp " + harga2 * jumlah);
            System.out.print("\nPEMBAYARAN           \t: Rp ");
            int pembayaran = apik.nextInt();
            System.out.println("PENGEMBALIAN         \t: Rp " + (pembayaran - (harga2 * jumlah)));
        } else if (merk == 7 && jumlah >= 1) {

            System.out.println("\nHARGA @SEPATU        \t: Rp " + harga7 + " x " + jumlah);
            System.out.println("DISKON SEPATU          \t: Rp 0");
            System.out.println("TOTAL HARGA            \t: Rp " + harga7 * jumlah);
            System.out.print("\nPEMBAYARAN           \t: Rp ");
            int pembayaran = apik.nextInt();
            System.out.println("PENGEMBALIAN         \t: Rp " + (pembayaran - (harga7 * jumlah)));
        } else if (merk == 8 && jumlah >= 1) {

            System.out.println("\nHARGA @SEPATU        \t: Rp " + harga1 + " x " + jumlah);
            System.out.println("DISKON SEPATU          \t: Rp 0");
            System.out.println("TOTAL HARGA            \t: Rp " + harga1 * jumlah);
            System.out.print("\nPEMBAYARAN           \t: Rp ");
            int pembayaran = apik.nextInt();
            System.out.println("PENGEMBALIAN         \t: Rp " + (pembayaran - (harga1 * jumlah)));
        }

        System.out.println(
                "\n===== TERIMA KASIH TELAH BERBELANJA DI MOZA'S SHOES =====");

    }

    class Tanggal {

        private String getTanggal() {
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            Date date = new Date();
            return dateFormat.format(date);
        }

        private String getWaktu() {
            DateFormat dateFormat = new SimpleDateFormat("HH:mm");
            Date date = new Date();
            return dateFormat.format(date);
        }

    }
}
