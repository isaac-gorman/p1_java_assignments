
public class DecimalValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y;
		int answer;
		double z;
		
		x = 10;
		y = 13;
		z = (double) x/ (double) y;
		answer = (int) Math.round(z * 2);
		
		System.out.println("value of z: " + z);
		System.out.println("");
		System.out.println("value of answer: " + answer);
	}

}
