
public class sumultipleTwist2 {

	public static void main(String[] args) {
		int b = 0, c = 0;
		long a = 1000, sum1 = 0, sum2 = 0, i;
		for (i=3; i<a; i++)
			if (i % 3 == 0) sum1 += i;
			else if (i % 5 == 0) sum2 += i;
		while (b == 0) {
				if (a % 3 == 0)
					sum1 += a;
				else if (a % 5 == 0)
					sum2 += a;
				if ((sum1 + sum2 > Integer.MAX_VALUE) && (c == 0)) {
					System.out.println("Int overflow for " + a);
					c++;

				}
				if (Long.MAX_VALUE - sum1 < sum2) {

					System.out.println("Long overflow for " + a);
					b++;
				}
			a++;
		}
	}
}