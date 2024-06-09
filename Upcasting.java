package polymorphism;
class Area{
	int r,l,b;
	static void getArea() {
		System.out.println("for getting area");
	}
}
class Circle extends Area{
	void getArea(int r) {
		System.out.println("Area of circle="+(Math.PI*r*r));
	}
	static void getArea() {
		System.out.println("in circle");
	}
}
public class Upcasting {
    @SuppressWarnings("static-access")
	public static void main(String[] args){
    	Area a1=new Area();
    	a1.getArea();
    	Circle c1=new Circle();
    	c1.getArea(4);
    	
    }
}
