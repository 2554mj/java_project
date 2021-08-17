package 상속;

public class GiantBabyUser {

	public static void main(String[] args) {
	GiantBaby gb = new GiantBaby();
	gb.name = "cuty";
	gb.age = 1;
	gb.weight = 10;
	gb.young = true;
	
	System.out.println(gb);

	gb.growth();
	gb.protect();
	gb.tool();
	gb.think();
	}
}
