/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1;

import java.util.Scanner;
import labprogram4.currencyconverter;



/**
 *
 * @author NEW
 */
public class conversion {
     double dollar,euro,yen,rupee1;
     currencyconverter obj3=new currencyconverter();
     Scanner obj=new Scanner(System.in);
     public double dollar()
     {
         System.out.println("enter the amount in rupee");
        
         obj3.rupee=obj.nextDouble();
       
         System.out.println("given rupee "+obj3.rupee+" is converted dollar");
         return dollar=obj3.rupee/70;
     }
    public double euro()
     {
       
         System.out.println("given rupee "+obj3.rupee+" is converted euro");
        return euro=obj3.rupee/80;
     }
    public double yen()
     {
       System.out.println("given rupee "+obj3.rupee+" is converted yen"); 
       return yen=obj3.rupee/0.63;  
     }
    public double rupee1()
     {
         System.out.println("conversion of dollar "+dollar+"into rupee ");
         return rupee1=dollar*70;
     }
    public double rupee2()
     {
         rupee1=0;
         System.out.println("conversion of euro "+euro+"into rupee ");
         return rupee1=euro*80;
         
     }
    public double rupee3()
     {
        rupee1=0;
        System.out.println("conversion of yen "+yen+"into rupee ");
        return rupee1=yen*0.63;
         
     }
       
    public static void main(String args[]){
      
    }
}
    
       
        
        
    
    

