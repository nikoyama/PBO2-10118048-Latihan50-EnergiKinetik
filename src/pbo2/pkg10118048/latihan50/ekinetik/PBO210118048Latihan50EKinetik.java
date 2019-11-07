/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pbo2.pkg10118048.latihan50.ekinetik;

/**
 *
 * @author NIX
 * NAMA : Niko Yama
 * KELAS : PBO2
 * NIM : 10118048
 * Deskripsi program : menghitung energi kinetik bola dan usaha
 */
public class PBO210118048Latihan50EKinetik {

    public static void main(String[] args) {
        
        Bola bola = new Bola(0.145, 25);
        
        System.out.println("Diketahui Bola dengan : "
                + "\nMassa = 145 g --> " + bola.getMassa() + " kg"
                + "\nKecepatan = " + bola.getKec() + " m/s");
        System.out.println("Ditanyakan : "
                + "\na. Berapakah Energi Kinetiknya?"
                + "\nb. Berapakah usaha untuk mencapai kecepatan ini, jika dimulai dari keadaan diam?");
        System.out.println("Jawaban : ");
        System.out.printf("Energi Kinetik = 0,5 . m . v . v =  %.4f Joule%n"  ,
                bola.hitungEKinetik(bola.getMassa(), bola.getKec()));
        System.out.printf("Usaha = 0.5 . m .(v2.v2 - v1.v1) = %.4f Joule%n"  ,
                bola.hitungUsaha(bola.getMassa(), bola.getKec(), 0));
        System.out.println("\n*v1 = kecepatan awal & v2 = kecepatan akhir");
    }

}
