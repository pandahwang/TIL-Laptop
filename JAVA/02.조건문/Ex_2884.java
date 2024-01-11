import java.util.Scanner;

class Ex_2884{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int M = sc.nextInt();

        int setH = H;
        int setM = M - 45;

        if (setM<0){
            setM += 60;
            setH = setH - 1;
            if(setH<0){
                setH = setH + 24;
            }
        }
        System.out.printf("%d %d" , setH, setM);
    }
}

//초기값, 대입하는 값 주의!!!