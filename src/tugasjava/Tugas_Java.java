/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasjava;

/**
 *
 * @author acer
 */
public class Tugas_Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] value = getDecrement(9,2);
       // int[] value = getIncrement(3, 6);

        for (int i = 0; i < value.length; i++) {
            System.out.print(value[i] + " ");
        }
    }

    /**
     * membuat array dengan tipe int dengan nama method getIncrement
     * @param num1 memasukan angka increment pertama 
     * @param num2 memasukan angka increment kedua
     * @return int
     */ 
    public static int[] getIncrement(int num1, int num2) {  //num1= 2 num2= 8
        int temp1;
        if (num2 < num1) {
            temp1 = num1;
            num1 = num2;
            num2 = temp1;
        }
        int[] arrIncre = new int[num2-num1+1];         
        for (int i = 0; i < arrIncre.length; i++) {     
            arrIncre[i] = num1;                       
                          num1++;                   
        }
   
        return arrIncre;
    }
       
     /**
     * membuat array dengan tipe int dengan nama method getDecrement
     * @param num1 memasukan angka decrement pertama 
     * @param num2 memasukan angka decrement kedua
     * @return int
     */ 
    public static int[] getDecrement(int num1, int num2) {  //num1= 9 num 2
       int temp1;
       if (num2>num1)
            {
             temp1=num1;
             num1=num2;
             num2=temp1;
            }

        int[] arrDecre = new int[num1-num2+1];        
        for (int i = 0; i < arrDecre.length; i++) {     
            arrDecre[i] = num1;                        
                          num1--;                    
        }
        return arrDecre;
    }
}
