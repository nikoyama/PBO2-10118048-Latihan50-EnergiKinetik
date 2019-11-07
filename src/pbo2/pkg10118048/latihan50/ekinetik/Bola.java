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
public class Bola {
    
    private double massa, kec;

    public Bola(double massa, double kec) {
        this.massa = massa;
        this.kec = kec;
    }
    
    public double getMassa() {
        return massa;
    }

    public double getKec() {
        return kec;
    }

    public double hitungEKinetik(double massa, double kec) {
        return (0.5 * massa * kec*kec);
    }
    
    public double hitungUsaha(double massa, double kec, double kecAwal) {
        return (0.5 * massa * (kec*kec - kecAwal*kecAwal));
    }
    
}
