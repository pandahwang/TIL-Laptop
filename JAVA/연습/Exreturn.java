import java.util.Arrays;

public class Exreturn {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        int[] array2 = new int[3];
        System.out.println("array: " + Arrays.toString(array));
        array2 = copy(array);
        System.out.println("array2: " + Arrays.toString(array));
    }
            //int[]가 참조형 반환타입. 'int[] arr' 이 참조형 매개변수.
    public static int[] copy(int[] arr) {
        int [] tmp = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            tmp[i] = arr[i];
        }
        System.out.println("tmp: " + Arrays.toString(tmp));
        return tmp;
    }
}

