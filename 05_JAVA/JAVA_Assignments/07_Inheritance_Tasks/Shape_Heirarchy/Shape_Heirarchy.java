package Shape_Heirarchy;

class Shape {

	public double getArea() {

		return 0;
	}

	public double getPerimeter() {

		return 0;
	}

}

class Circle extends Shape {

	double radius;

	public Circle(double radius) {

		this.radius = radius;
	}

	@Override
	public double getArea() {

		return Math.PI * radius * radius;
	}

	public double getPerimeter() {

		return 2 * Math.PI * radius;
	}

}

class Rectangle extends Shape {

	double length;
	double width;

	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	@Override
	public double getArea() {

		return length * width;
	}

	public double getPerimeter() {

		return 2 * (length + width);
	}

}

public class Shape_Heirarchy {

	public static void main(String[] args) {
		
		System.out.println("==================== Shape Heirarchy =====================");
		System.out.println();
		
		System.out.println("Circle : ");
		Circle c = new Circle(5.5);
		System.out.println("Area Of Circle : "+c.getArea());
		System.out.println("Perimeter Of Circle : "+c.getPerimeter());
		
		System.out.println();
		System.out.println();
		
		System.out.println("Rectangle : ");
		Rectangle r = new Rectangle(10, 5);
		System.out.println("Area Of Rectangle : "+r.getArea());
		System.out.println("Perimeter Of Rectangle : "+r.getPerimeter());

	}

}
