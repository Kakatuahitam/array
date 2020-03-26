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
public class array_2 {
    public static void main(String[] args) {
        String[] group = {"kelas", "matkul", "ekskul"};
        
        group[2] = "null";
        
        for (String element : group){
            System.out.println(element);
        }
        
        System.out.println();
        int count = 0;
        for (String element : group){
            group[count] = group[count] + " onlen";
            count++;
            System.out.println(element);
            System.out.println(Arrays.toString(group));
        }
        
        
        System.out.println(Arrays.toString(group));
        // kira2 apa hasilnya?
        // sama apa beda apa print yang di loop?
        
    }
}
