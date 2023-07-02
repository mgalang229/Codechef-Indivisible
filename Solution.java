import java.util.Scanner;

//change class to 'Main'
public class Solution {

	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		int T = 1;
		T = fs.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int a = fs.nextInt(), b = fs.nextInt(), c = fs.nextInt();
			for (int i = 1; i < 100; i++) {
				if (a % i != 0 && b % i != 0 && c % i != 0) {
					System.out.println(i);
					break;
				}
			}
		}
		fs.close();
	}
}
