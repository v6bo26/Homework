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
import java.util.Random;
public class task2 {
    public static void main(String[] args) {
        Random randomGenerator = new Random();
            int randomInt = randomGenerator.nextInt(100);
            System.out.println("Случайное число: " + randomInt);
            
            if(randomInt < 10){
                int x = randomInt;
                switch(x){
                    case 0:{System.out.println("ноль");} break;
                    case 1:{System.out.println("один");} break;
                    case 2:{System.out.println("два");} break;
                    case 3:{System.out.println("три");} break;
                    case 4:{System.out.println("четыре");} break;
                    case 5:{System.out.println("пять");} break;
                    case 6:{System.out.println("шесть");} break;
                    case 7:{System.out.println("семь");} break;
                    case 8:{System.out.println("восемь");} break;
                    case 9:{System.out.println("девять");} break;
                }
            }else{
            if(randomInt < 20){
                int x = randomInt;
                switch(x){
                    case 10:{System.out.println("десять");} break;
                    case 11:{System.out.println("одиннадцать");} break;
                    case 12:{System.out.println("двенадцать");} break;
                    case 13:{System.out.println("тринадцать");} break;
                    case 14:{System.out.println("четырнадцать");} break;
                    case 15:{System.out.println("пятнадцать");} break;
                    case 16:{System.out.println("шестнадцать");} break;
                    case 17:{System.out.println("семнадцать");} break;
                    case 18:{System.out.println("восемнадцать");} break;
                    case 19:{System.out.println("девятнадцать");} break;
                }
            }else{
            if (randomInt < 100){
                int x = randomInt;
                int y = randomInt / 10;
                switch(y){
                    case 2:{System.out.print("двадцать ");} break;
                    case 3:{System.out.print("тридцать ");} break;
                    case 4:{System.out.print("сорок ");} break;
                    case 5:{System.out.print("пятьдесят ");} break;
                    case 6:{System.out.print("шестьдесят ");} break;
                    case 7:{System.out.print("семьдесят ");} break;
                    case 8:{System.out.print("восемьдесят ");} break;
                    case 9:{System.out.print("девяносто ");} break;
                }
                int z = randomInt % 10;
                switch(z){
                    case 1:{System.out.print("один");} break;
                    case 2:{System.out.print("два");} break;
                    case 3:{System.out.print("три");} break;
                    case 4:{System.out.print("четыре");} break;
                    case 5:{System.out.print("пять");} break;
                    case 6:{System.out.print("шесть");} break;
                    case 7:{System.out.print("семь");} break;
                    case 8:{System.out.print("восемь");} break;
                    case 9:{System.out.print("девять");} break;
                }
            }
        }
    }    
}
}

