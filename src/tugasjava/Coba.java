/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasjava;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author acer
 */
public class Coba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Masukan inputan pertama adalah");
//        int x = input.nextInt(); //3
//
//        System.out.println("Masukan inputan kedua adalah");
//        int y = input.nextInt(); //6
//        
//        int[] z = incre( x, y);
//        for ( int a = x; a <=z.length; a++) {
//                System.out.print(z[a]);
//            }
//        int num1 = 3;
//        int num2 = 6;
//        System.out.println("hasil increment : " + increment(num1,num2));
        int [] value = Decrement(9, 1);
        //int[] value = Increment(3, 6);
//        for (int data : value)
//        {
//            System.out.print(data+" ");
//        }
//        System.out.println("");
        for (int i = 0; i < value.length; i++) {
            System.out.print(value[i]+" ");
        }
    }
    // masukkan 2 angka
    // dapatkan n increment / decrement
    // membuat array dengan data sebanyak n
//    int count = hasil.length;
//    
//    public static arrIncre[] inputIncre(int hasil)
//    {
//        for (int i = 0; i < count; i++) {
//            arrIncre[i] = hasil[i];
//        }
//        return arrIncre;
//    }
    // membuat array dengan tipe int methodnya increment tipe datanya num1, int num2 untuk menentukan increment dari dua angka
    public static int[] Increment(int num1, int num2)
    {
        int temp1=0;       //membuat tempat variabel penyimpanan sementara
       // if (num1<num2)
//        {
//            temp1=num1;             //isi daritemporarynya diinputkan nilai yg kecil 
//            temp2=num2;
//        }
//        else
//        {
//            temp1=num2;               num2 = 6
//            temp2=num1;               num1 = 2
//        }
if (num2<num1)
{
 temp1= num1;
 num1=num2;
 num2=temp1;
}
        
        int[] arrIncre = new int[num2-num1+1];        // membuat array bertipe int dgn nama arrIncre membuat array baru bertipe int dengan panjang array ....
        for (int i = 0; i < arrIncre.length; i++) {     //melakukan perulangan sebanyak panjang array
            arrIncre[i] = num1;                        // memasukkan nilai terkecil + 1 kedalam array
                          num1++;                    // diulang sampai False
        }
       // Arrays.sort(arrIncre);
        
        return arrIncre;
    }
    
      public static int[] Decrement(int num1, int num2)
    {
        int temp1=0;       //membuat tempat variabel penyimpanan sementara
       // if (num1<num2)
//        {
//            temp1=num1;             //isi daritemporarynya diinputkan nilai yg kecil 
//            temp2=num2;
//        }
//        else
//        {
//            temp1=num2;
//            temp2=num1;
//        }
if (num2>num1)
{
 temp1= num1;
 num1=num2;
 num2=temp1;
}
        
        int[] arrIncre = new int[num1-num2+1];        // membuat array bertipe int dgn nama arrIncre membuat array baru bertipe int dengan panjang array ....
        for (int i = 0; i < arrIncre.length; i++) {     //melakukan perulangan sebanyak panjang array
            arrIncre[i] = num1;                        // memasukkan nilai terkecil + 1 kedalam array
                          num1--;                    // diulang sampai False
        }
       // Arrays.sort(arrIncre);
        
        return arrIncre;
    }
    

}