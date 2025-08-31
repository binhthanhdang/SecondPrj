package iuh.fit.se;

import java.util.Scanner;

/**
 * @description: My Introduction
 * @author: Dang Thanh Binh
 * @version: 1.0
 * @created: Aug 25, 2025 12:17:58 PM
 */
public class TestRectangle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Length: ");
		double length = input.nextDouble();
		System.out.print("Ennter Width: ");
		double width = input.nextDouble();
		
		Rectangle h1 = new Rectangle(length, width);
		String header = String.format("%-10s | %-10s | %-10s | %-10s", "Length", "Width", "Area", "Perimeter");
		System.out.println(header);
		System.out.println(h1);
		input.close();
	}
}
