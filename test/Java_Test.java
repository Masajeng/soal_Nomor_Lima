/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import tugasjava.Coba;
import tugasjava.Tugas_Java;

/**
 *
 * @author acer
 */
public class Java_Test {
    
    public Java_Test() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void getIncrement() {
        
         int [] incre = Tugas_Java.getIncrement(3, 10);
         int [] expe = {3,4,5,6,7,8,9,10};
             Assert.assertArrayEquals(expe,incre);
             
         int [] angka = Tugas_Java.getIncrement(-3, 6);
         int [] exp = {-3,-2,-1,0,1,2,3,4,5,6};
             Assert.assertArrayEquals(exp,angka);
             
         int [] coba = Tugas_Java.getIncrement(-3, -6);
         int [] expt = {-6,-5,-4,-3};
             Assert.assertArrayEquals(expt,coba);
    }
     @Test
     public void getDecrement() {
         int [] decre = Tugas_Java.getDecrement(3, 10);
         int [] expe = {10,9,8,7,6,5,4,3};
             Assert.assertArrayEquals(expe,decre);
             
         int [] input = Tugas_Java.getDecrement(-3, 6);
         int [] exp = {6,5,4,3,2,1,0,-1,-2,-3};
             Assert.assertArrayEquals(exp,input);
         
         int [] dec = Tugas_Java.getDecrement(9, 2);
         int [] expt = {9,8,7,6,5,4,3,2};
             Assert.assertArrayEquals(expt,dec);
             
    }

}
