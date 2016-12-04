/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicdesign;
/**
 *
 * @author User
 */
public class task6 {
    public static void main(String[] args) {
        int[][] array = new int[5][];
        for (int i = 0; i < array.length; i++){
        array[i] = new int[i+1];
        }
        int max = array[array.length-1].length;
        
        for (int i = 0; i< array.length; i++){
            for (int t = 0; t < max -array[i].length; t++){
                System.out.print("  ");
            }
            for (int j = 0; j < array[i].length; j++){
                System.out.print(" " + array[i][j]);
            }
            System.out.println();
        }
      
        for (int i = array.length-1; i>=0; i--){
            for (int t = 0; t < max -array[i].length; t++){
                System.out.print("  ");
            }
            for (int j = 0; j < array[i].length; j++){
                System.out.print(" " + array[i][j]);
            }
            System.out.println();
        }
    }
}

/*Используя циклические конструкции и массивы создать “рваный массив”
треугольной формы, реализовать вывод данного массива в виде треугольника в
консоль. Реализовать методы, отражающие данный “треугольник”
● по горизонтали
● по вертикали
● по горизонтали и вертикали одновременно*/