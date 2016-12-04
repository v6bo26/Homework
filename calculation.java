/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basictypes;

/**
 *
 * @author User
 */
public class calculation {
    public static void main(String[] args) {
        float pi = 3.14f;
        int r = 3;
        System.out.println("длина окружности C=2pir=" + 2*pi*r);
        System.out.println("площадь окружности S=pir^2=" + pi*r*r);
        int R = 8; 
        System.out.println("площадь кольца S=pi(R^2-r^2=)" + pi*(Math.pow(R,2) - Math.pow(r,2)));
        
        int h = 9;
        int a = 12;
        int b = 14;
        int c = 19;
        System.out.println("площадь треугольника S=(bh)/2=" + b*h/2);
        System.out.println("периметр треугольника p=1/2(a+b+c)=" + (a+b+c)/2);
        
        System.out.println("периметр прямоугольника P=(a+b)=" + (a+b));
        System.out.println("площадь прямоугольника S=ab=" + a*b);
        
        int H = 4;
        System.out.println("площадь боковой поверхности цилиндра Sбок=2pirH=" + 2*pi*r*H);
        System.out.println("объем цилиндра V=pir^2H=" + pi*Math.pow(r,2)*H);
        int r1 = 1;
        int r2 = 15;
        if(r2>r1){
            System.out.println("объем полого цилиндра V=piH(r2^2 - r1^2)=" + pi*H*r2*r2*r1*r1);
        }else{
            System.out.println("Невозможно вычислить объем полого цилиндра");
        }
        
        System.out.println("площадь поверхности шара S=4piR^2=" +4*pi*Math.pow(R,2));
        System.out.println("объем шара V=4piR^3/3=" + 4*pi*Math.pow(R,3)/3);
        
        System.out.println("объем поверхности прямоугольного параллелепипеда V=abc=" + a*b*c);
        System.out.println("площадь поверхности прямоугольного параллелепипеда S=2(ab+bc+ac)=" + 2*(a*b+b*c+a*c));
        
        System.out.println("площадь поверхности тетраэдра S=a^2*3^(1/2)=" + Math.pow(a,2)*Math.sqrt(3));
        System.out.println("объем поверхности тетраэдра V=a^3*2^(1/2)/12=" + Math.pow(a,3)*Math.sqrt(2)/12);
    }
}
