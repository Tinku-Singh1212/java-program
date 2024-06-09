package polymorphism;
class Shape{
	void draw()
	{
		System.out.println("Drawing a shape");
	}
	void erase() {
		System.out.println("erasing a shape");
	}
}
class Circlec extends Shape{
	void draw() {
		System.out.println("Drawing a circle");
	}
	
	void erase() {
		System.out.println("Erasing a circle");
	}
}
class Triangle extends Shape{
	void draw() {
		System.out.println("Drawing a triangle");
	}
	
	void erase() {
		System.out.println("Erasing a triangle");
	}
}
class Square extends Shape{
	void draw() {
		System.out.println("Drawing a square");
	}
	
	void erase() {
		System.out.println("Erase a square");
	}
}
public class MainShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s1=new Circlec();
		Shape s2=new Triangle();
		Shape s3=new Square();
		s1.draw();
		s1.erase();
		s2.draw();
		s2.erase();
		s3.draw();
		s3.erase();

	}

}
