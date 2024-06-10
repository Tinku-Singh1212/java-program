class Dayweek{
	void Ckeckday(int value) {
		switch(value) {
		case 1:System.out.println("sunday");break;
		case 2:System.out.println("monday");break;
		case 3:System.out.println("tuesday");break;
		case 4:System.out.println("wednesday");break;
		case 5:System.out.println("thrusday");break;
		case 6:System.out.println("friday");break;
		case 7:System.out.println("saturday");break;
		default :System.out.println("please enter 1 to 7  number");
		}
	}
}
class Checkweekday{
	void Weekday(int value) {
		String day=" ";
		day=switch(value) {
		case 1->"sunday";
		case 2->"monday";
		case 3->"tuesday";
		case 4->"wednesday";
		case 5->"thrusday";
		case 6->"friday";
		case 7->"saturday";
		default->"not a day enter again number";
		};
		System.out.println(day);
	}
}
public class Switch {

	public static void main(String[] args) {
		Dayweek d1=new Dayweek();
		d1.Ckeckday(4);
		d1.Ckeckday(5);
		d1.Ckeckday(7);
		d1.Ckeckday(9);
		Checkweekday d2=new Checkweekday();
		d2.Weekday(3);
		d2.Weekday(1);
		d2.Weekday(6);
		d2.Weekday(9);

	}

}
