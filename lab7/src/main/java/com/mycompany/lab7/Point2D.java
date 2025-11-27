/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab7;

/**
 *
 * @author johnh
 */
public class Point2D {
	double x_cor;
	double y_cor;
	
	public Point2D(double x, double y){
		x_cor=x;
		y_cor=y;
	}
	public void setX(double x) {
		x_cor=x;
	}
	public void setY(double y) {
		y_cor=y;
	}
	public double getX() {
		return x_cor;
	}
	public double getY() {
		return y_cor;
	}
	public double distance(Point2D p) {
		return Math.sqrt(Math.pow(x_cor-p.x_cor,2)+Math.pow(y_cor-p.y_cor,2));
	}
	public String toString() {
		return "x= "+ x_cor+", y_cor= "+y_cor;
		
	}
	public Point2D add(double dx, double dy) {
		return new Point2D(dx +x_cor, dy+y_cor);
	}
}