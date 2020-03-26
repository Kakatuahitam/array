/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kelas_2e.array_;

import java.util.Arrays;

/**
 *
 * @author Yuda Kurnia NF
 */
public class array_intro {
    public static void main(String[] args) {
        String[] hewan;
        //hewan = {"sapi", "kambing", "lalat", "kelinci", "ulat"};
       
        int nomor;
        nomor = 9;
        
        hewan = new String[5];
        //hewan[5] = "sapi";
        hewan[4] = "sapi";
        
        System.out.println(hewan);
        System.out.println(Arrays.toString(hewan));
        System.out.println(hewan[4]);
        System.out.println(hewan[0]);
        //System.out.println(hewan[5]);
        
        int[] angka = {10, 11, 12, 13, 14, 15};
        
        System.out.println(angka);
        System.out.println(Arrays.toString(angka));
        System.out.println(angka.length);
        
        for (int element : angka){
            System.out.println(element);
        }
        
        System.out.println(angka[2+1]);
        
        int[] koleks = {4,5,2,1,3,0,7,6};
        
        for(int e : koleks){
            System.out.println(koleks[e]);
        }
        
        System.out.println(koleks.length);
    }
}
