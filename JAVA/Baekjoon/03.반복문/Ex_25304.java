import java.util.Scanner;
public class Ex_25304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int N = sc.nextInt();
        int a [] = new int[N];
        int b [] = new int[N];
        int sum = 0;

        for (int i = 0; i < N; i++){
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            sum = sum + (a[i]*b[i]);
        }
        boolean check = X == sum;
        if(check == true){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    } 
}
