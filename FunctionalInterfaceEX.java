package java8;
interface Sum{
	void add();
	float PI=3.14f;
	
	default void display() {
		System.out.println("Default method in interface");
		
	}
	
	static void displaystatic(){
		System.out.println("Static method in Interface");
		displayPrivate();
	}
	
	private static void displayPrivate() {
		System.out.println("Private method in Interface");
	}
}
class Calc implements Sum{

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("This is add method");
	}
	
}
@FunctionalInterface
interface Mul{
	void multiply();
}

public class FunctionalInterfaceEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Calc c=new Calc();
            c.display();
            Sum.displaystatic();
            
            Mul m=()->System.out.println("This is Mul Interface");
            m.multiply();
            Mul m1=()->{
            	System.out.println("This is M1 mul Interface");
            	System.out.println("My Name is tinku singh lodhi");
            };
            m1.multiply();
            
	}

}
