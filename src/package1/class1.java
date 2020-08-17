/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package1;
import package1.subpack1.sub1;
import package2.class2;
import package2.sub2.sub2;

/**
 *
 * @author NEW
 */
public class class1 {
    public void display()
    {
        System.out.println("The content Inside package 1");
    }
    public static void main(String args[]){
        class1 k=new class1();
        sub1 a=new sub1();
        class2 v=new class2();
        sub2 i=new sub2();
        k.display();
        a.show();
        v.present();
        i.expose();
        
        
    }
    
}
