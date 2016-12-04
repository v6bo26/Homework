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
public class task4 {
    public static void main(String[] args) {
        int array[] = new int[5] ;  
        int i;
        for (i = 0; i < array.length; i++){
            array[i] = (int)(Math.random()*100); 
            System.out.print(array[i] + " ");
        } System.out.println("");
        
        for (i = array.length-1; i>=0; i--){
            System.out.print(array[i] + " ");
        }System.out.println();
        
        for (i = 0; i < array.length; i++){
            if(array[i]%2==0) System.out.println("четные элементы массива " + array[i] + " ");
        } System.out.println("");
        
        for (i = 0; i < array.length; i++){
            if(array[i]%2-1==0) System.out.println("нечетные элементы массива " + array[i] +" ");
        } System.out.println("");
        
        System.out.println("Сумма чисел кратных 7 = "+ S());
        System.out.println("Произведение элементов кратных 3 = "+ F());
    } 
    
    static int S(){
        int x = 0;
        for(int i = 1; i < 100; i++){
            if(i%7 == 0){
            x = x + i;
                System.out.print(i+" ");
            }
        } 
        System.out.println("");
        return x;
    } 
    static int F(){
        int x = 1;
        for(int i = 1; i < 100; i++){
            if(i%3 == 0){
            x = x * i;
                System.out.print(i+" ");
            }
        } 
        System.out.println("");
        return x;
    } 
    
}

/* Создать одномерный массив на n элементов, заполнить его случайными
числами. Реализовать методы, позволяющие:
● вывести все элементы массива в прямом и обратном порядке
● вывести все четные элементы массива
● вывести все нечетные элементы массива
● сумму элементов, кратных 7
● произведение элементов, кратных 3 */