class Greaternum{
	int num1=234,num2=54;
	void CheckNum(){
		if(num1>num2)
		{
			System.out.println("num1 is greater "+num1);
		}
		else 
		{
			System.out.println("num2 is greater "+num2);
		}
	}
}
class Threenumgreat{
	int a=329,b=45,c=43;
	void CheckNumber() {
		if(a>b&&a>b) {
			System.out.println("num1 is greater number "+a);
		}
		else if(b>c) {
			System.out.println("num2 is greater number "+b);
		}
		else {
			System.out.println("num3 is gretaer number "+c);
		}
	}
}
class Three{
	int a=0,b=0,c=0;
	Three(int x,int y,int z){
		this.a=x;
		this.b=y;
		this.c=z;
	}
	void Num() {
		if(a>b&&a>c) {
			System.out.println("number 1 is greater ="+a);
		}
		else if(b>c) {
			System.out.println("number 2 is greater= "+b);
		}
		else {
			System.out.println("number 3 is greater= "+c);
		}
	}
}
public class MainClass {

	public static void main(String[] args) {
		Greaternum  g1=new Greaternum();
		g1.CheckNum();
		Threenumgreat th=new Threenumgreat();
		th.CheckNumber();
		Greaternum  g=new Greaternum();      //again call this functions with another objects
		g.CheckNum();
		Threenumgreat t=new Threenumgreat();
		t.CheckNumber();
		Three n1=new Three(234,565,3349);
		n1.Num();
		

	}

}
