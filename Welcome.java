class Sumnumber{
	int num1=25,num2=363;
	void Sum() {
		int s=num1+num2;
		System.out.println("the sum of two numbers="+s);
	}
}
class Add{
	int num1=0,num2=0;
	Add(int n1,int n2) {   //function name
		this.num1=n1;
		this.num2=n2;     //this keyword is denote the outside the variable in class and connect the n1 to num1 
	}
	void Addnumber() {     //constructor name
		int a=num1+num2;
		System.out.println("the sum of two numbers is="+a);
	}
}
public class Welcome {

	public static void main(String[] args) {
		System.out.println("hello world");
        int num1=10;
        int num2=20;
        int sum=num1+num2;
     System.out.println("sum="+sum);
     Sumnumber s=new Sumnumber();
     s.Sum();
     Add a1=new Add(23,45);  // class name
     a1.Addnumber();     // constructor name calling
	}

}
