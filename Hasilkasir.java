/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challengekasir;

/** 
 *
 * @author TUF
 */
class kasir1 extends ChallengeKasir {

    private String apk1;

    public kasir1(String kategori, String jenis, String merk, String warna) {
        super(kategori, jenis, merk, warna);

    }

}

public class Hasilkasir {

    public static void main(String[] args) {
        Apkkasir cetak = new Apkkasir();
        cetak.apk();
    }

}
