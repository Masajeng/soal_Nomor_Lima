/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasjava;

import java.util.Scanner;

/**
 *
 * @author acer
 */
public class TugasJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        System.out.println("MASUKAN PILIHANMU \n 1.increment \n 2.decrement ");
        Scanner mys = new Scanner(System.in);
        int pilihan = mys.nextInt();
       // int c = 0;
        switch (pilihan) {
            case 1:
                increment();
                //System.out.println("Hasilnya : "+ increment(c));
                break;
            case 2:   
                decrement();
                //System.out.println("Hasilnya : "+ decrement(c));
                break;
            default:
                System.out.println("Pilihanmu");

        }
    }
    
    
    //Scanner : untuk menerima inputan dari user
    public static int increment() {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukan inputan pertama adalah");
        int x = input.nextInt(); //3   menerima inputan dari variabel x

        System.out.println("Masukan inputan kedua adalah");
        int y = input.nextInt(); //6
        
        int i;
        int x2;
        if (x > y) {
            x2 = y;
            y = x;
            for (i = x2; i <= y; i++) {
                System.out.print(i + ","); 
            }
        } else {
            for (i = x; i <= y; i++) {
                System.out.print(i +",");
            }
        }
        return i;
    }

    public static int decrement() {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukan inputan pertama adalah");
        int x = input.nextInt();

        System.out.println("Masukan inputan kedua adalah");
        int y = input.nextInt();
        
        int x2;
        int i;
        
        if (x<y){
            x2 = y;
            y=x;
          for ( i= x2; i>= y; i--) {
              System.out.print(i+ ',');
        }
          
        } else {
          for ( i = x; i>= y; i--) {
              System.out.print(i+',');
        }
          
    }
        return i;
       
    }
}