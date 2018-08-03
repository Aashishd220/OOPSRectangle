//class calculating area and perimeter of rectangle
package com.cg.rectangle;

import java.util.*;

public class Rectangle {
	private int length, breadth;

	public Rectangle() {
		Scanner get = new Scanner(System.in);
		System.out.println("Enter length and bredth");
		int length = get.nextInt();
		int breadth = get.nextInt();
		this.length = length;
		this.breadth = breadth;

	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

	public int area(int length, int breadth) {// calculating area
		int rectangleArea = length * breadth;
		return rectangleArea;
	}

	public int perimeter(int length, int breadth) {// calculating perimeter
		int rectanglePerimeter = 2 * (length + breadth);
		return rectanglePerimeter;
	}
}
