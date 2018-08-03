//checks if two rectangles have same area or not
package com.cg.rectangletest;

import com.cg.rectangle.Rectangle;

public class RectangleTest {
public static void main(String args[])
{
	Rectangle rectangle_shape=new Rectangle();
	Rectangle rectangle_shape2=new Rectangle();
	
	if(rectangle_shape.area(rectangle_shape.getLength(), rectangle_shape.getBreadth())==rectangle_shape2.area(rectangle_shape2.getLength(), rectangle_shape2.getBreadth()))
	{
		System.out.println("Same area");
	}
	else	
	{
		System.out.println("Different area");
	}
}
}

