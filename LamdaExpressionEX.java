package java8;

@FunctionalInterface
interface SumNumber{
	void add(int n1,int n2);
}
@FunctionalInterface
interface Div{
	int division(int n1,int n2);
}
public class LamdaExpressionEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       SumNumber s1=(n1,n2)->System.out.println("Sum= "+(n1+n2));
       s1.add(64, 65);
       SumNumber s2=(n1,n2)->{
    	   System.out.println("Sum= "+(n1+n2));
    	   int s=87+65;
    	   System.out.println("Sum= "+(s));
    	   int x=num1,num2;
    	   System.out.println("Sum= "+(num1+num2));
       };
       s2.add(88, 560);
	}

}
