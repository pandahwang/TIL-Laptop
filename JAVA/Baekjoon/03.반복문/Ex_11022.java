import java.util.Scanner;

public class Ex_11022 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		int[] A = new int[T];
		int[] B = new int[T];
		for(int i=0; i<T; i++) {
			String[] str = sc.nextLine().split(" ");
			A[i] = Integer.parseInt(str[0]);
			B[i] = Integer.parseInt(str[1]);
			System.out.printf("Case #%d: %d + %d = %d%n", i+1, A[i], B[i], A[i]+B[i]);
		}
	}
}
