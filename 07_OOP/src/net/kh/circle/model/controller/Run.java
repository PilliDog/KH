package net.kh.circle.model.controller;

import net.kh.circle.model.Circle;

public class Run {

	public static void main(String[] args) {
		
		Circle start = new Circle();
		
		start.getAreaOfCircle();
		start.getSizeOfCircle();
		
		start.incrementField();
		
		start.getAreaOfCircle();
		start.getSizeOfCircle();

	}

}
