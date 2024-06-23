package inheritance;
class Animal{
	String name;
	void cat() {
		System.out.println("eating");
	}
}
class Cat extends Animal{
	void sound() {
		System.out.println("meow");
	}
	Cat(String name){
		super.name=name;    //constructor is making own in the cat class
		super.name=name;
	}
	
	void cat() {
		System.out.println("cat eating");
	}
}
public class Animalmain {

	public static void main(String[] args) {
      Cat c1=new Cat("Cat");
      c1.cat();
      c1.sound();
      Animal a1=new Animal();
      a1.cat();
	}

}
