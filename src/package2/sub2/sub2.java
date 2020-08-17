/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package2.sub2;
import package1.class1;
import package1.subpack1.sub1;
import package2.class2;

/**
 *
 * @author NEW
 */
public class sub2 {
    public void expose()
    {
        System.out.println("the content inside subpackage2");
    }
    public static void main(String args[]){
        class1 a=new class1();
        sub1 b=new sub1();
        class2 c=new class2();
        sub2 d=new sub2();
        a.display();
        b.show();
        c.present();
        d.expose();
        
        
    }
    
}
