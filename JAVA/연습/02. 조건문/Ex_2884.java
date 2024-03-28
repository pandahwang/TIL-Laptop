import java.util.Scanner;

public class Ex_2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int M = sc.nextInt();

        if(M<0){
            M=59;
            H-1;
        }
        if(H<0){
            H=23;
        }

        System.out.println('H'+'(M-45)');
        
    }
}
