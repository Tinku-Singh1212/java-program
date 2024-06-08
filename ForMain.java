class Forexample{
	//int data[]=new int[100];
	//int data[]=new int[] {58,315,1654,54,8,848,84,8,8,84848,88,8,888,4854,8448,448,9870};
	int data[]= {5,54,9,9,8,6,3,1};
	void display() {
		for(int i=0;i<data.length;i++) {
			System.out.println("value= "+data[i]);
		}
	}
}
public class ForMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Forexample f1=new Forexample();
     f1.display();
	}

}
