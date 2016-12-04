/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicdesign;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class task7 {
    public static void main(String[] args) {
        int s = 5;
        int[][] array = new int[s][s]; 
        
        int i = 0; int j = 0; int k = 0;
        for (i = 0; i < s; i++)
            for (j = 0; j < s; j++) {
                array[i][j] = k;
                    k++;
            }
        for (i = 0; i < s; i++) {
            for (j = 0; j < s; j++) 
                System.out.print(array[i][j] + " ");
                System.out.print("\n");     
        }   System.out.println();
        
         for (i = 0; i < s; i++) {
            for (j = 0; j < s; j++) {
                int[][] array2 = new int[s][s];
                int n = 4;
                int p = s - n;
                System.arraycopy(array[i], 0, array2[i], p, n ); 
                System.arraycopy(array[i], n, array2[i], 0, p ); 
                System.out.print(array2[i][j]+" ");
            }   System.out.println(" ");
        }   System.out.println(" "); 
        
       for (i = 0; i < s; i++) {
            for (j = 0; j < s; j++) {
                int[][] array2 = new int[s][s];
                int n = 4;
                int p = s - n;
                System.arraycopy(array[j], 0, array2[j], p, n ); 
                System.arraycopy(array[j], n, array2[j], 0, p ); 
                System.out.print(array2[i][j]+" ");
            }   System.out.println(" ");
        }   System.out.println(" "); 
    }
}

//System.arraycopy(источник, 3, назначения, 2, 5) —
//будет скопировано 5 элементов из массива-источника в результирующий массив, начиная с 3-го индекса источника 
//во 2 индекс результирующего массива.

/*Реализовать приложение, которое производит операции циклического сдвига
над прямоугольным массивом (матрицей). Организовать методы, которые позволяют
произвести сдвиг:
● на n позиций влево
● на n позиций вправо
● на n позиций вверх
● на n позиций вниз*/