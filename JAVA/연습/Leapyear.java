package 연습;
import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        boolean leapYear;
        int year = sc.nextInt();
        
        if(year%4==0 || year%4==0 && year%100==0 && year%400==0){
            leapYear = true;
            System.out.println("윤년입니다. 2월이 29일까지 있습니다.");
        }
    
        else {
        leapYear = false;
        System.out.println("평년입니다. 2월이 28일까지 있습니다.");
        }
    }
}
