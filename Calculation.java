class Sum{
//	int num1=10,num2=20;
//	void getSum() {
//		int s=num1+num2;
//		System.out.println("sum="+s);
//	}
	int num1=0,num2=0;
	Sum(int num1,int num2){
		this.num1=num1;
		this.num2=num2;
	}
	void getSum() {
		int s=num1+num2;
		System.out.println("sum="+s);
	}
}
class Mul{
	int num1=0,num2=0;
	Mul(int n1,int n2){
		this.num1=n1;
		this.num2=n2;
	}
	void getMul() {
		int m=num1*num2;
		System.out.println("multiply="+m);
	}
}
class Sub{
	int num1=20,num2=10;
	void getSub() {
		int s2=num1-num2;
		System.out.println("subtraction="+s2);
	}
}
class Div{
	int num1=35,num2=7;
	void getDiv() {
		int d=num1/num2;
		System.out.println("division ="+d);
	}
}
public class Calculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sum s1=new Sum(32,56);
		s1.getSum();
		Mul m=new Mul(32,45);
		m.getMul();
		Sub s2=new Sub();
		s2.getSub();
		Div d2=new Div();
		d2.getDiv();
	}

}
