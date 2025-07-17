package methodoverloading;

public class DrawingShape {
	void drawShape() {
		System.out.println("A Graphics Applicatipm suppoprs drawing different shapes");
	}

	void drawShape(double d) {
		System.out.println("Draw a Circle with Certain Radius");
	}

	void drawShape(double d, double s) {
		System.out.println("Draw a Rectangle with Certain Radius and Width");
	}

	void drawShape(long d) {
		System.out.println("Draw a Square with side Length");
	}

	public static void main(String[] args) {
		DrawingShape m = new DrawingShape();
		m.drawShape();
		m.drawShape(10.2);
		m.drawShape(10.23, 20.50);
		m.drawShape(20201215l);

	}
}
