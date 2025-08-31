package iuh.fit.se;

 /**
 * @description: My Introduction
 * @author: Dang Thanh Binh
 * @version: 1.0
 * @created: Aug 25, 2025 12:17:23 PM
 */
public class Rectangle {
	private double length;
	private double width;
	
	public Rectangle() {
		this(0.0, 0.0);
	}
	
	public Rectangle(double length, double width) {
		if(length < 0 || width < 0) {
			throw new IllegalArgumentException("Length and width must be greater than 0");
		}
		setLength(length);
		setWidth(width);
	}

	
	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		if(length < 0) {
			throw new IllegalArgumentException("Length must be greater than 0");
		}
		this.length = length;
	}

	
	public double getWidth() {
		return width;
	}

	
	public void setWidth(double width) {
		if(width < 0) {
			throw new IllegalArgumentException("Width must be greater than 0");
		}
		this.width = width;
	}
	
	public double getArea() {
		return length * width;
	}
	
	public double getPerimeter() {
		return (length + width) * 2;
	}

	@Override
	public String toString() {
		String a = String.format("%10.2f | %10.2f | %10.2f | %10.2f", length, width, getArea(), getPerimeter());
		return a;
	}
	
	
	
}
