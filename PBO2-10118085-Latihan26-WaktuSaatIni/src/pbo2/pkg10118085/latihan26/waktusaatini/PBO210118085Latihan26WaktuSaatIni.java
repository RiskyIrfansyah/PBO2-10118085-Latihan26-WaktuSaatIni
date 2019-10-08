/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118085.latihan26.waktusaatini;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author Risky Irfansyah
 * Nama     : Risky Irfansyah
 * Kelas    : PBO2
 * Nim      : 10118085
 *  * Deskripsi Program : Waktu Saat Ini
 */
public class PBO210118085Latihan26WaktuSaatIni {
    public static void main(String[] args) {
        Date date = new Date();
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE, d MMM Y H:m:s", new Locale ("id"));
        
        String hasil = dateFormat.format(date);
        System.out.println("Hari ini adalah hari : " + hasil);
    }
}

