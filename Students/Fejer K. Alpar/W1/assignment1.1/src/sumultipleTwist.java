import java.util.Scanner;
public class sumultipleTwist {
	public static Scanner userInput = new Scanner(System.in);
	public static void main(String[] args) {
		int a = userInput.nextInt();
		System.out.println("Sum of multiples of 3 or 5 below " + a +" is " + sum(a));
	}

	public static int sum(int a) {
	int i,sum=0;
	for (i=3; i<a; i++)
		if (i % 3 == 0 || i % 5 == 0) sum+=i;
	return sum;
	}
}