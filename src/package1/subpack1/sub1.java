/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package1.subpack1;
import package1.class1;
import package2.class2;
import package2.sub2.sub2;


/**
 *
 * @author NEW
 */
public class sub1 {
    public void show()
    {
        System.out.println("The content inside subpackage1");
    }
    public static void main(String args[]){
        class1 x=new class1();
        sub1 y=new sub1();
        class2 z=new class2();
        sub2 w=new sub2();
        x.display();
        y.show();
        z.present();
        w.expose();
        
    }
    
}
