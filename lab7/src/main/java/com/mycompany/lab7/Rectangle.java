/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab7;

/**
 *
 * @author johnh
 */
class Rectangle extends Shape implements Moveable,Comparable<Shape> {

    private double l, w;

    public Rectangle(Point2D start, double l, double w) {
        super(start);
        this.l = l;
        this.w = w;
    }

    public final double getLength() {
        return l;
    }

    public final double getWidth() {
        return w;
    }

    @Override
    public final void draw() {
        System.out.println("Drawing Rectangle");
        System.out.println("Start " + this.getStart());
        System.out.println("Length = " + this.l);
        System.out.println("Width = " + this.w);
    }

    @Override
    public void move(double dx, double dy) {
        //move the start point of the Rectangle
    }

    @Override
public int compareTo(Shape o) {

    // Compare x-coordinate first
    if (this.getStart().x_cor > o.getStart().x_cor) {
        return 1;
    } 
    else if (this.getStart().x_cor < o.getStart().x_cor) {
        return -1;
    }

    // If x is equal → compare y
    else
    {
    if (this.getStart().y_cor > o.getStart().y_cor) {
        return 1;
    }
    if (this.getStart().y_cor < o.getStart().y_cor) {
        return -1;
    }

    // Both x and y equal → rectangles are equal in sorting
    return 0;
    }
}

}
