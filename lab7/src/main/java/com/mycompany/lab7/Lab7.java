/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab7;
import java.util.Arrays;
/**
 *
 * @author johnh
 */
public class Lab7 {

    public static void main(String[] args) {
        
        Rectangle[] rects = {
                new Rectangle(new Point2D(5, 1), 3, 4),
                new Rectangle(new Point2D(2, 8), 4, 2),
                new Rectangle(new Point2D(2, 3), 6, 5),
                new Rectangle(new Point2D(9, 0), 1, 1)
        };

        Arrays.sort(rects); 

        for (Rectangle r : rects) {
            r.draw();
        }
        
        
        Moveable[] movArr = {
        new Rectangle(new Point2D(1, 2), 4, 5),
        new Ellipse(new Point2D(3, 3), 6, 2),
        new Rectangle(new Point2D(0, 0), 2, 2)
};
        for (Moveable m : movArr) {
    m.move(1, -1);  
}
      
       
        
        
        for (Moveable m : movArr) {
    ((Shape) m).draw();    
}
        
        
Shape[] shapes = {
        new Rectangle(new Point2D(1, 1), 4, 5),
        new Ellipse(new Point2D(5, 2), 6, 3),
        //new Line(new Point2D(0, 0), new Point2D(3, 3))
};


for (Shape s : shapes) {
    if (s instanceof Moveable) {
        ((Moveable) s).move(2, -1);   // arbitrary movement
    }
}

System.out.println("Drawing all shapes:");
for (Shape s : shapes) {
    s.draw();
}
  Arrays.sort(shapes); 
}
 
   
}

