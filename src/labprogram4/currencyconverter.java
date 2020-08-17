/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labprogram4;
import java.util.Scanner;
import pack1.conversion;


/**
 *
 * @author NEW
 */
public class currencyconverter {
    public double rupee;
    public static void main(String args[]){
        conversion obj2=new conversion();
        Scanner obj=new Scanner(System.in);
        System.out.println("currency conversion");
        System.out.println( obj2.dollar());
        System.out.println(obj2.euro());
        System.out.println(obj2.yen());
        System.out.println("vice versa");
        System.out.println(obj2.rupee1());
        System.out.println(obj2.rupee2());
        System.out.println(obj2.rupee3());
       
    }
    }
    

