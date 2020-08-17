/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package2;
import package1.class1;
import package1.subpack1.sub1;
import package2.sub2.sub2;

/**
 *
 * @author NEW
 */
public class class2 {
    public void present()
    {
        System.out.println("The content inside package 2");
    }
    public static void main(String args[]){
        class1 obj=new class1();
        sub1 obj1=new sub1();
        class2 obj2=new class2();
        sub2 obj3=new sub2();
        obj.display();
        obj1.show();
        obj2.present();
        obj3.expose();
    }
    }
    

