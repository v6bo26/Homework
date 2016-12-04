/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicdesign;

import java.util.Random;
/**
 *
 * @author User
 */
public class task5 {
    public static void main (String[] args){
        int n=5;
        int m=5;
        int[][] array = new int[n][m];
       
        int i;
        int j;
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                array[i][j]= new Random().nextInt(100);
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        } System.out.println();
        
        for(i = n - 1; i >= 0; i--){
            for(j = m - 1; j >= 0; j--){
                System.out.print(array[i][j]+" ");
            }
            System.out.println(" ");   
        } System.out.println("");
        
        int sum = 0;
        for(i = 0; i < n; i++){
            for(j = 0; j < m; j++){
                if(i%2==0){
                    if(array[i][j]%2==0){
                    System.out.println("Четные элементы массива каждой четной строки: " + array[i][j]);
                        if (array[i][j]%7==0){
                            sum = sum+array[i][j];
                            System.out.println("Сумма всех элементов, кратных 7 в четных строках: " + sum);
                        }
                    }
                }
            }
        } System.out.println("");

        int prod = 1;
        for(i = 0; i < n; i++){
            for(j = 0; j < m; j++){
                if(j%2-1==0){
                    if(array[i][j]%2-1==0){
                    System.out.println("Нечетные элементы массива каждого нечетного столбца: " + array[i][j]);
                        if (array[i][j]%3==0){
                            prod = prod*array[i][j];
                            System.out.println("Произведение элементов, кратных 3 в нечетных строках: " + prod);
                        }
                    }
                }
            }
        } 
    }
}


/*Создать двумерный массив m на n элементов, заполнить его случайными
числами. Реализовать методы, позволяющие:
● распечатать массив в прямом и обратном порядке
● для каждой четной строки вывести все четные элементы массива
● для каждого нечетного столбца вывести все нечетные элементы массива
● сумму всех элементов, кратных 7 в четных строках
● произведение элементов, кратных 3 в нечетных строках*/