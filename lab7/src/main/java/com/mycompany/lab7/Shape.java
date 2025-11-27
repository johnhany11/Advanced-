/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab7;

/**
 *
 * @author johnh
 */
public abstract class Shape {

    private Point2D start;

    public Shape(Point2D start) {
        this.start = start;
    }

    public final Point2D getStart() {
        return start;
    }

    public final void setStart(Point2D p) {
        start = p;
    }

    public abstract void draw();

}



class Line extends Shape {

    private Point2D end;

    public Line(Point2D start, Point2D end) {
        super(start);
        this.end = end;
    }

    public final Point2D getEnd() {
        return end;
    }

    @Override
    public final void draw() {
        System.out.println("Drawing Line");
        System.out.println("Start " + this.getStart());
        System.out.println("End " + this.end);
    }
}