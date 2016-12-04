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
public class task1 {
    public static void main(String[] args) {
        System.out.println("Сумма чисел кратных 2 = "+print(2));
        System.out.println("Сумма чисел кратных 3 = "+print(3));
        System.out.println("Сумма чисел кратных 5 = "+print(5));
        System.out.println("Сумма чисел кратных 7 = "+print(7));
        System.out.println("Разность сумм последовательности чисел, кратных 7 и 2 = "+(print(7)-print(2)));
        double otn = (double) print(3)/print(5);
        System.out.println("Отношение последовательности чисел, кратных 5 к последовательности чисел, кратных 3:" + otn);	
    }
    static int print(int z){
        int x = 0;
        for(int i = 0; i < 100; i++){
            if(i%z == 0){
            x = x + i;
                System.out.print(i+" ");
            }
        } 
        System.out.println("");
        return x;
    } 
}