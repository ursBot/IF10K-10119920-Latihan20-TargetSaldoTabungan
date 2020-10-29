/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if10k.pkg10119920.latihan20.targetsaldotabungan;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/**
 *
 * @author 
 * NAMA     : Umar Said Adi Pranoto
 * KELAS    : IF10K
 * NIM      : 10119920
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * jenis-jenis tipe data bilangan bulat
 */

public class TargetSaldoTabungan {

    static int akhir;
    static void hitung(int a, int b){
         akhir = (a + (a*b/100));
    }
    
    public static void main(String[] args) {
        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator('.');
        formatRp.setGroupingSeparator('.');

        kursIndonesia.setDecimalFormatSymbols(formatRp);
        
        int saldo = 3500000;
        int bunga = 8;
        int target = 6000000;
        
        for (int i = 1; i <= i; i++){
            hitung(saldo,bunga);
            System.out.println("Saldo di bulan ke-"+i+" " + kursIndonesia.format(akhir));
         saldo = akhir;
         if(akhir >= target)
             break;
        }
}