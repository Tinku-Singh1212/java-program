 

// example of command line argument 

public class Sumcmd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s=0;
		if(args.length>0) 
		{
			for(String num:args) 
			{
				s=Integer.parseInt(num)+s;
			}
			System.out.println("Sum="+s); 
		}
		else
		{
			System.out.println("Sum like: sum 10 20 30");
		}

	}

}
